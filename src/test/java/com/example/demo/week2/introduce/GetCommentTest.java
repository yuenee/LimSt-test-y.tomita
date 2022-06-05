package com.example.demo.week2.introduce;

import com.example.demo.week2.service.IntroduceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetCommentTest {
    IntroduceService introduceService = new IntroduceService();

    @Test
    void コメントを取得できる() {
        String actual = introduceService.getComment();

        Assertions.assertEquals("Dream Junkie", actual);
    }
}
