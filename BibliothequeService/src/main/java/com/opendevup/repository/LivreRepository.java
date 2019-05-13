package com.opendevup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opendevup.metier.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {

	public Livre fibdByTitre(String titre);
	
	public List <Livre> findAll();
	
	public Livre fibdById(Long id);
}
