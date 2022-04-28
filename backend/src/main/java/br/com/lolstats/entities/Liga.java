package br.com.lolstats.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_liga")
public class Liga{
	
	@EmbeddedId
	private Integer id;
	private String nome;
	
	@OneToMany(mappedBy = "liga", cascade = CascadeType.ALL)
	private List<Time> times;
	
	public Liga() { 
	} 
	 
	public Liga(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	} 
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}  

	
}
