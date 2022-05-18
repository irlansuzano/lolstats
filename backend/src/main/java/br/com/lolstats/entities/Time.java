package br.com.lolstats.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
public class Time implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTime;
	private String nome;
	private Double percVitoria;
	private Double percTorres;
	private Double percFb;
	private Double perc1Torre;
	private Integer posicao;
	private String tempoMedio;

	@ManyToOne
	@JoinColumn(name = "id_liga")
	private Liga liga;

	@OneToMany(mappedBy = "time")
	private List<Player> players;

	public Time() {

	}

	public Time(Long idTime, String nome, Double perc_vitoria, Double perc_torres, Double perc_fb, Double perc_1torre,
			Integer posicao, String tempo_medio, Liga liga) {
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

	public Long getIdTime() {
		return idTime;
	}

	public void setIdTime(Long idTime) {
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

	@Override
	public int hashCode() {
		return Objects.hash(idTime, liga, nome, perc1Torre, percFb, percTorres, percVitoria, players, posicao,
				tempoMedio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return Objects.equals(idTime, other.idTime) && Objects.equals(liga, other.liga)
				&& Objects.equals(nome, other.nome) && Objects.equals(perc1Torre, other.perc1Torre)
				&& Objects.equals(percFb, other.percFb) && Objects.equals(percTorres, other.percTorres)
				&& Objects.equals(percVitoria, other.percVitoria) && Objects.equals(players, other.players)
				&& Objects.equals(posicao, other.posicao) && Objects.equals(tempoMedio, other.tempoMedio);
	}

}
