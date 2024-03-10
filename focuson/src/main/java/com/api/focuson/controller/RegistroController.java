package com.api.focuson.controller;

import java.util.List;
import com.api.focuson.Model.Registro;
import com.api.focuson.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registro")
public class RegistroController {

     @Autowired
     private RegistroService registroService; 

     @GetMapping()
     public List<Registro> getAllRegisters(){
      return registroService.getAllRegisters();
     }

     
     @GetMapping("/{id}")
     public Registro getRegistroById(@PathVariable Long id){
      return registroService.getRegistroById(id);
     }
    
     @PostMapping()
     public Registro createRegistro(@RequestBody Registro registro){
      return registroService.createRegistro(registro);
     }


    }


