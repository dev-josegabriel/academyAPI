package br.com.josedev.academyAPI.database.repository;

import br.com.josedev.academyAPI.database.model.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iAlunosRepository extends JpaRepository<AlunosEntity, Integer> {

}
