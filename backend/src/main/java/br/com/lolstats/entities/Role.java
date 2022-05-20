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
	private Long id;

	private String lane;
	
	@OneToMany(mappedBy = "role")
	private List<Player> players;

	public Role() {
	}

	public Role(Long id, String lane) {
		super();
		this.id = id;
		this.lane = lane;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return Objects.hash(id, lane, players);
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
		return Objects.equals(id, other.id) && Objects.equals(lane, other.lane)
				&& Objects.equals(players, other.players);
	}
	
	
	
}
