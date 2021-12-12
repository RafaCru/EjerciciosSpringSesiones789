package com.Ejercicio123.repository;

import com.Ejercicio123.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptoprepository extends JpaRepository<Laptop, Long> {
}
