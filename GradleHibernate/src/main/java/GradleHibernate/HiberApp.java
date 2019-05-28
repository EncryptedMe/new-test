package GradleHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateTesting hi = new HibernateTesting();
		hi.setId(101);
		hi.setName("Perry");
		hi.setColor("Green");
		
		try {
		Configuration con =new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();	
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(hi);
		session.getTransaction().commit();
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
