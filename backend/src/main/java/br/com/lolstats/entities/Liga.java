package br.com.lolstats.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_liga")
public class Liga implements Serializable{
	private static final long serialVersionUID = 1L;
	
		
	@EmbeddedId
	private Long id;
	private String nome;
	@JsonIgnore 
	@OneToMany(mappedBy = "liga", cascade = CascadeType.ALL)
	private List<Time> times = new ArrayList<>();

	public Liga() {
	}

	public Liga(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, times);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Liga other = (Liga) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(times, other.times);
	}
	
	

}
