package com.netcracker.HW2.ch3;

public interface IntSequence {
    int next();

    default boolean hasNext() {
        return true;
    }

    static IntSequence of(int... values) {
        return new IntSequence() {

            int point;

            @Override
            public int next() {
                return values[point++];
            }

            @Override
            public boolean hasNext() {
                return point < values.length;
            }
        };
    }
    static IntSequence constantLambda(final int i) {
        return () -> i;
    }
    static IntSequence constant(int i) {
        return new IntSequence() {
            final int value = i;

            @Override
            public int next() {
                return value;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }
}
