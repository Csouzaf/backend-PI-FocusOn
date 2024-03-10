package com.api.focuson.controller;

import java.util.List;

import com.api.focuson.Model.Home;
import com.api.focuson.Model.Login;
import com.api.focuson.service.HomeService;
import com.api.focuson.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {

     @Autowired
     private HomeService homeService; 
     
     @GetMapping("/{id}")
     public ResponseEntity<Home> getLoginById(@PathVariable Long id){
      return ResponseEntity.ok().body(homeService.getUserById(id)); 
     }

}


