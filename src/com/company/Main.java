package com.company;

import com.company.implementation.Fir;
import com.company.implementation.Oak;
import com.company.service.Growable;
import com.company.service.GrowableImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Growable growable = new GrowableImpl();

        Oak oak = new Oak("Krzyś", new ArrayList<>(), 55, 3);
        growable.growUp(oak);

        Fir fir = new Fir("Geralt", new ArrayList<>(), 5, 3);
        growable.growUp(fir);
    }
}
