package br.com.josedev.academyAPI.controller;

import br.com.josedev.academyAPI.database.model.ExerciciosEntity;
import br.com.josedev.academyAPI.dto.ExercicioDto;
import br.com.josedev.academyAPI.service.ExerciciosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exercicios")
@RequiredArgsConstructor
@Validated
public class ExerciciosController {

    private final ExerciciosService exerciciosService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAll() {
        return exerciciosService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExercicio(@RequestBody @Valid ExercicioDto exercicioDto) {
        exerciciosService.save(exercicioDto);
    }

    @GetMapping("/grupos/{grupoMuscular}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAllByGrupoMuscular(@PathVariable String grupoMuscular) {
        return exerciciosService.findAllByGrupoMuscular(grupoMuscular);
    }
}
