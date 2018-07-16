package fr.dima.service.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dima.dto.EquipeDTO;
import fr.dima.dto.TournoiDTO;
import fr.dima.tournoi.entities.EquipeTournoi;
import fr.dima.tournoi.entities.Tournoi;
import fr.dima.tournoi.service.EquipeDtoService;
import fr.dima.tournoi.service.TournoiDtoService;

@Service
public class TournoiDtoServiceMockImpl implements TournoiDtoService {

	@Autowired
	private EquipeDtoService equipeDtoService;

	@Override
	public TournoiDTO convertToTournoiDTO(Tournoi tournoi) {
		List<EquipeDTO> equipeDTO = new ArrayList<>();
		for (EquipeTournoi equipeTournoi : tournoi.getListOfEquipeTournoi())
			equipeDTO.add(equipeDtoService.convertToEquipeDTO(equipeTournoi.getEquipe()));
		return new TournoiDTO(tournoi.getId(), tournoi.getNiveau(), tournoi.getDate(), tournoi.getTitre(), equipeDTO);
	}

	@Override
	public List<TournoiDTO> convertToTournoiDTO(List<Tournoi> listOfTournois) {
		List<TournoiDTO> tournoiDTO = new ArrayList<>();

		for (Tournoi tournoi : listOfTournois)
			tournoiDTO.add(convertToTournoiDTO(tournoi));
		return tournoiDTO;
	}

}
