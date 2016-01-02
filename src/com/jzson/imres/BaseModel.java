package com.jzson.imres;

/**
 * Created by Denis Trotsky on 10/19/2015.
 */
public abstract class BaseModel {

    public static final int INITIAL_ID = -1;

    private int id = INITIAL_ID;

    public BaseModel() {
    }

    public BaseModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
