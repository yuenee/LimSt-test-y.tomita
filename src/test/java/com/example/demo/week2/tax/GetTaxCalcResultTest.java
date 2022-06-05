package com.example.demo.week2.tax;

import com.example.demo.week2.service.TaxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetTaxCalcResultTest {
    TaxService taxService = new TaxService();

    @Test
    void 税込み計算結果を取得できる() {
        int priceWithoutTax = 10;

        double actual = taxService.getTaxCalcResult(priceWithoutTax);

        Assertions.assertEquals(11, actual);
    }
}
