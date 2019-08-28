package lesson4;

import static lesson4.ApacheWorker.getUserList;


public class Main {

    public static void main(String[] args) throws Exception {

       ApacheWorker.parseUserList(getUserList());


//       ApacheWorker.inviteUser();
//       RestAssuredWorker.inviteUser();

        RestAssuredWorker.parseUserList(RestAssuredWorker.getUserList());
    }

}
