package dio.api.exemplo.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Para ser um componente REST, preciso denominar a anotação @restcontroller
public class WelcomeController {
  @GetMapping
  public String welcome(){
    return "Welcome to my Spring boot Web API";
  }
}
