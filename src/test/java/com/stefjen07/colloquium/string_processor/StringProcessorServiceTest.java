package com.stefjen07.colloquium.string_processor;

import com.stefjen07.colloquium.string_processor.service.StringProcessorService;
import com.stefjen07.colloquium.string_processor.service.StringProcessorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringProcessorServiceTest {
    StringProcessorService stringProcessorService = new StringProcessorServiceImpl();

    @Test
    void concatenate() {
        String result = stringProcessorService.concatenate("hello, ", "world");
        Assertions.assertEquals("hello, world", result);
    }

    @Test
    void repeat() {
        String result = stringProcessorService.repeat("hi", 3);
        Assertions.assertEquals("hihihi", result);
    }
}