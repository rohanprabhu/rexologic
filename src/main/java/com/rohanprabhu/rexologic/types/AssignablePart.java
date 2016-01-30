package com.rohanprabhu.rexologic.types;

/**
 * Created by rohan on 27/01/16.
 */
public interface AssignablePart<T> {
    void applyPartAssignment(
            T t, AssignablePartDescription assignablePartDescription, String match);
}
