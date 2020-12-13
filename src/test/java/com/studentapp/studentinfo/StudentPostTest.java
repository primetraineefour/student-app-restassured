package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentPostTest extends TestBase {

    @Test
    public void createStudent(){

        List<String> cources = new ArrayList<>();
        cources.add("JAVA");
        cources.add("API");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Prime");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail("prime@gmail.com");
        studentPojo.setProgramme("Api Testing");
        studentPojo.setCourses(cources);

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post("");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
