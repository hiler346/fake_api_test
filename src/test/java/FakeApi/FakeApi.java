package FakeApi;

import Utils.BaseUri.BaseUriTest;
import Utils.Steps.Otvet;
import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

@Tag("TEST")
@DisplayName("FAke API (TEST)")
public class FakeApi extends BaseUriTest {

  @Test
  @Order(1)
  @DisplayName("Авторизация пользователя")
  void Login() {
    step("Авторизация пользователя", () -> {
      Otvet.Login("admin@gmail.com", "admin");  //Вставить логин и пароль для авторизации
    });
  }

  @Test
  @Order(2)
  @DisplayName("Страница ползьзователей")
  void Page() {
    step("Страница ползьзователей", () -> {
      Otvet.Page();
    });
  }

  @Test
  @Order(3)
  @DisplayName("Информация одного пользователя")
  void SingleUser() {
    step("Информация одного пользователя", () -> {
      Otvet.SingleUser();
    });
  }

  @Test
  @Order(4)
  @DisplayName("Список пользователей по дате")
  void ListUpDate() {
    step("Список пользователей по дате", () -> {
      Otvet.ListUpDate();
    });
  }




}
