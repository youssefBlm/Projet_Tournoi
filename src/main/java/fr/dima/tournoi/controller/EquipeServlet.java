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

import fr.dima.dto.EquipeDTO;
import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.Joueur;
import fr.dima.tournoi.service.EquipeDtoService;
import fr.dima.tournoi.service.EquipeService;

@RequestMapping(value = "/equipe")
@RestController
public class EquipeServlet {

	@Autowired
	private EquipeService equipeService;

	@Autowired
	private EquipeDtoService equipeDtoService;

	@GetMapping
	public List<EquipeDTO> getEquipes() {

		return equipeDtoService.convertToEquipeDTO(equipeService.findAll());
	}

	@GetMapping(value = "/nom/{nom}")
	public EquipeDTO getEquipe(@PathVariable String nom) {

		return equipeDtoService.convertToEquipeDTO(equipeService.findByName(nom));

	}

	@GetMapping(value = "/{id}")
	public EquipeDTO getEquipe(@PathVariable Long id) {

		return equipeDtoService.convertToEquipeDTO(equipeService.findEquipe(id));

	}

	@DeleteMapping(value = "/{id}")
	public boolean deleteEquipe(@PathVariable Long id) {

		return equipeService.deleteEquipe(id);

	}

	@PostMapping
	public void AddEquipe(@RequestBody Equipe equipe) {

		equipeService.addEquipe(equipe);

	}

	@PutMapping(value = "")
	public boolean UpdateEquipe(@RequestBody Equipe equipe) {

		return equipeService.updateEquipe(equipe);

	}

	@PostMapping(value = "/{nomEquipe}/add")
	public void AddJoueurToEquipe(@PathVariable("nomEquipe") String nomEquipe, @RequestBody Joueur joueur) {

		equipeService.addJoueurToEquipe(nomEquipe, joueur);

	}

	@DeleteMapping(value = "/{nomEquipe}/{nomJoueur}")
	public void deleteEquipe(@PathVariable("nomEquipe") String nomEquipe, @PathVariable("nomJoueur") String nomJoueur) {

		equipeService.deleteJoueurFromEquipe(nomEquipe, nomJoueur);

	}

}
