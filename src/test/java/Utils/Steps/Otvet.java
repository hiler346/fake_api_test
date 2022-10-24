package Utils.Steps;

import Models.*;
import Utils.Generator;
import Utils.HelpModels.HelpModels;
import Utils.RandomUtils;
import Utils.TypeRequest;
import io.restassured.response.Response;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Otvet {
  protected static HelpModels otvet = new HelpModels();

  public static void Login(String username, String password) {
    Login login = Generator.ParamsLogin(
        username,
        password
    );

    Response response = TypeRequest.LOGIN_BODY(
        "/users/login",
        login,
        200
    );

    otvet.accessToken = response.path("accessToken");
    otvet.refreshToken = response.path("refreshToken");
  }

  public static void Page()  {
    Page pages = Generator.ParamsPage(
            2,
            6,
            12,
            2,
            7,
            "michael.lawson@reqres.in1",
            "Michael1",
            "Lawson1",
            "https://reqres.in/img/faces/7-image.jpg1",
            8,
            "michael.lawson@reqres.in",
            "Michael",
            "Lawson",
            "https://reqres.in/img/faces/7-image.jpg",
            8,
            "michael.lawson@reqres.in",
            "Michael",
            "Lawson",
            "https://reqres.in/img/faces/7-image.jpg",
            8,
            "michael.lawson@reqres.in",
            "Michael",
            "Lawson",
            "https://reqres.in/img/faces/7-image.jpg",
            8,
            "michael.lawson@reqres.in",
            "Michael",
            "Lawson",
            "https://reqres.in/img/faces/7-image.jpg",
            "https://reqres.in/#support-heading",
            "To keep ReqRes free, contributions towards server costs are appreciated!"

    );
    Response response = TypeRequest.POST_BODY_LOGIN_ERROR(
            "/api/register",
            pages,
            200);
  }

  public static void SingleUser() {

    TypeRequest.GET(
            "/api/users/2",
            200
    );

  }

  public static void ListUpDate() {
    LocalDate dateFrom = LocalDate.now().minusMonths(7);
    LocalDate dateTo = LocalDate.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    TypeRequest.GET_AUTH_QUERY_3_NO(
            "/api/list/update",
            "Page", 1,
            "dateFrom", dtf.format(dateFrom),
            "dateTo", dtf.format(dateTo),
            200
    );
  }




}
