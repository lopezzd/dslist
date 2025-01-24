package com.example.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "tb_carro_list")
public class CarroList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public CarroList(){

    }

    public CarroList(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CarroList carroList = (CarroList) o;
        return Objects.equals(id, carroList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
