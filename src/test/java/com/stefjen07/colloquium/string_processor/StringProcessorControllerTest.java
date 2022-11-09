package com.stefjen07.colloquium.string_processor;

import com.stefjen07.colloquium.string_processor.dto.request.StringConcatenateRequest;
import com.stefjen07.colloquium.string_processor.dto.request.StringRepeatRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class StringProcessorControllerTest {
    @LocalServerPort
    final int port = 8080;

    @Before
    public void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    @Test
    void concatenate() {
        RequestSpecification request = RestAssured.given();
        request.body(new StringConcatenateRequest("hello, ", "world"));
        request.accept(ContentType.JSON);
        request.contentType(ContentType.JSON);
        Response response = request.post("/concatenate");
        Assertions.assertEquals("hello, world", response.getBody().print());
    }

    @Test
    void repeat() {
        RequestSpecification request = RestAssured.given();
        request.body(new StringRepeatRequest("hi", 3));
        request.accept(ContentType.JSON);
        request.contentType(ContentType.JSON);
        Response response = request.post("/repeat");
        Assertions.assertEquals("hihihi", response.getBody().print());
    }
}
