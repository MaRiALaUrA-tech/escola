package com.senai.infoa.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.senai.infoa.escola.models.Professor;
import com.senai.infoa.escola.repositories.ProfessorRepository;



@Service
public class ProfessorService {

    @Autowired                                            
    private ProfessorRepository professorRepository;
        public Long contador(){                           
            return professorRepository.count();          
        }

        public void delatar(Integer id){                 
            professorRepository.deleteById(id);          
        }                                               
        public Professor salvar(Professor professor){
            return professorRepository.save(professor);

        }

        public boolean delete(Integer id){               
            Professor professor = professorRepository.findById(id).get();
            if(professor != null) {
                professorRepository.deleteById(id);
                return true;
            }
            return false;
        }
        public Professor buscar(Integer id){                
            return professorRepository.findById(id).get();   
        }

        public List<Professor> listarTodos(){
            return professorRepository.findAll();
        }

        public Professor atualizar(Professor professor, Integer id){       //Primeiro jeito de atualizar
            Professor p = buscar(id); 
            if (p != null) {
                professor.setProfessorId(id); 
                return professorRepository.save(professor);
            }
            return null;
        }

    
}
