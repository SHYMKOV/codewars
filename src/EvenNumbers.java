package com.company;
import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {

        ArrayList<Integer> Array = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0)
            {
                Array.add(numbers[i]);
            }
        }

        int[] result = new int[Array.size()];

        for (int i = 0; i < result.length; i++)

            result[i] = Array.get(i);

        return result;
    }
}