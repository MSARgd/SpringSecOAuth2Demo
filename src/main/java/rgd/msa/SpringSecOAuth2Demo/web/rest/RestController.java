package rgd.msa.SpringSecOAuth2Demo.web.rest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello Every One");
    }
    @GetMapping("/admin")
    public ResponseEntity<String> sayHelloToAdmin(){
        return ResponseEntity.ok("Hello Admin");
    }
    @GetMapping("/user")
    public ResponseEntity<String> sayHelloToUser(){
        return ResponseEntity.ok("Hello User");
    }
    @GetMapping("/admin-and-user")
    public ResponseEntity<String> sayHelloToUserAndAdmin(){
        return ResponseEntity.ok("Hello Users");
    }
}