package br.com.josedev.academyAPI.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "alunos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AlunosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private BigDecimal nome;

    @Column(nullable = false, unique = true)
    private BigDecimal email;

    @OneToOne
    @JoinColumn(name = "avaliacao_fisica_id")
    private AvaliacoesFisicasEntity avaliacaoFisica;

}
