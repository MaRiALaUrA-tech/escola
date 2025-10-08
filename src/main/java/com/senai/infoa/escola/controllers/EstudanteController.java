package com.senai.infoa.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.escola.models.Estudante;
import com.senai.infoa.escola.services.EstudanteService;



@RestController
public class EstudanteController {
    
    @Autowired
    private EstudanteService estudanteService;

    @GetMapping("/count")                       //esse parênteses é o URN ((rota)) : nome do URL
    public Long contador(){
        return estudanteService.contador();
    }

    // @DeleteMapping("/delete/{id}")
    // public void deletar(@PathVariable Integer  id) { //PathVariable é o caminho que vai possibilitar escolher o id/estudante que irá deletar
    //     estudanteService.delatar(id);               //Delete no Java continuação
    // }

    @DeleteMapping("/delete/{id}")
    public String deletarString(@PathVariable Integer id){
        boolean deletou = estudanteService.delete(id);
        if(deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover usuário";
    }

 @PostMapping("/salvar")
 public Estudante salvar(@RequestBody Estudante estudante) {
    return estudanteService.salvar(estudante);
 }


    }

