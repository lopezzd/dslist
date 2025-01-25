package com.example.dslist.repositories;

import com.example.dslist.entities.CarroList;
import com.example.dslist.projections.CarroMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroListRepository extends JpaRepository<CarroList, Long> {

}

