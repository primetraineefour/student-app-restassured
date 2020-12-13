package com.studentapp.specificationexample;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by Jay
 */
public class ResponseSpecificationExample {

    private static final String API_KEY = "75e3u4sgb2khg673cbv2gjup";

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "http://api.walmartlabs.com";
        RestAssured.basePath = "/v1";

    }

    // 1) Verify if the number of items is equal to 10
    @Test
    public void test001() {

    }

    // 3) Check Single Name in ArrayList (SAMSUNG 55\" Class 4K Crystal UHD (2160P) LED Smart TV with HDR UN55TU7000 2020)
    @Test
    public void test003() {

    }
}
