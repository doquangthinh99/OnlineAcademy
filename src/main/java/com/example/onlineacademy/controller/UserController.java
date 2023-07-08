package com.example.onlineacademy.controller;

import com.example.onlineacademy.model.UsersModel;
import com.example.onlineacademy.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


class LoginForm{
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
@RestController
public class UserController {
    @Autowired
    PasswordEncoder passwordEncoder;
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired UserRepository repo;
    @PostMapping (value = "/login")
    public ResponseEntity<Object> Login(@RequestBody LoginForm login){
        List<UsersModel> users = repo.findUserByEmail(login.getEmail());

        Map<String,String> respond = new HashMap<>();
        if(users.size()>0){
            if(passwordEncoder.matches(login.getPassword(), users.get(0).getPassword()))
            {
                respond.put("status","Success");
                return new ResponseEntity<Object>(respond, HttpStatus.OK);
            }
            else{
                respond.put("status","password wrong");
                return new ResponseEntity<Object>(respond, HttpStatus.FORBIDDEN);
            }
        }
        else{
            respond.put("status","Login failed");
            return new ResponseEntity<Object>(respond, HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping(value = "/signup")
    public ResponseEntity<Object> SignUp(@RequestBody LoginForm signUp){
        List<UsersModel> users = repo.findUserByEmail(signUp.getEmail());

        Map<String,String> respond = new HashMap<>();
        if(users.size()>0){
            respond.put("status","Email already exits");
            return new ResponseEntity<Object>(respond, HttpStatus.BAD_REQUEST);
        }
        else{
            respond.put("status","Sign up success");
            UsersModel newUser = new UsersModel(signUp.getEmail(),passwordEncoder.encode(signUp.getPassword()));
            repo.save(newUser);
            return new ResponseEntity<Object>(respond, HttpStatus.OK);
        }
    }

}
