package fr.dima.tournoi.service;

import java.util.List;

import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.Joueur;

public interface EquipeService {

	Equipe findByName(String nom);

	Equipe findEquipe(Long id);

	void addEquipe(Equipe equipe);

	boolean deleteEquipe(Long id);

	boolean updateEquipe(Equipe equipe);
	
	void addJoueurToEquipe(String nomEquipe, Joueur joueur);
	
	void deleteJoueurFromEquipe(String nomEquipe, String nomJoueur);

	List<Equipe> findAll();

}
