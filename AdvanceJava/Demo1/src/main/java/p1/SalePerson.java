package p1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@DiscriminatorValue(value="S")
//@Table
public class SalePerson extends Emp{

	@Column(name="Target")
	int target;

	public SalePerson() {
		
	}

	public SalePerson(int id,String name,int sal, int target) {
		super();
		this.target = target;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	
	
	
	
}
