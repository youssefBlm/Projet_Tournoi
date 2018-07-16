package fr.dima.tournoi.entities;

public class EquipeTournoi {

	private Long id ;
	
	private Equipe equipe ;
	
	private Tournoi tournoi ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Tournoi getTournoi() {
		return tournoi;
	}
	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public EquipeTournoi( Equipe equipe, Tournoi tournoi) {
		
		this.tournoi = tournoi;
		this.equipe = equipe;
	}
	public EquipeTournoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EquipeTournoi [id=" + id + ", tournoi=" + tournoi + ", equipe=" + equipe + "]";
	}
	
	
	
	
}
