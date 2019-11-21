package springBootStudentServiceProject.course;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import springBootStudentServiceProject.student.Student;
//import springBootStudentServiceProject.student.Student;
import springBootStudentServiceProject.topic.Topic;
@Entity
@Table(name="Courses")
public class Course implements Serializable{
	
	public Course(String id) {
		super();
		this.id = id;
	}

	@Id
	private String id;
	private String name;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Topic> topic;
	
	@ManyToMany(mappedBy="course",cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private List<Student> student
	//	@JoinTable(
//			  name = "course_stu", 
//			  joinColumns = @JoinColumn(name = "course_id"),
//			  inverseJoinColumns = @JoinColumn(name = "student_id"))
	;
	 
	
	
	
	public Course() {
		
	}

	public Course(String id, String name, List<Topic> topic) {
	super();
	this.id = id;
	this.name = name;
	this.topic = topic;
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

	public List<Topic> getTopic() {
		return topic;
	}

	public void setTopic(List<Topic> topic) {
		this.topic = topic;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	



}	

