// run with mvn spring-boot:run
// Use the site http://localhost:8080/greeting
// or http://localhost:8080/greeting?name=User.

package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
