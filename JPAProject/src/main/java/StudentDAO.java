import java.util.List;

import myexceptions.StudentAlreadyExistException;
import myexceptions.StudentNotFoundException;

public interface StudentDAO {
	void createStudent(Student stu) ;
	Student readStudent(int rollno) ;
	List<Student> readStudents();
	void updateStudent(Student stu);
	void deleteStudent(int rollno);
}
