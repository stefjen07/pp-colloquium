package com.stefjen07.colloquium.string_processor.controller;

import com.stefjen07.colloquium.string_processor.dto.request.StringConcatenateRequest;
import com.stefjen07.colloquium.string_processor.dto.request.StringRepeatRequest;
import com.stefjen07.colloquium.string_processor.service.StringProcessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/process-string")
@RequiredArgsConstructor
public class StringProcessorController {
    private final StringProcessorService stringProcessorService;

    @PostMapping("/concatenate")
    String concatenate(@RequestBody StringConcatenateRequest request) {
        return stringProcessorService.concatenate(request.getString1(), request.getString2());
    }

    @PostMapping("/repeat")
    String repeat(@RequestBody StringRepeatRequest request) {
        return stringProcessorService.repeat(request.getString(), request.getCount());
    }
}
