package com.stefjen07.colloquium.string_processor.service;

import java.util.Collections;

public class StringProcessorServiceImpl implements StringProcessorService {
    @Override
    public String concatenate(String str1, String str2) {
        return str1.concat(str2);
    }

    @Override
    public String repeat(String str, int count) {
        return String.join("", Collections.nCopies(count, str));
    }
}
