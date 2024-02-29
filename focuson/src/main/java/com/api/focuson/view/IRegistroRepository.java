package com.api.focuson.view;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.focuson.Model.Registro;

public interface IRegistroRepository extends JpaRepository<Registro, UUID> {

}
