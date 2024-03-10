package com.api.focuson.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.focuson.Model.Registro;
import java.util.List;


@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

    Boolean existsByEmail(String email);
    Boolean existsByPassword(String password);
}
