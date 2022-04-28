package br.com.lolstats.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_times")
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTime;
	private String nome; 
	private Double percVitoria;
	private Double percTorres;
	private Double percFb;
	private Double perc1Torre;
	private Integer posicao;
	private String tempoMedio;
	
	@ManyToOne()
	private Liga liga;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_time")
	private List<Player> players;
	
	
	public Time() {
		
	}

	public Time(Integer idTime, String nome, Double perc_vitoria, Double perc_torres, Double perc_fb,
			Double perc_1torre, Integer posicao, String tempo_medio, Liga liga) {
		super();
		this.idTime = idTime;
		this.nome = nome;
		this.percVitoria = perc_vitoria;
		this.percTorres = perc_torres;
		this.percFb = perc_fb;
		this.perc1Torre = perc_1torre;
		this.posicao = posicao;
		this.tempoMedio = tempo_medio;
	}

	
	public Integer getIdTime() {
		return idTime;
	}

	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPercVitoria() {
		return percVitoria;
	}

	public void setPercVitoria(Double percVitoria) {
		this.percVitoria = percVitoria;
	}

	public Double getPercTorres() {
		return percTorres;
	}

	public void setPercTorres(Double percTorres) {
		this.percTorres = percTorres;
	}

	public Double getPercFb() {
		return percFb;
	}

	public void setPercFb(Double percFb) {
		this.percFb = percFb;
	}

	public Double getPerc1Torre() {
		return perc1Torre;
	}

	public void setPerc1Torre(Double perc1Torre) {
		this.perc1Torre = perc1Torre;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public String getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(String tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}




	
	
}
