package com.parcial03.dw.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true, length = 5)
    private String codigo;

    @Column(nullable = true, length = 100)
    private String nombres;

    @Column(nullable = true, length = 100)
    private String apellidos;

    @Column(nullable = true, length = 1)
    private String genero;

    @Column(nullable = true, length = 250)
    private String direccion;

    @OneToOne
    @JoinColumn(name = "id_municipio", nullable = true, foreignKey = @ForeignKey(name = "FK_MUNI_EMPLE"))
    private Municipio municipio;


    @Column(nullable = true, length = 8)
    private  String telefono;

    @Column(nullable = true, length = 1)
    private  String estado;

    @Column(nullable = true, length = 250)
    private  String motivo_inactivo;
}
