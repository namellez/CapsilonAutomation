package lesson4;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestAssuredWorker {

    private static final String OWNER = "namellez";
    private static final String REPO = "CapsilonAutomation";

    public static Response getUserList(){

        RestAssured.baseURI = "https://api.github.com/repos/" + OWNER +"/" + REPO + "/stats/contributors";
        RequestSpecification httpRequest = RestAssured.given();
        return httpRequest.request(Method.GET);
    }


    public static List<String> parseUserList(Response response){

        String responseBody = response.getBody().asString();

        Matcher matcher = MatchMaker.getMatcher(responseBody);

        List<String> userList = new ArrayList<>();

        while (matcher.find()) {
            userList.add((matcher.group(0)));
            System.out.println(matcher.group(0));
        }

        return userList;
    }


    public static void inviteUser(){

        final String user = "alexD1991";

        RestAssured.baseURI = "https://api.github.com/repos/" + OWNER + "/" + REPO + "/collaborators/" + user;

        RequestSpecification httpRequest = RestAssured.given();

        String encoding = Base64.getEncoder().encodeToString(("user:password").getBytes());     //fake creds here

        Response response = httpRequest.given().header(HttpHeaders.AUTHORIZATION, "Basic " + encoding).request(Method.PUT);

        System.out.println("Response code: " + response.getStatusCode());

    }



}
