package fr.dima.tournoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dima.dto.TournoiDTO;
import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.Tournoi;
import fr.dima.tournoi.service.TournoiDtoService;
import fr.dima.tournoi.service.TournoiService;

@RequestMapping(value = "/tournoi")
@RestController
public class TournoiServlet {

	@Autowired
	private TournoiService tournoiService;


	@Autowired
	private TournoiDtoService tournoiDtoService;

	@GetMapping(value = "")
	public List<TournoiDTO> getTournois() {

		return tournoiDtoService.convertToTournoiDTO(tournoiService.findAll());
	}

	@GetMapping(value = "/nom/{nom}")
	public TournoiDTO getTournoi(@PathVariable String nom) {

		return tournoiDtoService.convertToTournoiDTO(tournoiService.findByName(nom));

	}

	@GetMapping(value = "/{id}")
	public TournoiDTO getTournoi(@PathVariable Long id) {

		return tournoiDtoService.convertToTournoiDTO(tournoiService.findTournoi(id));

	}

	@DeleteMapping(value = "/{id}")
	public boolean delEquipe(@PathVariable Long id) {

		return tournoiService.deleteTournoi(id);

	}

	@PostMapping(value = "")
	public void addTournoi(@RequestBody Tournoi tournoi) {

		tournoiService.addTournoi(tournoi);

	}

	@PutMapping(value = "")
	public boolean updateTournoi(@RequestBody Tournoi tournoi) {

		return tournoiService.updateTournoi(tournoi);

	}

	@PostMapping(value = "/{titreTournoi}/add")
	public void addEquipeToTournoi(@PathVariable("titreTournoi") String titreTournoi, @RequestBody Equipe equipe) {

		tournoiService.addEquipeToTournoi(equipe, titreTournoi);

	}

	@DeleteMapping(value = "/{titreTournoi}/{nomEquipe}")
	public void deleteEquipe(@PathVariable("titreTournoi") String titreTournoi,
			@PathVariable("nomEquipe") String nomEquipe) {

		tournoiService.deleteEquipeFromTournoi(nomEquipe, titreTournoi);

	}
}
