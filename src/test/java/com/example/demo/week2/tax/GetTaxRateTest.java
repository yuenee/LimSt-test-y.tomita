package com.example.demo.week2.tax;

import com.example.demo.week2.service.TaxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetTaxRateTest {
    TaxService taxService = new TaxService();

    @Test
    void 税率を取得できる() {
        double actual = taxService.getTaxRate();

        Assertions.assertEquals(0.1, actual);
    }
}
