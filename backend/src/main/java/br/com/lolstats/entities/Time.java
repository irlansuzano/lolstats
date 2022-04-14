package br.com.lolstats.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_times")
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTime;
	private String nomeTime;
	private Integer Integrantes;
	private List<Player> players = new ArrayList<>();
	private Campeonato campeonato;
	
	public Time() {
		
	}
	
	public Time(String nomeTime, Integer idTime, Integer integrantes, List<Player> players, Campeonato campeonato) {
		super();
		this.nomeTime = nomeTime;
		this.idTime = idTime;
		this.Integrantes = integrantes;
		this.players = players;
		this.campeonato = campeonato;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public Integer getIdTime() {
		return idTime;
	}

	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}

	public Integer getIntegrantes() {
		return Integrantes;
	}

	public void setIntegrantes(Integer integrantes) {
		Integrantes = integrantes;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	

}
