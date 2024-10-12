package com.ufps.edu.demo.entities;

import lombok.Data;

// import lombok.AllArgsConstructor;
// import lombok.EqualsAndHashCode;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;

@Data 
// @Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode @ToString
public class Alumno {
    private String nombre;
    private String codigo;
    private String carrera;
}
