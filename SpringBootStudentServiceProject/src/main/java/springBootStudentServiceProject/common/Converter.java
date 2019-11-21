package springBootStudentServiceProject.common;

import java.util.ArrayList;
import java.util.List;

import springBootStudentServiceProject.course.Course;
import springBootStudentServiceProject.course.CourseVM;
import springBootStudentServiceProject.student.Student;
import springBootStudentServiceProject.student.StudentVM;
import springBootStudentServiceProject.topic.Topic;
import springBootStudentServiceProject.topic.TopicVM;


public class Converter {

	public static List<CourseVM> getCourseVMList(List<Course> courses) {
		List<CourseVM> courseVMList=new ArrayList();
		courses.forEach(course->{
			courseVMList.add(getCourseVM(course));
		});
		return courseVMList;
	}

	private static CourseVM getCourseVM(Course course) {
		if(course!=null) {
			return new CourseVM(course.getId(), course.getName(), getTopicVMList(course.getTopic()));
		}
		return null;
	}

	private static List<TopicVM> getTopicVMList(List<Topic> topics) {
		List<TopicVM> topicVMs=new ArrayList<>();
		topics.forEach(topic ->{
			topicVMs.add(getTopicVM(topic));
		});
		return topicVMs;
	}

	private static TopicVM getTopicVM(Topic topic) {
		if(topic!=null) {
			return new TopicVM(topic.getId(), topic.getName(), topic.getDescription(),new CourseVM(topic.getCourse().getId()));
		}
		// TODO Auto-generated method stub
		return null;
	}

	public static List<StudentVM> getStudentVMList(List<Student> students) {
		List<StudentVM> studentVMList=new ArrayList();
		students.forEach(student->{
			studentVMList.add(getStudentVM(student));
		});
		return studentVMList;
		
	}

	private static StudentVM getStudentVM(Student student) {
		if(student!=null) {
		return new StudentVM(student.getId(),student.getName(),getCourseVMIDList(student.getCourse()));
		}
		return null;
	}

	private static List<CourseVM> getCourseVMIDList(List<Course> courses) {
		List<CourseVM> courseIdVMList=new ArrayList();
		courses.forEach(course->{
			courseIdVMList.add(getCourseIdVM(course));
		});
		return courseIdVMList;
	}

	private static CourseVM getCourseIdVM(Course course) {
		if(course!=null) {
			return new CourseVM(course.getId(),course.getName());
		}
		return null;

	}
	
	

}
