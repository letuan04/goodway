/**
 * Copyright (C) 2018 MKSGROUP - All Rights Reserved.
 */
package mksgroup.goodway.plan.domain.model.entity;

/**
 * @author ThachLN
 * @param <T>
 */
public abstract class Entity<T> {

    T id;
    String name;

    /**
     * @return
     */
    public T getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(T id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
