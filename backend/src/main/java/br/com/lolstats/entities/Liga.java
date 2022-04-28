package br.com.lolstats.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_campeonato")
public class Campeonato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	private List<Time> times = new ArrayList<> ();
	
	public Campeonato() {
		
	}
	
	
	
	public Campeonato(Integer id, String nome) {
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

	public void addTeam(Time time) {
		times.add(time);
	}
	
	public void removeTeam(Time time) {
		times.remove(time);
	}
	
	
	

}
