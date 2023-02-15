package ru.netology.syndrom100percent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    void findMaxSecond() {
        StatisticsService service = new StatisticsService();
        long [] incomesInBillions = {7, 9, 12, 2, 6, 18, 15, 1, 10, 5, 0};
        long expected = 18;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}
