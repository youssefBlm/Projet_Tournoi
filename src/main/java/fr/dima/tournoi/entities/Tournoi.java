package fr.dima.tournoi.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tournoi {

	private Long id;
	private int niveau;
	private Date date;
	private String titre;
	List<EquipeTournoi> listOfEquipeTournoi=new ArrayList<>();

	public Tournoi() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tournoi(long id,int niveau, Date date, String titre) {
		
		this.id = id;
		this.niveau = niveau;
		this.date = date;
		this.titre = titre;
		
	}
public Tournoi(long id,int niveau, Date date, String titre,Equipe equipe) {
		
		this.id = id;
		this.niveau = niveau;
		this.date = date;
		this.titre = titre;
		this.listOfEquipeTournoi.add(new EquipeTournoi(equipe,this));
		
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<EquipeTournoi> getListOfEquipeTournoi() {
		return listOfEquipeTournoi;
	}

	public void setEquipeTournoi(EquipeTournoi equipeTournoi) {
		this.listOfEquipeTournoi.add(equipeTournoi);
	}

	@Override
	public String toString() {
		return "Tournoi [id=" + id + ", niveau=" + niveau + ", date=" + date + ", titre=" + titre + ", listOfEquipeTournoi="
				+ listOfEquipeTournoi + "]";
	}



}
