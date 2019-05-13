package com.opendevup.entity.LivreEntity.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.opendevup.entity.LivreEntity.LivreEntityService;
import com.opendevup.metier.Livre;
import com.opendevup.repository.LivreRepository;

@Service
@Transactional
public class LivreEntityServiceImpl implements LivreEntityService {

	private LivreRepository livrerepository;

	@Override
	public Livre getLivreById(Long id) {

		return this.livrerepository.fibdById(id);
	}

	@Override
	public Livre getLivreByTitre(String titre) {

		return this.livrerepository.fibdByTitre(titre);
	}

	@Override
	public List<Livre> getALLLivre() {
		List<Livre> list = new ArrayList<>();
		livrerepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public Livre addLivre(Livre livre) {

		try {
			return this.livrerepository.save(livre);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean updateLivre(Livre livre) {
		try {
			this.livrerepository.save(livre);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteLivreById(Long id) {
		try {
			this.livrerepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
