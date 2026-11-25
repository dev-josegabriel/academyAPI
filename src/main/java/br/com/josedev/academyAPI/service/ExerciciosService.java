package br.com.josedev.academyAPI.service;

import br.com.josedev.academyAPI.database.model.ExerciciosEntity;
import br.com.josedev.academyAPI.database.repository.iExerciciosRepository;
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



}
