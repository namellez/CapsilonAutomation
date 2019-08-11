package lesson4;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredWorker {

    public static void getListOfRepoUsers(){

    String owner = "namellez";
    String repo = "CapsilonAutomation";
    String url = "https://api.github.com/repos/" + owner +"/" + repo +"/stats/contributors";

        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://api.github.com/repos/" + owner +"/" + repo +"/stats/contributors";

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server by specifying the method Type and the method URL.
        // This will return the Response from the server. Store the response in a variable.
        Response response = httpRequest.request(Method.GET);

        // Now let us print the body of the message to see what response
        // we have recieved from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

    }

    public static void inviteUser(){

        String owner = "namellez";
        String repo = "CapsilonAutomation";
        String user = "dihnatsyeu";
        String url = "https://api.github.com/repos/" + owner +"/" + repo +"/collaborators/" + user;

        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://api.github.com/repos/" + owner +"/" + repo +"/collaborators/" + user;

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server by specifying the method Type and the method URL.
        // This will return the Response from the server. Store the response in a variable.
        Response response = httpRequest.request(Method.PUT);

        // Now let us print the body of the message to see what response
        // we have recieved from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

    }



}
