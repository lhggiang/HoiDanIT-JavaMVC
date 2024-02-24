package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot Hoang Giang update!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "For User";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "For Admin";
    }
}
