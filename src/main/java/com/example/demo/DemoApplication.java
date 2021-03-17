package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Cache cache = new Cache();
        /*cache.set(1, "User 1");
        cache.set(2, "User 2");
        cache.set(3, "User 3");

        System.out.println(cache.get(1));

        System.out.println(cache.has(2));
        cache.delete(2);
        System.out.println(cache.has(2)); */




    }

}
