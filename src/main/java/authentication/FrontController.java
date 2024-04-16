package authentication;

public class FrontController {

    public void doGet(String request) {
        System.out.println("GET request received: " + request);
        // ここでGETリクエストの処理を行う
    }

    public void doPost(String request) {
        System.out.println("POST request received: " + request);
        // ここでPOSTリクエストの処理を行う
    }

    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        // サンプルGETリクエスト
        frontController.doGet("home");

        // サンプルPOSTリクエスト
        frontController.doPost("login");
    }
}