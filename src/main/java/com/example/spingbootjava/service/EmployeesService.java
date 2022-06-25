package com.example.spingbootjava.service;

import com.example.spingbootjava.entity.Employes;
import com.example.spingbootjava.repository.Employees;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeesService {
    @Autowired
    EmployeesService employeesService;
    @Autowired
    Employees employees;

    public Employes createEaffee(Employes stock) {
        return employeesService.createEaffee(stock);
    }

    public List<Employes> findAllEprisees() {
        return employeesService.findAllEprisees();
    }


}
