package com.opendevup.entity.LivreEntity;

import java.util.List;

import com.opendevup.metier.Livre;

public interface LivreEntityService {

	public Livre getLivreById(Long id);
	public Livre getLivreByTitre(String titre);
	public List <Livre> getALLLivre();
	public Livre addLivre(Livre livre);
	public boolean updateLivre(Livre livre);
	public boolean deleteLivreById(Long id);
}
