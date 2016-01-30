package com.rohanprabhu.rexologic.types;

import java.util.regex.Pattern;

/**
 * Descriptor for assignable parts. An assignable part is any property
 * that a value extracted from a Pattern can be applied to. As of now,
 * there are three types of assignable parts, from a write-method (a setter).
 */
public class AssignablePartDescription {
    private final Class<?> partValueType;
    private final Pattern pattern;

    private final AssignablePartKey assignablePartKey;
    private final AssignablePart<?> assignablePart;

    public AssignablePartDescription(
            Class<?> partValueType,
            Pattern pattern,
            AssignablePartKey assignablePartKey,
            AssignablePart<?> assignablePart) {
        this.partValueType = partValueType;
        this.pattern = pattern;
        this.assignablePartKey = assignablePartKey;
        this.assignablePart = assignablePart;
    }

    public Class<?> getPartValueType() {
        return partValueType;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public AssignablePartKey getAssignablePartKey() {
        return assignablePartKey;
    }

    public AssignablePart<?> getAssignablePart() {
        return assignablePart;
    }
}
