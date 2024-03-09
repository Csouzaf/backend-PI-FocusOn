package com.api.focuson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.focuson.Model.Login;
import com.api.focuson.Repository.LoginRepository;

import java.util.List;

@Service
public class LoginService {

   @Autowired
   private LoginRepository loginRepository;
   
   public List<Login> getAllLogins(){
    return loginRepository.findAll();
   }

  public Login getLoginById(Long id) {
        return loginRepository.findById(id).orElse(null);
  }

   public Login createLogin(Login login){
    return loginRepository.save(login);
  }

}
