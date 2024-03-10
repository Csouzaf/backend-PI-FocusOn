package com.api.focuson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.focuson.Model.Home;
import com.api.focuson.Repository.HomeRepository;

@Service
public class HomeService {

  @Autowired
  private HomeRepository homeRepository;
   
  public Home getUserById(Long id) {
    return homeRepository.findById(id).orElse(null);
  }



}
