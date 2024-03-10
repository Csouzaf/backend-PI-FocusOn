package com.api.focuson.controller;

import java.util.List;

import com.api.focuson.Model.Login;
import com.api.focuson.Model.Registro;
import com.api.focuson.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {

     @Autowired
     private LoginService loginService; 

     @GetMapping()
     public List<Login> getAllLogin(){
      return loginService.getAllLogins();
     }

     
     @GetMapping("/{id}")
     public Login getLoginById(@PathVariable Long id){
      return loginService.getLoginById(id);
     }
    
     @PostMapping()
     public ResponseEntity<Login> createLogin(@RequestBody Login login){
      return ResponseEntity.ok().body(loginService.createLogin(login));
     }


    }


