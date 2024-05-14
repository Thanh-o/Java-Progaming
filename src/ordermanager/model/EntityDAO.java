package ordermanager.model;

import ordermanager.entity.Entity;

import java.sql.SQLException;

public interface EntityDAO<T extends Entity<?>> {
    public boolean insert(T entity) throws SQLException, IllegalAccessException;
    public boolean update(T entity) throws SQLException, IllegalAccessException;
}
