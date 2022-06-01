package br.com.lolstats.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;

	private String lane;
	
	@OneToMany(mappedBy = "role")
	private List<Player> players;

	public Role() {
	}

	public Role(Long id, String lane) {
		super();
		this.idRole = id;
		this.lane = lane;
	}

	public Long getId() {
		return idRole;
	}

	public void setId(Long id) {
		this.idRole = id;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public List<Player> getPlayers() {
		return players;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idRole, lane, players);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(idRole, other.idRole) && Objects.equals(lane, other.lane)
				&& Objects.equals(players, other.players);
	}
	
	
	
}
