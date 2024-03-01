package com.api.focuson.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.focuson.Model.Registro;
import com.api.focuson.view.IRegistroRepository;

@RestController
@RequestMapping("/cadastrar")
public class RegistroController {
    @Autowired
    private IRegistroRepository registroRepository;

    @PostMapping("/")
    

}
