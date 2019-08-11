package lesson4;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;


import java.io.*;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.apache.http.HttpHeaders.USER_AGENT;

public class HTTPComponents {

    public void getListOfRepoUsers() throws Exception{

        String owner = "namellez";
        String repo = "CapsilonAutomation";
        String url = "https://api.github.com/repos/" + owner +"/" + repo +"/stats/contributors";

        //repos/:owner/:repo/stats/contributors

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        // add request header
        //request.addHeader("User-Agent", USER_AGENT);
        HttpResponse response = client.execute(request);

        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());


        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";

        while ((line = rd.readLine()) != null) {
            result.append(line);
        }


    }


    public void sendRepoInvite() throws IOException {

        String owner = "namellez";
        String repo = "CapsilonAutomation";
        String user = "dihnatsyeu";
        String url = "https://api.github.com/repos/" + owner +"/" + repo +"/collaborators/" + user;

        //PUT /repos/:owner/:repo/collaborators/:username

        HttpClient client = HttpClientBuilder.create().build();
        HttpPut request = new HttpPut(url);


        // add request header
        //request.setHeader("Content-Length", "6");

        HttpResponse response = client.execute(request);

        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());


        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";

        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result);

    }


//    private static final HttpRequest<?> HTTP_REQUEST =
//            HttpRequestBuilder.createGet(YOUR_URI)
//                    .addDefaultHeader(HttpHeaders.CONTENT_LENGTH, "0")
//                    .build();




}