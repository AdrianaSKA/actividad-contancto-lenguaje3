package com.itsqmet.modelo;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class HistoryClinic {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "La cédula es obligatoria")
    @Pattern(regexp = "\\d{10}", message = "La cédula debe tener 10 dígitos numéricos")
    private String cedula;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @NotNull(message = "La edad es obligatoria")
    @Min(value = 0, message = "La edad no puede ser negativa")
    @Max(value = 120, message = "La edad no puede ser mayor a 120")
    private Integer edad;

    @NotBlank(message = "El sexo es obligatorio")
    private String sexo;

    @Pattern(regexp = "\\d{7,15}", message = "El teléfono debe tener entre 7 y 15 dígitos")
    private String telefono;

    @NotBlank(message = "La dirección es obligatoria")
    @Size(min = 5, max = 150, message = "La dirección debe tener entre 5 y 150 caracteres")
    private String direccion;

    @Size(max = 50, message = "La ocupación no debe superar los 50 caracteres")
    private String ocupacion;

    @NotBlank(message = "El estado civil es obligatorio")
    private String estadoCivil;

    @Size(max = 200, message = "El campo de alergias no debe superar los 200 caracteres")
    private String alergias;

    @Size(max = 300, message = "El campo de enfermedades crónicas no debe superar los 300 caracteres")
    private String enfermedades;

    @Size(max = 300, message = "El campo de medicación no debe superar los 300 caracteres")
    private String medicacion;

    @NotBlank(message = "El motivo de consulta es obligatorio")
    @Size(max = 400, message = "El motivo de consulta no debe superar los 400 caracteres")
    private String motivoConsulta;

    @Size(max = 400, message = "El diagnóstico preliminar no debe superar los 400 caracteres")
    private String diagnostico;

    @NotNull(message = "La fecha de atención es obligatoria")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaAtencion;

}
