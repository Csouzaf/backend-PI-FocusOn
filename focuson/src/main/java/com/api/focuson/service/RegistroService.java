package com.api.focuson.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.focuson.Model.Login;
import com.api.focuson.Model.Registro;
import com.api.focuson.Repository.RegistroRepository;

import java.util.List;

@Service
public class RegistroService {

   @Autowired
   private RegistroRepository registroRepository;
   
   public List<Registro> getAllRegisters(){
    return registroRepository.findAll();
   }

  public Registro getLoginById(Long id) {
        return registroRepository.findById(id).orElse(null);
  }

   public Registro createLogin(Registro registro){
    return registroRepository.save(registro);
  }

}
