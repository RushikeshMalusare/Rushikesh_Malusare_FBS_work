package pac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

	public class MainApp {
		public static void main(String[] args) {
			//Student s=new Student(1,"yash","Nashik");
			Student s1=new Student(78,"Ram",new StudAddress("XYZ","PQR"));
			Configuration cfg=new Configuration();
			cfg.configure("test.xml");
				SessionFactory factory=cfg.buildSessionFactory();
				Session session=factory.openSession();
				Transaction tr=session.beginTransaction();
				
				Student st = session.find(Student.class, 78); //find name

				st.setStudName("Vaibhav");
				
				//System.out.println(st.getStudName());
				//session.update(st);
				session.remove(st);
				tr.commit();
				session.close();
				
			}


}
