package springBootStudentServiceProject.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootStudentServiceProject.common.Converter;
import springBootStudentServiceProject.topic.Topic;
import springBootStudentServiceProject.course.CourseVM;
//import springBootStudentServiceProject.student.Student;



@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/*private List<Student> students= new ArrayList<>(Arrays.asList(
			new Student("101","moin","X"),
			new Student("102","mahmud","Y")
	));
	
	*/
	/*public List<Course> getAllCourses(String studentId){
		//return students;
		List<Course> courses=new ArrayList<>();
//		courseRepository.findByStudentId(studentId)
//		.forEach(courses::add);
		return courses;
	}
	public Optional<Course> getCourse(String id) {
		//return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}
	public void addCourse(Course course) {
		courseRepository.save(course);	
	}
	public void updateCourse(Course course) {
	/*	for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			if(s.getId().equals(id)) {
				students.set(i, student);
				return; 
			}
		}
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		//students.removeIf(t -> t.getId().equals(id));
		//courseRepository.deleteById(id);
	}
	
	*/
	
////////////////////////////////////////////////////////////////////////////////////////
//	public List<Course> getAllCoursesOnly() {
//		List<Course> courses=new ArrayList<>();
//		courseRepository.findAll()
//		.forEach(courses::add);
//		return courses;
//	}
//
//	public Optional<Course> getCourseForAnId(String id) {
//		return courseRepository.findById(id);
//		
//	}
//	public void addCourseOnly(Course course) {
//		courseRepository.save(course);	
//	}
//	public void deleteCourseOnly(String id) {
//		courseRepository.deleteById(id);
//		
//	}	
//	
//	
/////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////	
	
	public List<CourseVM> getAllCoursesOnly() {   // When "/courses" is triggered for GETMapping
		return Converter.getCourseVMList(courseRepository.findAll());
	}
	public void addCoursesOnly(Course course) {   // When "/courses" is triggered for POSTMapping
		courseRepository.save(course);	
	}
	
/////////////////////////////////////////////////////////////////////////////////////

}

