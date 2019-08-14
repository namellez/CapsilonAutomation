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

    public static List<String> getListOfRepoUsers() throws Exception {

        String owner = "namellez";
        String repo = "CapsilonAutomation";
        String url = "https://api.github.com/repos/" + owner + "/" + repo + "/stats/contributors";  //API: repos/:owner/:repo/stats/contributors

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        HttpResponse response = client.execute(request);

        Scanner scanner = new Scanner(response.getEntity().getContent());
        String text = scanner.nextLine();
        scanner.close();

        String pattern = "(?<=(\"login\":\")).+?(?=\",)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        List<String> userList = new ArrayList<>();

        while (m.find()) {
            userList.add((m.group(0)));
            System.out.println(m.group(0));
        }

        return userList;
    }

    public static void inviteUser() throws IOException {

        String owner = "namellez";
        String repo = "CapsilonAutomation";
        String user = "dihnatsyeu";
        String url = "https://api.github.com/repos/" + owner + "/" + repo + "/collaborators/" + user;   //PUT /repos/:owner/:repo/collaborators/:username

        HttpClient client = HttpClientBuilder.create().build();
        HttpPut request = new HttpPut(url);

        String encoding = Base64.getEncoder().encodeToString(("user:password").getBytes());     //fake creds here
        request.setHeader(HttpHeaders.AUTHORIZATION, "Basic " + encoding);

        HttpResponse response = client.execute(request);

        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

    }

}