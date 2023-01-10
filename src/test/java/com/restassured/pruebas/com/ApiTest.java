package com.restassured.pruebas.com;

import io.restassured.builder.*;
import io.restassured.http.*;
import io.restassured.specification.*;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;


/**
 * Unit test for simple App.
 */
public class ApiTest 
{

    // @BeforeAll
    // public static void setup() 
    // {
    //     RestAssured.baseURI = "https://petstore.swagger.io/v2";
    // }


    //Cada test es un scenario
    // @Test
    // public void pruebaApi()
    // {
    //     //Precondiciones del REQUEST
    //     given().
    //         log().all().
    //     //Accion a donde va a ir el request
    //     when().
    //         get("https://petstore.swagger.io/v2/pet/12").
    //     //Validaciones del RESPONSE que debemos tener en cuenta 
    //     then().
    //         log().all().
    //         assertThat().
    //         statusCode(200);
    // }
    
    //EVALUAR --> OUTPUT DEL LOG
    //TAREA --> 5 SCENARIOS / INTEGRAR ALLURE P/ REPORTES   
    
    ////// POST --> Create a new pet with body (201 CREATED EXPECTED)

    String requestBody = "{\n" +
    "  \"id\": \"0\",\n" +
    "  \"category\": \"{\",\n" +
    "   \"id\": \"0\",\n" +
    "   \"name\": \"string\",\n" +
    "  },\n" +
    "  \"name\": \"doggie\",\n" +
    "  \"photoUrls\": [\n" +
    "   \"string\"\n" +
    "  ],\n" +
    "  \"tags\": [\n" +
    "   {\n" +
    "       \"id\": \"0\",\n" +
    "       \"name\": \"string\",\n" +
    "   },\n" +
    "  ],\n" +
    "  \"status\": \"available\",\n" +
    "}";


    // to refactor -- receive JSON body as a parameter (create in external class)
    // @Test
    // public void addNewPet()
    // {
    //     Response response = given()
    //             .header("Content-type", "application/json")
    //             //.contentType("application/json")
    //             .and()
    //             .body(requestBody)
    //         .when()
    //             .post(RestAssured.baseURI + "/pet")
    //         .then()
    //             .extract().response();

    //     Assertions.assertEquals(201, response.statusCode());
    // }


    // @Test
    // public void addNewPet2()
    // {
    //     given()
    //     .body(requestBody)
    //     .when()
    //         .post("https://petstore.swagger.io/v2/pet")
    //     .then()
    //         .statusCode(201);
    // }

    // @Test
    // public void updateExistingPet()
    // {
    //     given().
    //         log().all().
    //     when().
    //         put().
    //     then().
    //         log().all().
    //         assertThat().
    //         statusCode(200);
    // }

    // @Test
    // public void findExistingPetById()
    // {
    //     given().
    //         log().all().
    //     when().
    //         get("https://petstore.swagger.io/v2/pet/12").
    //     then().
    //         log().all().
    //         assertThat().
    //         statusCode(200);
    // }

    // @Test
    // public void deleteExistingPetById()
    // {
    //     given().
    //         log().all().
    //     when().
    //         delete("https://petstore.swagger.io/v2/pet/12").
    //     then().
    //         log().all().
    //         assertThat().
    //         statusCode(200);
    // }
}
