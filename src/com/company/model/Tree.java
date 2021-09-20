package com.company.model;

import com.company.service.TreeNotValidAge;

import java.util.List;

public abstract class Tree {

    final private String name;
    private List<Branch> branches;
    private int initAge;
    private double initHeight;

    public Tree(String name, List<Branch> branches, int initAge, double initHeight) {
        this.name = name;
        this.branches = branches;
        this.setAge(initAge);
        this.initHeight = initHeight;
    }

    public int getInitAge() {
        return initAge;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new TreeNotValidAge("The age of the tree cannot be a negative number!");
        }
        this.initAge = age;
    }

    public double getInitHeight() {
        return initHeight;
    }

    public void setInitHeight(double initHeight) {
        this.initHeight = initHeight;
    }

    public String getName() {
        return name;
    }
}
