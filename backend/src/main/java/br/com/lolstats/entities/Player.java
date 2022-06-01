package br.com.lolstats.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_player")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlayer;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role role;

	@ManyToOne
	@JoinColumn(name = "id_time")
	private Time time;

	public Player() {

	}

	public Player(Long id, String nome, Role role, Time time) {
		super();
		this.idPlayer = id;
		this.nome = nome;
		this.role = role;
		this.time = time;
	}

	public Long getId() {
		return idPlayer;
	}

	public void setId(Long id) {
		this.idPlayer = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPlayer, nome, role, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(idPlayer, other.idPlayer) && Objects.equals(nome, other.nome) && Objects.equals(role, other.role)
				&& Objects.equals(time, other.time);
	}

	
	
}
