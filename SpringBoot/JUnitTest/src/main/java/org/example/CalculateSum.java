package org.example;

public class CalculateSum {
    public int calSum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
