package com.api.focuson.service;

import com.api.focuson.model.Login;
import com.api.focuson.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

  public Login updateLogin(Login login){
   return loginRepository.save(login);
  }

  public void deleteLogin(Long id){
   loginRepository.deleteById(id);
  }

}
