package selenium2k25;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SimpleApiTest {

    public static void main(String[] args) {
        // Set base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Send GET request
        Response response = RestAssured
                .given()
                .when()
                .get("/users/1");

        // Print status code
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        // Print response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body:\n" + responseBody);

        // Validate status code manually
        if (statusCode == 200) {
            String name = response.jsonPath().getString("name");
            if (name.equals("Leanne Grah")) {
                System.out.println("✅ Test Passed: Name is correct");
            } else {
                System.out.println("❌ Test Failed: Name is incorrect");
            }
        } else {
            System.out.println("❌ Test Failed: Unexpected status code");
            
        }
}}