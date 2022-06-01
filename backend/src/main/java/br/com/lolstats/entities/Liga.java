package br.com.lolstats.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_liga")
public class Liga implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLiga;
	private String nome;
	@JsonIgnore 
	@OneToMany(mappedBy = "liga")
	private List<Time> times;


	public static Liga converter(Liga liga){
		var l = new Liga();
		l.setId(liga.getId());
		l.setNome(liga.getNome());

		return l;
	}

	public Liga() {
	}

	public Liga(Long id, String nome) {
		super();
		this.idLiga = id;
		this.nome = nome;
	}

	public Long getId() {
		return idLiga;
	}

	public void setId(Long id) {
		this.idLiga = id;
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
		return Objects.hash(idLiga, nome, times);
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
		return Objects.equals(idLiga, other.idLiga) && Objects.equals(nome, other.nome) && Objects.equals(times, other.times);
	}
	
	

}
