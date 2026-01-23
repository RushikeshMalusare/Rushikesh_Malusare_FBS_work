package pac1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Player {

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	
	@Column(name="jersey")
	int jersey;
	
	@ManyToOne(targetEntity=Team.class)
	Team team;
	
	public Player() {
		
	}
	
	public Player(int id, String name, int jersey,Team team) {
		super();
		this.id = id;
		this.name = name;
		this.jersey = jersey;
		this.team=team;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJersey() {
		return jersey;
	}


	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	
	public Team getteam() {
		return team;
	}


	public void setteam(Team team) {
		this.team = team;
	}
	
	
}
