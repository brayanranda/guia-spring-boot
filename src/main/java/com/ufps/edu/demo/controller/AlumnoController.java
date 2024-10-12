package com.ufps.edu.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ufps.edu.demo.entities.Alumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AlumnoController {

    @GetMapping("/saludar")
    public String getMethodName() {
        return "Hola mundo";
    }

    @GetMapping("/alumnos")
    public List<String> getListaAlumnos() {
        List <String> alumnos = new ArrayList<>();

        alumnos.add("brayan");
        alumnos.add("ismael");
        alumnos.add("erick");
        alumnos.add("nohora");

        return alumnos;
    }

    @GetMapping("/alumno")
    public Map<String, String> getAlumno () {
        Map <String, String> alumno = new HashMap();

        alumno.put("nombre", "Brayan");
        alumno.put("email", "brayan@gmail.com");
        alumno.put("phone", "31728982");
        
        return alumno;
    }

    @GetMapping("/alumno_with_entity")
    public Alumno getAlumnoWithEntity() {
        Alumno alumno = new Alumno();

        alumno.setNombre("Brayan Peñaranda");
        alumno.setCodigo("1151479");
        alumno.setCarrera("Ingenieria de sistemas");

        return alumno;
    }

    @GetMapping("/list-alumnos")
    public List<Alumno> getListAlumnos () {
        List<Alumno> lista_alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Ryan");
        alumno1.setCodigo("1151480");
        alumno1.setCarrera("sistemas");

        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Randa");
        alumno2.setCodigo("1151481");
        alumno2.setCarrera("produccion");

        lista_alumnos.add(alumno1);
        lista_alumnos.add(alumno2);

        return lista_alumnos;
    }
    
}
