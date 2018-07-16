package fr.dima.service.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.dima.tournoi.entities.Joueur;
import fr.dima.tournoi.service.JoueurService;

@Service
public class JoueurServiceMockImpl implements JoueurService {

	private List<Joueur> listJoueur = new ArrayList<>();

	@Override
	public Joueur findByName(String nom) {
		for (Joueur joueur:listJoueur) {

			if (joueur.getNom().equals(nom))
				return joueur;
		}
		return null;

	}

	@Override
	public Joueur findJoueur(Long id) {
		for (Joueur joueur:listJoueur) {

			if (joueur.getId() == id)
				return joueur;
		}
		return null;
	}

	@Override
	public void addJoueur(Joueur joueur) {

		listJoueur.add(joueur);

	}

	@Override
	public boolean deleteJoueur(Long id) {
		
		for (Joueur joueur:listJoueur) {

			if (joueur.getId() == id) {
				listJoueur.remove(joueur);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateJoueur(Joueur joueur) {
		

		listJoueur.set(joueur.getId().intValue(), joueur);
			

		return true;
	}

	@Override
	public List<Joueur> findAll() {
		return listJoueur;
	}

}
