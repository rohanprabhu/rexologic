package com.rohanprabhu.rexologic.types;

import java.util.Comparator;

/**
 * Created by rohan on 27/01/16.
 */
public class AssignablePartKey {
    public static class AssignablePartKeyComparator implements Comparator<AssignablePartKey> {
        @Override
        public int compare(AssignablePartKey o1, AssignablePartKey o2) {
            return Integer.compare(o1.getIndex(), o2.getIndex());
        }
    }

    private final String name;
    private final int index;

    public AssignablePartKey(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
