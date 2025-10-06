package com.senai.infoa.escola.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.escola.repositories.EstudanteRepository;

//Usar ctrl espaço no final da palavra para fazer seu import

@Service
public class EstudanteService {

    @Autowired                                            //injeção de dependência -- importa o estudante repository para cá
    private EstudanteRepository estudanteRepository;
        public Long contador(){                           /*Vai me retornar um número grande, chamo o método de "contador" */
            return estudanteRepository.count();          //Conta quantos estudantes têm registrados
        }
}
