package com.parcial03.dw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EmpleadoDTO {
    @EqualsAndHashCode.Include
    private Integer id;
    @Nullable
    private String codigo;
    @Nullable
    private String nombres;
    @Nullable
    private String apellidos;
    @Nullable
    private String genero;
    @Nullable
    private String direccion;
    @Nullable
    private MunicipioDTO municipio;
    @Nullable
    private String telefono;
    @Nullable
    private String estado;
    @Nullable
    private String motivo_inactivo;
    @Nullable
    private Float salario;
}
