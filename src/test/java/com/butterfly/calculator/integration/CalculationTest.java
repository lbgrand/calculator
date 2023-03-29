package com.butterfly.calculator.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.butterfly.calculator.CalculatorApplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
  classes = CalculatorApplication.class, 
  webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CalculationTest {

    @LocalServerPort
    private int port;

    private TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testRetrieveStudentCourse() {
        ResponseEntity<Double> response = restTemplate.exchange(
                createURLWithPort("/api/sum/4.05/9.43"),
                HttpMethod.GET, new HttpEntity<>(null), Double.class);

        assertEquals(13.48, response.getBody());
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}