package fr.dima;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.dima.service.mock.EquipeServiceMockImpl;
import fr.dima.service.mock.JoueurServiceMockImpl;
import fr.dima.service.mock.TournoiServiceMockImpl;
import fr.dima.tournoi.entities.Equipe;
import fr.dima.tournoi.entities.Joueur;
import fr.dima.tournoi.entities.Tournoi;

@SpringBootApplication
public class TournoiProjectApplication implements CommandLineRunner {

	@Autowired
	private TournoiServiceMockImpl tournoiServiceMockImpl;

	@Autowired
	private EquipeServiceMockImpl equipeServiceMockImpl;

	@Autowired
	private JoueurServiceMockImpl joueurServiceMockImpl;

	public static void main(String[] args) {
		SpringApplication.run(TournoiProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Date date = new Date();
		
		joueurServiceMockImpl.addJoueur(new Joueur("Amrabat", "Nordin", "Nordin.Amrabat@live.fr"));
		joueurServiceMockImpl.addJoueur(new Joueur("Messi", "Lionel", "Lionel.Messi@gmail.com"));

		tournoiServiceMockImpl.addTournoi(new Tournoi(1l,1, date, "Tournoi1"));
		

		equipeServiceMockImpl.addEquipe(new Equipe(1l,"Maroc"));
		equipeServiceMockImpl.addEquipe(new Equipe(1l,"France"));



	}
}
