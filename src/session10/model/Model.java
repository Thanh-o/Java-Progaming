package session10.model;

import session10.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class Model<T extends Entity<?>> {
    private List<T> entities = new ArrayList<>();

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }
    public void addEntity(T entity){
        entities.add(entity);
    }
}
