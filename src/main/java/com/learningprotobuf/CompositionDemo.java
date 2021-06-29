package com.learningprotobuf;

import com.google.protobuf.Int32Value;
import com.learningprotobuf.models.Address;
import com.learningprotobuf.models.Car;
import com.learningprotobuf.models.Person;

import java.util.ArrayList;

public class CompositionDemo {
    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("Street Name")
                .setCity("City")
                .build();

        Car hondaAccord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();

        Car hondaCivic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(hondaCivic);
        cars.add(hondaAccord);

        Person nikhil = Person.newBuilder()
                .setName("Nikhil")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .addAllCar(cars)
                .setAddress(address)
                .build();
        System.out.println(nikhil);
    }
}
