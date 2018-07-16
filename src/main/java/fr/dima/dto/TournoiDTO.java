package fr.dima.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TournoiDTO {

	private Long id;
	private int niveau;
	private Date date;
	private String titre;
	private List<EquipeDTO> listOfEquipeDTO = new ArrayList<>();

	public TournoiDTO(Long id, int niveau, Date date, String titre, List<EquipeDTO> listOfEquipeDTO) {
		super();
		this.id = id;
		this.niveau = niveau;
		this.date = date;
		this.titre = titre;
		this.listOfEquipeDTO = listOfEquipeDTO;
	}

	public TournoiDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<EquipeDTO> getListOfEquipeDTO() {
		return listOfEquipeDTO;
	}

	public void setListOfEquipDTO(List<EquipeDTO> listOfEquipeDTO) {
		this.listOfEquipeDTO = listOfEquipeDTO;
	}

	@Override
	public String toString() {
		return "TournoiDTO [id=" + id + ", niveau=" + niveau + ", date=" + date + ", titre=" + titre
				+ ", listOfEquipeDTO=" + listOfEquipeDTO + "]";
	}

}
