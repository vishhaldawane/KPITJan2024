import javax.persistence.*;

@Entity
@Table(name="mydept120")
public class Department {

	@Id
	@Column(name="DEPTNO")// column name
	int departmentNumber; //this column is considered as primary key 
	
	@Column(name="DEPTNAME")
	String departmentName;
	
	@Column(name="LOC")
	String departmentLocation;

	
	public Department() {
		super();
		System.out.println("Department ctor...");
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
}
