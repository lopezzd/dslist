package com.example.dslist.services;

import com.example.dslist.dto.CarroListDTO;
import com.example.dslist.dto.CarroMinDTO;
import com.example.dslist.entities.Carro;
import com.example.dslist.entities.CarroList;
import com.example.dslist.repositories.CarroListRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroListService {

    @Autowired
    private CarroListRepository carroListRepository;

    @Transactional
    public List<CarroListDTO> findAll(){
    List<CarroList> result = carroListRepository.findAll();
    return result.stream().map(x -> new CarroListDTO(x)).toList();
    }
}
