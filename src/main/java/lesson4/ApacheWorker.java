package lesson4;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApacheWorker {

    private static HttpClient client = HttpClientBuilder.create().build();
    private static final String OWNER = "namellez";
    private static final String REPO = "CapsilonAutomation";

    public static HttpResponse getUserList() throws Exception {
        final String url = "https://api.github.com/repos/" + OWNER + "/" + REPO + "/stats/contributors";  //API: repos/:owner/:repo/stats/contributors
        HttpGet request = new HttpGet(url);
        return client.execute(request);
    }

    public static List<String> parseUserList(HttpResponse response) throws Exception{

        Scanner scanner = new Scanner(response.getEntity().getContent());
        String text = scanner.nextLine();
        scanner.close();

        Matcher matcher = MatchMaker.getMatcher(text);

        List<String> userList = new ArrayList<>();

        while (matcher.find()) {
            userList.add((matcher.group(0)));
            System.out.println(matcher.group(0));
        }

        return userList;
    }

    public static void inviteUser() throws IOException {

        final String user = "dihnatsyeu";
        final String url = "https://api.github.com/repos/" + OWNER + "/" + REPO + "/collaborators/" + user;   //PUT /repos/:owner/:repo/collaborators/:username

        HttpPut request = new HttpPut(url);

        String encoding = Base64.getEncoder().encodeToString(("user:password").getBytes());     //fake creds here
        request.setHeader(HttpHeaders.AUTHORIZATION, "Basic " + encoding);

        HttpResponse response = client.execute(request);

        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

    }

}