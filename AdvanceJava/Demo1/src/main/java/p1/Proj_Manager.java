package p1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@DiscriminatorValue(value ="PM")
//@Table
public class Proj_Manager extends Devloper {

	@Column(name="Teamsize")
	int teamSize;

	public Proj_Manager(int id,String name,int Sal,String skillSet,int target) {
		
	}
	
	public Proj_Manager(int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
	
}
