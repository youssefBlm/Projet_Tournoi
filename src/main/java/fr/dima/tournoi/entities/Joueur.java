package fr.dima.tournoi.entities;

public class Joueur {
	
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private static int conteur=0;
	
	
	
	
	
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Joueur(String nom, String prenom, String email) {
		this.id=(long)conteur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		conteur++;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
}
