package p1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
@DiscriminatorValue(value ="D")
//@Table
public class Devloper extends Emp {

	@Column(name="Skillset")
	String skillSet;

	public Devloper() {
		super();

	}

	public Devloper(int id, String name, int Sal, String skillSet) {
		super();
		this.skillSet = skillSet;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

}
