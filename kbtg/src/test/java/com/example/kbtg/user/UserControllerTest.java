package com.example.kbtg.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void success_get_user_id_1(){
        // Act
        UserResponse response = restTemplate.getForObject("/user/1", UserResponse.class);
        // Assert
        assertEquals(1, response.getId());
        assertEquals("test", response.getName());
        assertEquals(30, response.getAge());
    }

    @Test
    public void success_get_user_id_1_quiz(){
        // Act
        UserResponse response = restTemplate.getForObject("/user/1", UserResponse.class);
        // Assert
        UserResponse expected = new UserResponse(1, "test", 30);
        assertEquals(expected, response);
    }

    @Test
    public void user_not_found_with_user_id_15(){
        ErrorResponse response = restTemplate.getForObject("/user/15", ErrorResponse.class);
        ErrorResponse errorResponse = new ErrorResponse(1234, "User not found id=15");
        assertEquals(errorResponse, response);
    }


}