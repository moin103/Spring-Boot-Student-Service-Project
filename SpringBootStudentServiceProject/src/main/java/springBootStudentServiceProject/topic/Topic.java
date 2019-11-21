package springBootStudentServiceProject.topic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import springBootStudentServiceProject.course.Course;


@Entity
@Table(name="Topics")
public class Topic implements Serializable{
	
	@Id
	private String id;
	private String name;
	private String description;
	
	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
	//@ManyToOne//(fetch = FetchType.LAZY)
    //@JoinColumn(name = "course_id")
	@ManyToOne()
	@JoinColumn(name = "course_id")
	private Course course;
	
	public Topic() {
	}
	
	public Topic(String id) {
		super();
		this.id = id;
	}
	
	//////////Getters Setters
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
}



