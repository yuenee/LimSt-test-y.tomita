package com.example.demo.week2.introduce;

import com.example.demo.week2.service.IntroduceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetNameTest {
    IntroduceService introduceService = new IntroduceService();

    @Test
    void 名前を取得できる() {
        String actual = introduceService.getName();

        Assertions.assertEquals("Soul Hayato", actual);
    }
}
