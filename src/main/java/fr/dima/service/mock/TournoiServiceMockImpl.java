package fr.dima.service.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.EquipeTournoi;
import fr.dima.tournoi.entities.Tournoi;
import fr.dima.tournoi.service.EquipeService;
import fr.dima.tournoi.service.TournoiService;

@Service
public class TournoiServiceMockImpl implements TournoiService {

	private List<Tournoi> listOfTournoi = new ArrayList<>();

	@Autowired
	private EquipeService equipeService;

	@Override
	public Tournoi findTournoi(Long id) {

		for (Tournoi tournoi : listOfTournoi) {

			if (tournoi.getId() == id) {
				return tournoi;
			}
		}
		return null;
	}

	@Override
	public void addTournoi(Tournoi tournoi) {

		listOfTournoi.add(tournoi);
	}

	@Override
	public boolean deleteTournoi(Long id) {
		for (Tournoi tournoi : listOfTournoi) {

			if (tournoi.getId() == id) {
				listOfTournoi.remove(tournoi);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateTournoi(Tournoi tournoi) {

		listOfTournoi.set(tournoi.getId().intValue(), tournoi);

		return true;
	}

	@Override
	public List<Tournoi> findAll() {

		return listOfTournoi;
	}

	@Override
	public Tournoi findByName(String nom) {

		for (Tournoi tournoi : listOfTournoi)
			if (tournoi.getTitre().equals(nom))
				return tournoi;

		return null;
	}

	@Override
	public void addEquipeToTournoi(Equipe equipe, String titreTournoi) {
		Tournoi tournoi = findByName(titreTournoi);
		Equipe equipe2 = equipeService.findByName(equipe.getNom());
		if (tournoi == null)
			System.out.println("Cette Tournoi n'existe pas !");
		else {
			if (equipe2 == null)	{
				equipeService.addEquipe(equipe);
				tournoi.setEquipeTournoi(new EquipeTournoi(equipe, tournoi));
	
			}else
			tournoi.setEquipeTournoi(new EquipeTournoi(equipe2, tournoi));
		}
	}

	@Override
	public void deleteEquipeFromTournoi(String nomEquipe, String titreTournoi) {
		Tournoi tournoi = findByName(titreTournoi);
		for (EquipeTournoi equipeTournoi : tournoi.getListOfEquipeTournoi()) {
			if (equipeTournoi.getEquipe().getNom().equals(nomEquipe)) {

				tournoi.getListOfEquipeTournoi().remove(equipeTournoi);

				return;
			}
		}

	}

}
