package fr.dima.tournoi.service;

import java.util.List;

import fr.dima.dto.TournoiDTO;
import fr.dima.tournoi.entities.Tournoi;

public interface TournoiDtoService {

	TournoiDTO convertToTournoiDTO(Tournoi tournoi);
	
	List<TournoiDTO> convertToTournoiDTO(List<Tournoi> listOfTournois);
	
}
