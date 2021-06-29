package com.learningprotobuf;

import com.leaningproto.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {
    public static void main(String[] args) throws IOException {
//        Person nikhil = Person.newBuilder()
//                .setName("Nikhil")
//                .setAge(10)
//                .build();

        Path path = Paths.get("nikhil.ser");
        //Files.write(path, nikhil.toByteArray());
        byte[] bytes = Files.readAllBytes(path);
        Person nikhil = Person.parseFrom(bytes);
        System.out.println(nikhil);
    }
}
