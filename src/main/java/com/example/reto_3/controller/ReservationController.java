package com.example.reto_3.controller;

import com.example.reto_3.entities.Reservation;
import com.example.reto_3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservas")
public class ReservationController {

    @Autowired
    private ReservationService reservasService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservasService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation p){
        return reservasService.save(p);
    }
}
