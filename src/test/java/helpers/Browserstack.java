package helpers;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {
    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .auth().basic("fallen_cIoB3g", "ymzCCQhTHF1xtoNWPyM7")
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}