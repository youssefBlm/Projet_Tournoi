package fr.dima.tournoi.service;

import java.util.List;

import fr.dima.dto.EquipeDTO;
import fr.dima.tournoi.entities.Equipe;

public interface EquipeDtoService {

	EquipeDTO convertToEquipeDTO(Equipe equipe);

	List<EquipeDTO> convertToEquipeDTO(List<Equipe> ListOfEquips);
}
