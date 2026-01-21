package com.bkseducate.app_json.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bkseducate.app_json.domain.dtos.UsuarioDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @PostMapping
    public UsuarioDto crearUsuario(@Valid @RequestBody UsuarioDto usuario) {
        // Aquí podría guardarse el usuario en la base de datos
        return usuario; // Se devuelve como respuesta de prueba
    }
}
