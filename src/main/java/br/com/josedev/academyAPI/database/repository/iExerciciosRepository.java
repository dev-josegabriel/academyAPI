package br.com.josedev.academyAPI.database.repository;

import br.com.josedev.academyAPI.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {

}
