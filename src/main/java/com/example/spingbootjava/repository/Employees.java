package com.example.spingbootjava.repository;

import com.example.spingbootjava.entity.Employes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employees extends JpaRepository<Employes, Long> {


}
