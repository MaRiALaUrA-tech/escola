package com.senai.infoa.escola.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.escola.models.Estudante;
import com.senai.infoa.escola.repositories.EstudanteRepository;

//Usar ctrl espaço no final da palavra para fazer seu import

@Service
public class EstudanteService {

    @Autowired                                            //injeção de dependência -- importa o estudante repository para cá
    private EstudanteRepository estudanteRepository;
        public Long contador(){                           /*Vai me retornar um número grande, chamo o método de "contador" */
            return estudanteRepository.count();          //Conta quantos estudantes têm registrados
        }

        public void delatar(Integer id){                  // 'void' = sem retorno
            estudanteRepository.deleteById(id);          //Delete no Java 
        }                                               // Os CRUD ('insert', 'select', 'upadte' e 'delete' sempre começam no 'Service' e termina no 'Controllers')
        
        public Estudante salvar(Estudante estudante){
            return estudanteRepository.save(estudante);

        }

        public boolean delete(Integer id){
            Estudante estudante = estudanteRepository.findById(id).get();
            if(estudante != null) {
                estudanteRepository.deleteById(id);
                return true;
            }
            return false;
        }
}
