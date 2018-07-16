package fr.dima.service.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.dima.dto.EquipeDTO;
import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.EquipeJoueur;
import fr.dima.tournoi.entities.Joueur;
import fr.dima.tournoi.service.EquipeDtoService;


@Service
public class EquipeDtoServiceMockImpl implements EquipeDtoService{

	@Override
	public EquipeDTO convertToEquipeDTO(Equipe equipe) {
		List<Joueur> joueurs= new ArrayList<>();
		for(EquipeJoueur equipeJoueur:equipe.getListOfEquipeJoueur())
		joueurs.add(equipeJoueur.getJoueur()); 
		return new EquipeDTO(equipe.getId(),equipe.getNom(),joueurs);
		
	}

	@Override
	public List<EquipeDTO> convertToEquipeDTO(List<Equipe> ListOfEquips) {
		List<EquipeDTO> equipeDTO=new ArrayList<>();
		
		for( Equipe equipe:ListOfEquips)
			equipeDTO.add(convertToEquipeDTO(equipe));
		return equipeDTO;
	}

}
