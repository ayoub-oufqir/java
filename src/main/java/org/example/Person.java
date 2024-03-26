package org.example;

import java.util.StringJoiner;

public class Person {
    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .toString();
    }
    public class MaximumFinder<T extends Comparable<T>> {
        private T value1;
        private T value2;

        public MaximumFinder(T value1, T value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public T maximum() {
            return value1.compareTo(value2) >= 0 ? value1 : value2;
        }
    }

    MaximumFinder<Integer> integerMaximumFinder = new MaximumFinder<>(10, 20);
    //System.out.println("Maximum is: " + integerMaximumFinder.maximum()); // Output: Maximum is: 20

}
