package com.company.service;

import com.company.model.Tree;

public class GrowableImpl implements Growable {

    private final double maxGrowth = 0.3;
    private final double minGrowth = 0.1;
    private final double range = maxGrowth - minGrowth;

    @Override
    public void growUp(Tree tree) {

        int initAge = tree.getInitAge();
        double height = tree.getInitHeight();
        String name = tree.getName();

        int yearsOfLife = (int) (Math.random() * 500) + 100;
        checkIfTreeCanGrow(initAge, yearsOfLife);

        for (int age = initAge; age <= yearsOfLife; age++) {
            double randomGrowth = Math.round((Math.random() * range + maxGrowth) * 100.0) / 100.0;
            height += randomGrowth;

            if (age == yearsOfLife / 8 || age == yearsOfLife / 3 || age == yearsOfLife - 1) {
                System.out.println("After " + age + " years the " + tree.getClass().getSimpleName() + " called " + name
                        + " measured " + String.format("%.2f", height) + " meters");
            }

            if (age == yearsOfLife) {
                die(name, age);
                System.out.println();
            }
        }
    }

    private void checkIfTreeCanGrow(int initAge, int yearsOfLife) {
        if (initAge > yearsOfLife) {
            System.out.println("This tree no longer grows");
        }
    }
}
