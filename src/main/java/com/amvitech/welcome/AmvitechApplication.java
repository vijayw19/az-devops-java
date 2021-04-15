
package com.amvitech.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmvitechApplication {

  @RequestMapping("/amvitech")
  public String home() {
    return "Welcome to Amvi Tech Solutions Home page";
  }
  
  @RequestMapping("/amvitech/contacts")
  public String contacts() {
    return "Please see the contacts here:";
  }
  
  @RequestMapping("/Amvitech/enquiry")
  public String enquiry() {
    return "Welcome to Amvi Tech Solutions enquiry page";
  }

  public static void main(String[] args) {
    SpringApplication.run(AmvitechApplication.class, args);
  }

}