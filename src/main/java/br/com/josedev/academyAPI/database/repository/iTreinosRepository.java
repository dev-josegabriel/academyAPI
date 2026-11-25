package br.com.josedev.academyAPI.database.repository;

import br.com.josedev.academyAPI.database.model.TreinosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iTreinosRepository extends JpaRepository<TreinosEntity, Integer> {

}
