package com.stefjen07.colloquium.string_processor.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StringRepeatRequest {
    String string;
    int count;
}
