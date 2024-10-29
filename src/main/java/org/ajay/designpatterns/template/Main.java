package org.ajay.designpatterns.template;

import org.ajay.designpatterns.template.model.impl.GetFirstIndexEqualToOrGreaterThan;
import org.ajay.designpatterns.template.model.impl.GetFirstIndexGreaterThan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 1, 3, 5, 6, 10));

        GetFirstIndexGreaterThan getFirstIndexGreaterThan = new GetFirstIndexGreaterThan(arrayList);
        System.out.println(getFirstIndexGreaterThan.getFirstTrue(5));

        GetFirstIndexEqualToOrGreaterThan getFirstIndexEqualToOrGreaterThan = new GetFirstIndexEqualToOrGreaterThan(arrayList);
        System.out.println(getFirstIndexEqualToOrGreaterThan.getFirstTrue(5));
    }
}
    