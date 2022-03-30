package me.peppermill.testroom.godofjava.ch21;

import java.io.Serializable;

public class CastingDTO<T> implements Serializable {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
