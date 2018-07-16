package fr.dima.service.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.EquipeJoueur;
import fr.dima.tournoi.entities.Joueur;
import fr.dima.tournoi.service.EquipeService;
import fr.dima.tournoi.service.JoueurService;

@Service
public class EquipeServiceMockImpl implements EquipeService {

	private List<Equipe> listEquipe = new ArrayList<>();
	@Autowired
	private JoueurService joueurService;

	@Override
	public Equipe findByName(String nom) {

		for (Equipe equipe : listEquipe) {
			if (equipe.getNom().equals(nom))
				return equipe;
		}

		return null;
	}

	@Override
	public Equipe findEquipe(Long id) {

		for (Equipe equipe : listEquipe) {
			if (equipe.getId() == id)
				return equipe;
		}

		return null;
	}

	@Override
	public void addEquipe(Equipe equipe) {
		listEquipe.add(equipe);

	}

	@Override
	public boolean deleteEquipe(Long id) {

		for (Equipe equipe : listEquipe) {
			if (equipe.getId() == id) {
				listEquipe.remove(equipe);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Equipe> findAll() {
		return listEquipe;
	}

	@Override
	public boolean updateEquipe(Equipe equipe) {

		listEquipe.set(equipe.getId().intValue(), equipe);

		return true;
	}

	@Override
	public void addJoueurToEquipe(String nomEquipe, Joueur joueur) {

		Equipe equipe = findByName(nomEquipe);
		Joueur joueur2 = joueurService.findByName(joueur.getNom());
		if (equipe == null)
			System.out.println("cette équipe n'existe pas !");
		else {
			if (joueur2 == null) {
				joueurService.addJoueur(joueur);
				equipe.setEquipeJoueur(new EquipeJoueur(equipe, joueur));

			}else
			equipe.setEquipeJoueur(new EquipeJoueur(equipe, joueur2));
		}
	}

	@Override
	public void deleteJoueurFromEquipe(String nomEquipe, String nomJoueur) {
		Equipe equipe = findByName(nomEquipe);
		for (EquipeJoueur equipeJoueur : equipe.getListOfEquipeJoueur()) {
			if (equipeJoueur.getJoueur().getNom().equals(nomJoueur)) {

				equipe.getListOfEquipeJoueur().remove(equipeJoueur);

				return;
			}
		}

	}

}
