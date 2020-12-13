package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentGetTest extends TestBase {

    @Test
    public void getAllStudentsInfo() {
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchStudentWithParameter() {
        HashMap<String, Object> qParam = new HashMap<>();
        qParam.put("programme","Financial Analysis");
        qParam.put("limit", 2);

        Response response = given()
                /*.queryParam("programme","Financial Analysis")
                .queryParam("limit", 2)*/
//                .queryParams("programme","Financial Analysis","limit", 2)
                .queryParams(qParam)
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleStudentInfo() {
        Response response = given()
                .pathParam("id", 1)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}
