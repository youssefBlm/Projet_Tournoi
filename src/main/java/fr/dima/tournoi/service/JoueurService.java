package fr.dima.tournoi.service;

import java.util.List;

import fr.dima.tournoi.entities.Joueur;

public interface JoueurService {

	Joueur findByName(String nom);

	Joueur findJoueur(Long id);

	void addJoueur(Joueur joueur);

	boolean deleteJoueur(Long id);

	boolean updateJoueur(Joueur joueur);

	List<Joueur> findAll();

}
