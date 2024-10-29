package org.ajay.designpatterns.template.model;

import java.util.ArrayList;

public abstract class GetFirstTrue {
    protected final ArrayList<Integer> arrayList;
    protected abstract boolean isTrue(int idx, int target);

    protected GetFirstTrue(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    protected int getRight() {
        return arrayList.size();
    }
    public int getFirstTrue(int target) {
        int l = 0;
        int r = getRight();
        while (l<r){
            int m = (l+r)/2;
            if (isTrue(m,target)) {
                r = m;
            } else {
                l=m+1;
            }
        }
        return l;
    }
}
