package com.egomaa.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EMSApplication {

    public static void main(String[] args) {

        SpringApplication.run(EMSApplication.class, args);
        System.out.println("-------------------- Application up and running now ---------------- ");
    }



}