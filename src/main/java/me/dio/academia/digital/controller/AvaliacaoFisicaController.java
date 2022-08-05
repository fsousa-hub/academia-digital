package me.dio.academia.digital.controller;
//Importa a classe AvaliacaoFisica
import me.dio.academia.digital.entity.AvaliacaoFisica;
//Importa a classe AvaliacaoFisicaForm
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
//Importa a classe de serviço AvaliacaoFisicaServiçoImpl
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
//Importa anotações da classe do Autowired
import org.springframework.beans.factory.annotation.Autowired;
//Importa as classes das anotações
import org.springframework.web.bind.annotation.*;
//Importa a classe List
import java.util.List;

//Controle para Avaliação Fisica
@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }

}
