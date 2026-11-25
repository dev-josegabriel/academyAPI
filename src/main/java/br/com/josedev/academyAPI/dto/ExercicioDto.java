package br.com.josedev.academyAPI.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ExercicioDto {

    @NotBlank(message = "O campo nome não pode ser nulo ou vazio")
    private String nome;

    @NotBlank(message = "O campo grupoMuscular não pode ser nulo ou vazio")
    private String grupoMuscular;
}
