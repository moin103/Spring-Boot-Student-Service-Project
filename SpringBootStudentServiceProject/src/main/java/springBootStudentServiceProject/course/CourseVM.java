package springBootStudentServiceProject.course;

import java.io.Serializable;
import java.util.List;

import springBootStudentServiceProject.student.StudentVM;
import springBootStudentServiceProject.topic.TopicVM;

public class CourseVM implements Serializable{
	private String id;
	private String name;
	private List<TopicVM> topic;

	private StudentVM student;
	
	public CourseVM() {
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TopicVM> getTopic() {
		return topic;
	}

	public void setTopic(List<TopicVM> topic) {
		this.topic = topic;
	}
/*	public StudentVM getStudent() {
		return student;
	}
	public void setCourse(StudentVM student) {
		this.student = student;
	}
*/
	public CourseVM(String id, String name, List<TopicVM> topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
	}
	public CourseVM(String id) {
		super();
		this.id = id;
	
	}

	public CourseVM(String id,String name) {
		super();
		this.id = id;
		this.name = name;
	}

/*
	public CourseVM(String id, String name, List<TopicVM> topic, StudentVM student) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.student = student;
	}

	*/
	



}	

