package p1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@Entity
//@Table(name="Employee")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emptype")

//@DiscriminatorValue(name="")
public abstract class Emp {
	
	@Id
	@Column(name="Id")
	int id;
	@Column(name="Name")
	String name;
	@Column(name="Salary")
	int Sal;
	
	public Emp() {
		
	}
	
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		Sal = sal;
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

	public int getSal() {
		return Sal;
	}

	public void setSal(int sal) {
		Sal = sal;
	}
	
	
	
}
