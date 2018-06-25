package com.madaGeo.Hiberna;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		
		NumeCertificat nc = new NumeCertificat();
		nc.setNumeFamilie("Enuc");
		nc.setNumeMic("Stella");

		Cal c1 = new Cal();
        c1.setcId(28);
		c1.setcName(nc);
		c1.setcColor("maro");

		// Cal c1 = null;

		Configuration cf = new Configuration().configure().addAnnotatedClass(Cal.class);

		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cf.getProperties()).buildServiceRegistry();

		SessionFactory sf = cf.buildSessionFactory(sr);
		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		session.save(c1);

		// c1 = (Cal) session.get(Cal.class, 24);

		tr.commit();

		System.out.println(c1);
	}
}
