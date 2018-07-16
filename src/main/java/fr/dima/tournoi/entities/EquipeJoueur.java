package fr.dima.tournoi.entities;

public class EquipeJoueur {

	private Long id;
	
	private Equipe equipe;
	private Joueur joueur;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public EquipeJoueur(Equipe equipe, Joueur joueur) {

		this.joueur = joueur;
		this.equipe = equipe;

	}

	public EquipeJoueur() {
		
	}

	@Override
	public String toString() {
		return "EquipeJoueur [id=" + id + ", joueur=" + joueur + "]";
	}



}
