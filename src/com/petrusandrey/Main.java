package com.petrusandrey;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(8));
        }
        double ArithmeticAverageOfSquaresArr = list
                .stream()
                .map(x -> (x * x)/2)
                .mapToInt(x -> x)
                .average()
                .getAsDouble();

        System.out.println("Square of numbers: " + ArithmeticAverageOfSquaresArr);
    }
}
