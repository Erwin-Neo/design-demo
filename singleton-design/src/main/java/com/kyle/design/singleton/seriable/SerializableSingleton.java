package com.kyle.design.singleton.seriable;

import java.io.Serializable;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class SerializableSingleton implements Serializable {


    // serialization
    // converts the state of an object in memory to the form of bytecode
    // write bytecode to disk via IO output stream
    // persistence

    // deserialization
    // read the persistent bytecode content into memory via the IO input stream
    // To Java Object
    public final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
