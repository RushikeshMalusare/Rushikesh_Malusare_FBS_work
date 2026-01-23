package pac1;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team {	

	@Id
	@Column(name="tid")
	int Tid;
	
	@Column(name="tname")
	String Tname;
	
	@OneToMany(targetEntity=Player.class,cascade=CascadeType.ALL)
	 Set<Player>allBatter;
	
	public Team()
	{
		
	}
	

	public Team(int tid, String tname, Set<Player> allBatter) {
		super();
		Tid = tid;
		Tname = tname;
		this.allBatter = allBatter;
	}


	public int getTid() {
		return Tid;
	}

	public void setTid(int tid) {
		Tid = tid;
	}

	public String getTname() {
		return Tname;
	}

	public void setTname(String tname) {
		Tname = tname;
	}

	public Set<Player> getAllBatter() {
		return allBatter;
	}

	public void setAllBatter(Set<Player> allBatter) {
		this.allBatter = allBatter;
	}
	
}
