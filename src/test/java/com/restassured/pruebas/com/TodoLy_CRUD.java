package com.restassured.pruebas.com;

import io.restassured.builder.*;
import io.restassured.http.*;
import io.restassured.specification.*;
import utils.GenericMethods;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;

import org.junit.jupiter.api.Test;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;


/**
 * Unit test for simple App.
 */
public class TodoLy_CRUD 
{

    @BeforeAll
    public static void setup() 
    {
        RestAssured.baseURI = "https://todo.ly/api";
    }
    
    //EVALUATE --> OUTPUT DEL LOG / IMPLEMENT ALLURE
    
    ////// POST --> Create a new pet with body (201 CREATED EXPECTED)

    //to refactor -- receive JSON body as a parameter (create in external class)
    // @Test
    // public void createUser()
    // {
    //     Map<String, Object> requestBody = new HashMap<String,Object>();
    //     requestBody.put("Email", "asd@asdasd.com");
    //     requestBody.put("FullName","Fede");
    //     requestBody.put("Password","12345");

    //     Response response = given()
    //         .log().all()
    //             //.header("Content-type", "application/json")
    //             .contentType("application/json")
    //             .and()
    //             .body(requestBody.toString())
    //         .when()
    //             .post("https://todo.ly/api/user.json")
    //         .then()
    //             .log().all()
    //             .extract().response();

    //     Assertions.assertEquals(201, response.statusCode());
    // }


    @Test
    public void createUser2()
    {
        System.out.println("******      CREATE USER     ******");
        String randomEmail = GenericMethods.getAlphaNumericString(5) + "@mail.com";

        JSONObject request = new JSONObject();
        request.put("Email", randomEmail);
        request.put("FullName","Fede");
        request.put("Password","12345");

        given()
            .header("Content-Type", "application/json")
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(request.toJSONString())
        .when()
            .post("https://todo.ly/api/user.json")
        .then()
            .statusCode(200)
            .log().all();
            
    }

    private static String myId;

    @Test
    public void createNewProject()
    {
        System.out.println("******      CREATE NEW PROJECT     ******");
        JSONObject projectBody = new JSONObject();
        projectBody.put("Content", "New_Project");
        projectBody.put("Icon","4");
        

        given()
            .auth()
            .preemptive()
            .basic("fhr1@fhr1.com", "12345")
            .header("Accept", ContentType.JSON.getAcceptHeader())
            .contentType(ContentType.JSON)
            .body(projectBody.toJSONString())
        .when()
            .post("https://todo.ly/api/projects.json")
        .then()
            .statusCode(200)
            .log().all();

        //JSONObject response = 
    }

    @Test
    public void getAllProjects()
    {   
        System.out.println("******      GET ALL PROJECTS     ******");
        given()
            .auth()
            .preemptive()
            .basic("fhr1@fhr1.com", "12345")
            .header("Accept", ContentType.JSON.getAcceptHeader())
        .when()
            .get("https://todo.ly/api/projects.json")
        .then()
            .statusCode(200)
            .log().all();
    }


}
