import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name="student_tbl")
public class Student {

	@Id
	@Column(name="roll_no")
	private int rollNumber;

	@Column(name="stu_name")	
	private String studentName;
	
	@Column(name="stu_addr")
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
