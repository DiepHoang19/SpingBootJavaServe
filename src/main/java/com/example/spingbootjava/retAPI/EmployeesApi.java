package com.example.spingbootjava.retAPI;


import com.example.spingbootjava.dto.ResponseDTO;
import com.example.spingbootjava.entity.Employes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employ")
@Validated
@CrossOrigin("*")
public class EmployeesApi {
    @Autowired
    EmployeesApi employeesApi;

    @GetMapping
    public ResponseEntity<ResponseDTO> findAllEprisees() {
        ResponseDTO responseDTO = ResponseDTO.builder()
                .status(HttpStatus.OK.toString())
                .body(employeesApi.findAllEprisees()).build();
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> createEaffee(@RequestBody Employes employees) {
        ResponseDTO responseDTO = ResponseDTO.builder()
                .status(HttpStatus.CREATED.toString())
                .body(employeesApi.createEaffee(employees)).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
}
