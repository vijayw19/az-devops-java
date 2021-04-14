package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @RequestMapping("/Amvitech")
  public String home() {
    return "Welcome to Amvi Tech Solutions Home page";
  }
  
  @RequestMapping("/Amvitech/contacts")
  public String contacts() {
    return "Please see the contacts here:";
  }
  
  @RequestMapping("/Amvitech/enquiry")
  public String enquiry() {
    return "Welcome to Amvi Tech Solutions enquiry page";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}