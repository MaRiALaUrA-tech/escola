package com.senai.infoa.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.escola.models.Professor;
import com.senai.infoa.escola.services.ProfessorService;



@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/count")                       
    public Long contador(){
        return professorService.contador();
    }

    @DeleteMapping("/delete/{id}")
    public String deletarString(@PathVariable Integer id){
        boolean deletou = professorService.delete(id);
        if(deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover usuário";
    }

    @PostMapping("/salvar")
     public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
 }

    @GetMapping("/buscar/{id}")
    public Professor buscar(@PathVariable Integer id){
        return professorService.buscar(id); 
}
    @GetMapping("/listar")
    public List<Professor> listarTodos(){
        return professorService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")                               // 1° jeito
    public Professor atualizar(@PathVariable Integer id, @RequestBody Professor professor){
        return professorService.atualizar(professor,id);
    }

    }


    

