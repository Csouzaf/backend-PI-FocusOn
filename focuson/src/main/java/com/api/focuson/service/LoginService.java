package com.api.focuson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.focuson.Error.ExceptionError;
import com.api.focuson.Model.Login;
import com.api.focuson.Repository.LoginRepository;
import com.api.focuson.Repository.RegistroRepository;
import java.util.List;

@Service
public class LoginService {

   @Autowired
   private LoginRepository loginRepository;

   @Autowired
   private RegistroRepository registroRepository;
   
   public List<Login> getAllLogins(){
    return loginRepository.findAll();
   }

  public Login getLoginById(Long id) {
        return loginRepository.findById(id).orElse(null);
  }

   public Login createLogin(Login login){
  
    if(loginRepository.existsByEmail(login.getEmail())){
      throw new ExceptionError("Já existe um usuário com este e-mail");
    }

    return loginRepository.save(login);
   
  }

}
