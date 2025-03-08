package asteroids_caravan.controller;

import asteroids_caravan.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    private  List<User> userInfo = new ArrayList<>();

    @GetMapping("/userProfile")
    public List<User> index(){
        return userInfo;
    }

    @PostMapping("/user")
    public ResponseEntity create(@RequestBody User user){
        userInfo.add(user);
        System.out.println("Usuário cadastrado " + user);
        return ResponseEntity.status(201).body(user);
    }
}
