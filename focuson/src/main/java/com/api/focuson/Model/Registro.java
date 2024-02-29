package com.api.focuson.Model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "cadastro")
@Data // adiciona os getters e setters //
public class Registro {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID Id; // UUID, id mais seguro para a nossa aplicação//
    private String username;
    private String email;
    private String password;

}
