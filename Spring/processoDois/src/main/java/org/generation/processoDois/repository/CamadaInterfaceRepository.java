package org.generation.processoDois.repository;

import java.util.List;


import org.generation.processoDois.model.CamadaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamadaInterfaceRepository extends JpaRepository<CamadaModel, Long>{
	public List<CamadaModel> findAllByTituloContainingIgnoreCase(String umTitulo);

}
