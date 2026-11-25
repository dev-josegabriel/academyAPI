package br.com.josedev.academyAPI.service;

import br.com.josedev.academyAPI.database.model.ExerciciosEntity;
import br.com.josedev.academyAPI.database.repository.iExerciciosRepository;
import br.com.josedev.academyAPI.dto.ExercicioDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciciosService {

    private final iExerciciosRepository exerciciosRepository;

    public List<ExerciciosEntity> findAll() {
        return exerciciosRepository.findAll();
    }

    public void save(ExercicioDto exercicioDto) {
        ExerciciosEntity exercicio = ExerciciosEntity.builder()
                        .nome(exercicioDto.getNome())
                        .grupoMuscular(exercicioDto.getGrupoMuscular())
                .build();
        exerciciosRepository.save(exercicio);
    }

    public List<ExerciciosEntity> findAllByGrupoMuscular(String grupoMuscular) {
        return exerciciosRepository.findAllByGrupoMuscular(grupoMuscular);
    }

}
