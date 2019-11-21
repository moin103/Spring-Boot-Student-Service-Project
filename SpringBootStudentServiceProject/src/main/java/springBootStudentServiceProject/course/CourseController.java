package springBootStudentServiceProject.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import springBootStudentServiceProject.student.Student;
import springBootStudentServiceProject.topic.Topic;
import springBootStudentServiceProject.topic.TopicService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private TopicService topicService;
	
/////////////////////////////////////////////////////////////////////////////	
//	
//	@RequestMapping("/students/{id}/courses")
//	public List<Course> getAllCourses(@PathVariable String id){
//		return courseService.getAllCourses(id);
//	}
//	@RequestMapping("/students/{studentId}/courses/{id}")
//	 public Optional<Course> getCourse(@PathVariable String id) {
//		 return courseService.getCourse(id);
//	 }
//	@RequestMapping(method=RequestMethod.POST,value="/students/{studentId}/courses")
//	public void addCourse(@RequestBody Course course) {
//	  	//course.setStudent(studentList);//new Student(studentId,"",courseList));
//		courseService.addCourse(course);
//	}
//	@RequestMapping(method=RequestMethod.PUT,value="/students/{studentId}/courses/{id}")
//	public void updateCourse(@RequestBody List<Course> courseList,@RequestBody List<Student> studentList,@RequestBody Course course,@PathVariable String studentId) {
//	  	course.setStudent(studentList);//new Student(studentId,"",courseList));
//		courseService.updateCourse(course);
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/students/{studentId}/courses/{id}")
//	public void deleteCourse(@PathVariable String id) {
//		courseService.deleteCourse(id);
//	}
///////////////////////////////////////////////////////////////////////////////////////////	
//	
///////////////////////////////////////////////////////////////////////////////////////////
//
//	@RequestMapping("/courses")
//	public List<Course> getAllCoursesOnly(){
//		return courseService.getAllCoursesOnly();
//	}
//	
//	@RequestMapping("/courses/{id}")
//	 public Optional<Course> getCourseForAnId(@PathVariable String id) {
//		 return courseService.getCourseForAnId(id);
//	 }
//	
//	
//	@RequestMapping(method=RequestMethod.POST,value="/courses")
//	public void addCourseOnly(@RequestBody Course course,@RequestBody List<Student> studentList) {
//	  	//course.setStudent(studentList);//new Student(studentId,"",courseList));
//		courseService.addCourseOnly(course);
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="courses/{id}")
//	public void deleteCourseOnly(@PathVariable String id) {
//		courseService.deleteCourseOnly(id);
//	}
////////////////////////////////////////////////////////////////////////////////////////	
	
/* triggered URL */	
	
	
////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/courses")
	public List<CourseVM> getAllCoursesOnly(){
		return courseService.getAllCoursesOnly();
	}
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public void addCoursesOnly(@RequestBody Course course) {
		courseService.addCoursesOnly(course);

	}
///////////////////////////////////////////////////////////////////////////////////////
}