package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void SumSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void AverageValueSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverageValueSales = 15;
        int actualAverageValueSales = service.averageValueSales(sales);

        Assertions.assertEquals(expectedAverageValueSales, actualAverageValueSales);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonths = 5;
        int actualMonths = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonths = 5;
        int actualMonths = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
