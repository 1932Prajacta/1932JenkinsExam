package hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import hibernate.Student;

@Entity
@Table(name="FINAL_MARKS")
public class Marks {
	
	@Id@GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = { @Parameter(value = "student", name = "property") })
	
	private int rollNo;
	
	private int course1marks;
	private int course2marks;
	private int course3marks;
	private int course4marks;
	private int course5marks;
	private int course6marks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "rollno")
	
	private Student student;
	
	//getters setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getCourse1marks() {
		return course1marks;
	}
	public void setCourse1marks(int course1marks) {
		this.course1marks = course1marks;
	}
	public int getCourse2marks() {
		return course2marks;
	}
	public void setCourse2marks(int course2marks) {
		this.course2marks = course2marks;
	}
	public int getCourse3marks() {
		return course3marks;
	}
	public void setCourse3marks(int course3marks) {
		this.course3marks = course3marks;
	}
	public int getCourse4marks() {
		return course4marks;
	}
	public void setCourse4marks(int course4marks) {
		this.course4marks = course4marks;
	}
	public int getCourse5marks() {
		return course5marks;
	}
	public void setCourse5marks(int course5marks) {
		this.course5marks = course5marks;
	}
	public int getCourse6marks() {
		return course6marks;
	}
	public void setCourse6marks(int course6marks) {
		this.course6marks = course6marks;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	 
	

}
