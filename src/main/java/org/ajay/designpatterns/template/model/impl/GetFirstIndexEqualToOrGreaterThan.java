package org.ajay.designpatterns.template.model.impl;

import org.ajay.designpatterns.template.model.GetFirstTrue;

import java.util.ArrayList;

public class GetFirstIndexEqualToOrGreaterThan extends GetFirstTrue {

    public GetFirstIndexEqualToOrGreaterThan(ArrayList<Integer> arrayList) {
        super(arrayList);
    }

    @Override
    protected boolean isTrue(int idx, int target) {
        return this.arrayList.get(idx)>=target;
    }
}
