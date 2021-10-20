package com.dinis.p16021.ptixiaki.objects;

public class ErotimatologioFactory {

    public Erotimatologio createErotimatologio(Erotimatologia e){

        switch (e){
            case DEFAULT:
                return new DefaultErotimatologio();
            default:
                return new DefaultErotimatologio();
        }

    }
}
