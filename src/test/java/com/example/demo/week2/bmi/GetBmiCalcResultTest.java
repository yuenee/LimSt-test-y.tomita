package com.example.demo.week2.bmi;

import com.example.demo.week2.service.BmiService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetBmiCalcResultTest {
    BmiService bmiService = new BmiService();

    @Test
    void BMI計算結果を返す() {
        double height = 1.7;
        double weight = 60;

        double actual = bmiService.getBmiCalcResult(height, weight);

        Assertions.assertEquals(20.761245674740486, actual);
    }
}
