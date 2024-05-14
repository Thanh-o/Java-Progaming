package ordermanager.model;

import ordermanager.connectDTB.MySqlConnect;
import ordermanager.entity.Entity;

import java.lang.reflect.Field;
import java.sql.*;

import static javax.swing.UIManager.get;


public class EntityDAOImpl implements EntityDAO{
    public static Connection connection;
    public static Connection openConnection() throws SQLException {
        connection = MySqlConnect.getMySQLConnection();
        return connection;
    }
    public static PreparedStatement pstm;
    public static PreparedStatement openPrepareStatement(String query) throws SQLException{
        pstm = openConnection().prepareStatement(query);
        return pstm;
    }
    public static void exUpdate() throws SQLException{
        pstm.executeUpdate();
    }
    public static ResultSet exQuery()throws SQLException{
        ResultSet rs = pstm.executeQuery();
        return rs;
    }
    @Override
    public boolean insert(Entity entity) throws SQLException, IllegalAccessException {
        String tableName = getTableName(entity.getClass());

        StringBuilder queryBuilder = new StringBuilder("INSERT INTO ");
        queryBuilder.append(tableName).append(" (");
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                queryBuilder.append(", ");
            }
            queryBuilder.append(fields[i].getName());
        }
        queryBuilder.append(") VALUES (");
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                queryBuilder.append(", ");
            }
            queryBuilder.append("?");
        }
        queryBuilder.append(")");//INSERT INTO TABLE_NAME(...) VALUES(?,?...)
        PreparedStatement statement = openPrepareStatement(queryBuilder.toString());
        int parameterIndex = 1;
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(entity);
            statement.setObject(parameterIndex++, value);
        }
        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0;

    }
    private String getTableName(Class<?> entityClass) {
        String tableName = entityClass.getSimpleName();
        return tableName;
    }

    @Override
    public boolean update(Entity entity) throws SQLException, IllegalAccessException {
        String tableName = getTableName(entity.getClass());
        StringBuilder queryBuilder = new StringBuilder("update ");
        queryBuilder.append(tableName).append(" set ");
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 1; i < fields.length; i++) {
            if (i > 1) {
                queryBuilder.append(", ");
            }
            queryBuilder.append(fields[i].getName()).append(" = ?");
        }
        queryBuilder.append(" where ").append(fields[0].getName()).append(" = ?");
        System.out.println(entity);
        System.out.println(queryBuilder.toString());
        PreparedStatement statement = openPrepareStatement(queryBuilder.toString());

        for (int i = 1; i < fields.length; i++) {
            fields[i].setAccessible(true);
            Object value = fields[i].get(entity);
            statement.setObject(i, value);
            System.out.println(value);
            System.out.println(fields[i]);
        }
        fields[0].setAccessible(true);
        Object value1 = fields[0].get(entity);
        statement.setObject(fields.length,value1);
        int rowsUpdated = statement.executeUpdate();
        return rowsUpdated > 0;
    }

}