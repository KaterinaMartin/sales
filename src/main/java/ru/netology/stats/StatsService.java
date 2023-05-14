package ru.netology.stats;
public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public int averageValueSales(int[] sales) {
        int sum = 0;
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }

        return average;
    }

    public int maxSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int average = averageValueSales(sales);
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }

    public int aboveAverageSales(int[] sales) {
        int average = averageValueSales(sales);
        int quantityMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }
}
