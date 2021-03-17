package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cache {
    Map<Integer, String> map = new HashMap<>();
    //Get
    public String get(int key) {

       return  map.get(key);
    }

    //Set
    public void set(int key, String value){
        map.put(key,value);
    }

    public boolean has(int key) {
        if(map.containsKey(key)){
            return true;
        } else {
            return false;
        }
    }

    public void delete(int key) {
        map.remove(key);
    }


}





























































