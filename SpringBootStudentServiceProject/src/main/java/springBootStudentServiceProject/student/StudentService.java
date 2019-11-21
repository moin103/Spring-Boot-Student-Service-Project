package springBootStudentServiceProject.student;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootStudentServiceProject.common.Converter;
import springBootStudentServiceProject.course.CourseVM;
import springBootStudentServiceProject.student.StudentVM;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	
	/*private List<Student> students= new ArrayList<>(Arrays.asList(
			new Student("101","moin","X"),
			new Student("102","mahmud","Y")
	));*/
//	
//	public List<Student> getAllStudents(){
//		//return students;
//		
//		List<Student> students=new ArrayList<>();
//		studentRepository.findAll()
//		.forEach(students::add);
//		return students;
//	}
//	
//	public Optional<Student> getStudent(String id) {
//		//return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//		return studentRepository.findById(id);
//	}
//	public void addStudent(Student student) {
//		studentRepository.save(student);	
//	}
//	public void updateStudent(Student student, String id) {
//	/*	for(int i=0;i<students.size();i++) {
//			Student s=students.get(i);
//			if(s.getId().equals(id)) {
//				students.set(i, student);
//				return; 
//			}
//		}*/
//		studentRepository.save(student);
//	}
//	public void deleteStudent(String id) {
//		//students.removeIf(t -> t.getId().equals(id));
//		studentRepository.deleteById(id);
//	}
////////////////////////////////////////////////////////////////////

	public List<StudentVM> getAllStudentsOnly() {
		return Converter.getStudentVMList(studentRepository.findAll());
		
	}


	public void addStudentsOnly(Student student) {
		studentRepository.save(student);	
		
	}


}