package br.com.josedev.academyAPI.database.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exercicios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ExerciciosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "grupo_muscular", nullable = false)
    private String grupoMuscular;
}
