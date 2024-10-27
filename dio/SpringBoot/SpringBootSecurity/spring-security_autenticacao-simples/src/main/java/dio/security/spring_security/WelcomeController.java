package dio.security.spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
    @GetMapping("/users")
    @PreAuthorize("hashAnyRole('MANAGERS','USERS')")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    @PreAuthorize("hashRole('MANAGERS')")
    public String managers() {
        return "Authorized manager";
    }
}