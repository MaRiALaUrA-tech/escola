package com.senai.infoa.escola.services;

import java.util.List;

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
        }                                               // Os CRUD (('insert', 'select', 'upadte' e 'delete' sempre começam no 'Service' e termina no 'Controllers')
        
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
        public Estudante buscar(Integer id){                //Um parâmetro sempre tem seu tipo, como "Integer" e apelido, como"id". Aqui especifcamos que é o id, por isso não é (Estudante estudante), que traz todos os seus atributos, 
            return estudanteRepository.findById(id).get();   //.get ajuda a corrigir o problema do opcional ((pesquisar). Mostra somente o que você quer, no caso, o id
        }

        public List<Estudante> listarTodos(){
            return estudanteRepository.findAll();
        }

        public Estudante atualizar(Estudante estudante, Integer id){       //Primeiro jeito de atualizar
            Estudante e = buscar(id); // traz um método já pronto, o de buscar ((ali em cima)), sem precisar escrever o cdigo dele denovo 
            if (e != null) {
                estudante.setEstudanteId(id); //Garante que o id continua sendo o original, ou seja, pode atualizar os outros atributos, menos o id
                return estudanteRepository.save(estudante);
            }
            return null;
        }

        public boolean atualizarBoolean(Estudante estudante, Integer id){               //Segundo jeito
            if (estudanteRepository.existsById(id)){
                estudante.setEstudanteId(id);                                           //Getters e setters
                estudanteRepository.save(estudante);
                return true;
            }
            return false;

        }
}
