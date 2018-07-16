package fr.dima.tournoi.service;

import java.util.List;

import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.Tournoi;

public interface TournoiService {

	Tournoi findTournoi(Long id);

	Tournoi findByName(String nom);

	void addTournoi(Tournoi tournoi);

	boolean deleteTournoi(Long id);

	boolean updateTournoi(Tournoi tournoi);

	void addEquipeToTournoi(Equipe equipe, String titreTournoi);

	void deleteEquipeFromTournoi(String nomEquipe, String titreTournoi);

	List<Tournoi> findAll();

}
