package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

			public static void main(String[] args) {
				// Student s=new Student(1,"yash","Nashik");
//				Emp e1=new e1(1,"yash",40000);
				Emp e1=new Devloper(1,"yash",40000,"quickLerner");
				Emp e2=new Proj_Manager(2,"yash",50000,"quickLerner",5);
				Emp e3=new SalePerson(1,"yash",40000,5);
				
				
			Session session=new Configuration().buildSessionFactory().openSession();
				Transaction tr=session.beginTransaction();
			
				session.persist(e1);
				session.persist(e2);
				session.persist(e3);
				tr.commit();
				session.close();
			}
		}

