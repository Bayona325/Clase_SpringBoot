package com.bkseducate.app_json.domain.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDto {

    @NotBlank(message = "{usuario.nombre.notblank}")
    private String nombre;

    @Email(message = "{usuario.email.invalid}")
    @NotBlank(message = "{usuario.email.notblank}")
    private String email;

    @Min(value = 18, message = "{usuario.edad.min}")
    @Max(value = 99, message = "{usuario.edad.max}")
    private int edad;

    @Valid
    private DireccionDto direccion;

    public UsuarioDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public DireccionDto getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDto direccion) {
        this.direccion = direccion;
    }

    
}
