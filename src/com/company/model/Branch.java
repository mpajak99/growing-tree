package com.company.model;

import java.util.List;

public abstract class Branch {

    private List<Leaf> leaves;

    public Branch(List<Leaf> leaves) {
        this.leaves = leaves;
    }
}
