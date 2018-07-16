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

import fr.dima.tournoi.entities.Joueur;
import fr.dima.tournoi.service.JoueurService;

@RequestMapping(value = "/joueur")
@RestController
public class JoueurServlet {

	@Autowired
	private JoueurService joueurService;

	@GetMapping(value = "")
	public List<Joueur> getJoueurs() {

		return joueurService.findAll();
	}

	@GetMapping(value = "/nom/{nom}")
	public Joueur getJoueur(@PathVariable String nom) {

		return joueurService.findByName(nom);

	}

	@GetMapping(value = "/{id}")
	public Joueur getJoueur(@PathVariable Long id) {

		return joueurService.findJoueur(id);

	}

	@DeleteMapping(value = "/{id}")
	public boolean delJoueur(@PathVariable Long id) {

		return joueurService.deleteJoueur(id);

	}

	@PostMapping(value = "")
	public void AddJoueur(@RequestBody Joueur joueur) {

		joueurService.addJoueur(joueur);

	}

	@PutMapping(value = "")
	public boolean UpdateJoueur(@RequestBody Joueur joueur) {

		return joueurService.updateJoueur(joueur);

	}

}
