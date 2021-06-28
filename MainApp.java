package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		//Table 1
		Student student = new Student();
		student.setName("Prajacta");
		
		//Table 2		
		Marks m = new Marks();
		m.setCourse1marks(90);
		m.setCourse2marks(80);
		m.setCourse3marks(89);
		m.setCourse4marks(67);
		m.setCourse5marks(77);
		m.setCourse6marks(70);
		
		m.setStudent(student);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(m);

		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
	}

}
