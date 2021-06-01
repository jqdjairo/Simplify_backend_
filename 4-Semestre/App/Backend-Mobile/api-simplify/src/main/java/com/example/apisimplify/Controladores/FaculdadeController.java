package com.example.apisimplify.Controladores;

import com.example.apisimplify.Modelos.Faculdade;
import com.example.apisimplify.Repositorios.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculdade")
public class FaculdadeController {

    @Autowired
    FaculdadeRepository faculdadeRepository;

    private boolean logado = false;

    @GetMapping("/{nome}")
    public ResponseEntity getUsuarioESenha(@PathVariable("nome") String nome){
        List faculdade;
        faculdade = faculdadeRepository.findAll();
        if(!logado) {
            if (faculdade.isEmpty()) {
                return ResponseEntity.noContent().build();
            } else {
                logado = true;
                return ResponseEntity.ok(faculdade);
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
