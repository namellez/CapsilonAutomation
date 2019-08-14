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

    public static List<String> getListOfRepoUsers(){

    String owner = "namellez";
    String repo = "CapsilonAutomation";

        RestAssured.baseURI = "https://api.github.com/repos/" + owner +"/" + repo + "/stats/contributors";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET);

        String responseBody = response.getBody().asString();

        String pattern = "(?<=(\"login\":\")).+?(?=\",)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(responseBody);

        List<String> userList = new ArrayList<>();

        while (m.find()) {
            userList.add((m.group(0)));
            System.out.println(m.group(0));
        }

        return userList;

    }

    public static void inviteUser(){

        String owner = "namellez";
        String repo = "CapsilonAutomation";
        String user = "alexD1991";

        RestAssured.baseURI = "https://api.github.com/repos/" + owner + "/" + repo + "/collaborators/" + user;

        RequestSpecification httpRequest = RestAssured.given();

        String encoding = Base64.getEncoder().encodeToString(("user:password").getBytes());     //fake creds here

        Response response = httpRequest.given().header(HttpHeaders.AUTHORIZATION, "Basic " + encoding).request(Method.PUT);

        //String responseBody = response.getBody().asString();

        System.out.println("Response code: " + response.getStatusCode());

    }



}
