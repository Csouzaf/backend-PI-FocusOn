package com.api.focuson.Repository;

import com.api.focuson.Model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    Boolean existsByEmail(String email);
}
