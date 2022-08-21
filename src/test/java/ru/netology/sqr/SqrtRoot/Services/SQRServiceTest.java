package ru.netology.sqr.SqrtRoot.Services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/sqr.csv")

    public void shouldCalcExact (int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculated(min, max);
//        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
