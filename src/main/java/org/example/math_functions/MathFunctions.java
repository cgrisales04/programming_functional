package org.example.math_functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    static class Student {
        private final double qualification;
        private final String name;

        public Student(double qualification, String name) {
            this.qualification = qualification;
            this.name = name;
        }

        public double getQualification() {
            return qualification;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(squareFunction.apply(5));
        System.out.println(square(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 0;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));

        Predicate<Student> isApproved = student -> student.getQualification() >= 3.0;
        Student student = new Student(2.98, "Christofer");
        System.out.println("Student " + (isApproved.test(student) ?
                student.getName() + " Approved: " + student.getQualification() :
                student.getName() + " Reproved: " + student.getQualification()));
    }


    public static int square(int x) {
        return x * x;
    }

}
