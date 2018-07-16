package fr.dima.dto;

import java.util.ArrayList;
import java.util.List;

import fr.dima.tournoi.entities.Joueur;

public class EquipeDTO {

	private Long id ;
	private String nom ;
	private List<Joueur> listOfJoueurs =new ArrayList<>();
	
	
	
	public EquipeDTO(Long id, String nom, List<Joueur> listOfJoueurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.listOfJoueurs = listOfJoueurs;
	}
	
	public EquipeDTO() {

	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Joueur> getListOfJoueurs() {
		return listOfJoueurs;
	}
	public void setListOfJoueurs(List<Joueur> listOfJoueurs) {
		this.listOfJoueurs = listOfJoueurs;
	}

	@Override
	public String toString() {
		return "equipeDTO [id=" + id + ", nom=" + nom + ", listOfJoueurs=" + listOfJoueurs + "]";
	}
	
	
}
