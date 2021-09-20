package com.company.implementation;

import com.company.model.Branch;
import com.company.model.LeafType;
import com.company.model.Tree;
import com.company.model.TrunkThickness;

import java.util.List;

public class Oak extends Tree {

    final protected LeafType leafType = LeafType.BROADLEAF;
    final protected TrunkThickness trunkThickness = TrunkThickness.THICK;

    public Oak(String name, List<Branch> branches, int initAge, double initHeight) {
        super(name, branches, initAge, initHeight);
    }
}
