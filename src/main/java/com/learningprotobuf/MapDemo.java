package com.learningprotobuf;

import com.learningprotobuf.models.BodyStyle;
import com.learningprotobuf.models.Car;
import com.learningprotobuf.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {
        Car hondaAccord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setBodyStyle(BodyStyle.SEDAN)
                .setYear(2020)
                .build();

        Car hondaCivic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.COUPE)
                .setYear(2005)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(hondaAccord.getYear(), hondaAccord)
                .putModel(hondaCivic.getYear(), hondaCivic)
                .build();


//        System.out.println(dealer.getModelOrThrow(hondaAccord.getYear()));
//        System.out.println(dealer.getModelOrDefault(2009, hondaCivic));
//        System.out.println(dealer.getModelMap());
//        System.out.println(dealer.getModelOrThrow(2004));

        System.out.println(dealer.getModelOrThrow(2020).getBodyStyle());


    }
}
