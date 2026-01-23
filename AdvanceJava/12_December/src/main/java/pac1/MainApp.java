package pac1;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		// Student s=new Student(1,"yash","Nashik");
		Set<Player> batter = new HashSet<Player>();
		Team t1 = new Team(7, "Mumbai(W)", batter);
		Player p1 = new Player(1, "Harman", 22, t1);
		Player p2 = new Player(2, "Rohit", 18, t1);
		t1.allBatter.add(p1);
		t1.allBatter.add(p2);
		Configuration cnf = new Configuration();

		cnf.configure("team.xml");
		SessionFactory factory = cnf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

//	Configuration cfg=new Configuration();
//cfg.configure("test.xml");
//	SessionFactory factory=cfg.buildSessionFactory();
//	Session session=factory.openSession();
//	Transaction tr=session.beginTransaction();
//		
		session.persist(t1);
		tr.commit();
		session.close();
	}
}
