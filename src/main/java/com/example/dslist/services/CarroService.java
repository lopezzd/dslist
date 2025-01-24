package com.example.dslist.services;

import java.util.List;

import com.example.dslist.dto.CarroDTO;
import com.example.dslist.dto.CarroMinDTO;
import com.example.dslist.entities.Carro;
import com.example.dslist.repositories.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Transactional
    public CarroDTO findById(Long id){
        Carro result = carroRepository.findById(id).get();
        return new CarroDTO(result);
    }

    @Transactional
    public List<CarroMinDTO> findAll(){
    List<Carro> result = carroRepository.findAll();
    return result.stream().map(x -> new CarroMinDTO(x)).toList();
    }
}
