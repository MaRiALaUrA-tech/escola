package com.senai.infoa.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.senai.infoa.escola.services.EstudanteService;

@RestController
public class EstudanteController {
    
    @Autowired
    private EstudanteService estudanteService;

    @GetMapping("/count")                       //esse parêntes é o URN (rota) : nome do URL
    public Long contador(){
        return estudanteService.contador();
    }
}
