package fr.dima.tournoi.entities;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

	private Long id;
	private String nom;
	private List<EquipeJoueur> listOfEquipeJoueur=new ArrayList<>();


	public Equipe() {

	}

	public Equipe(Long id, String nom) {

		this.id = id;
		this.nom = nom;
		
	}
	
	
	public Equipe(Long id, String nom,Joueur joueur) {

		this.id = id;
		this.nom = nom;
		this.listOfEquipeJoueur.add(new EquipeJoueur(this,joueur));
		

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

	public List<EquipeJoueur> getListOfEquipeJoueur() {
		return listOfEquipeJoueur;
	}

	public void setEquipeJoueur(EquipeJoueur equipeJoueur) {
		
		this.listOfEquipeJoueur.add(equipeJoueur);
		
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nom=" + nom + "listOfEquipeJoueur" + listOfEquipeJoueur + "]";
	}

}
