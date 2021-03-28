package com.example.spring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Method class.
 */
@SpringBootApplication
@RestController
public class SpringBootApiApplication {

  /**
  * Getmap.
  *
  *
  *@return string value
  *
  */
  @GetMapping(value = "/status")
  public String apiMethod() {
    Date objectOfDate = new Date();
    DateFormat time = new SimpleDateFormat("hh:mm:ss");
    return "Running time :- " + time.format(objectOfDate);
  }
}
