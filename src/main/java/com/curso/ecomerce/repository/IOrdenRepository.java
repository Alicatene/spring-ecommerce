package com.curso.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecomerce.model.Orden;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {

}
