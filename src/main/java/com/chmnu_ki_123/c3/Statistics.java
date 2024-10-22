package com.chmnu_ki_123.c3;

import java.util.Arrays;

public class Statistics {

    public static void main(String[] args) {
        double[] array = {2.0, -1.0, 5.1}; // Заданий масив дійсних чисел
        double mean = calculateMean(array);
        double geometricMean = calculateGeometricMean(array);
        double variance = calculateVariance(array, mean);
        double median = calculateMedian(array);

        System.out.println("Середнє арифметичне (M): " + mean);
        System.out.println("Середнє геометричне (G): " + geometricMean);
        System.out.println("Дисперсія (D): " + variance);
        System.out.println("Медіана: " + median);
    }

    // Функція для обчислення середнього арифметичного
    public static double calculateMean(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Функція для обчислення середнього геометричного
    public static double calculateGeometricMean(double[] array) {
        double product = 1.0;
        for (double num : array) {
            product *= num;
        }
        return Math.pow(product, 1.0 / array.length);
    }

    // Функція для обчислення дисперсії
    public static double calculateVariance(double[] array, double mean) {
        double sum = 0.0;
        for (double num : array) {
            sum += Math.pow(num - mean, 2);
        }
        return sum / array.length;
    }

    // Функція для обчислення медіани
    public static double calculateMedian(double[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }
}
