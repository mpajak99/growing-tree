package com.company.implementation;

import com.company.model.Branch;
import com.company.model.LeafType;
import com.company.model.Tree;
import com.company.model.TrunkThickness;

import java.util.List;

public class Fir extends Tree {

    final protected LeafType leafType = LeafType.NEEDLE;
    final protected TrunkThickness trunkThickness = TrunkThickness.MEDIUM;

    public Fir(String name, List<Branch> branches, int initAge, double initHeight) {
        super(name, branches, initAge, initHeight);
    }
}
