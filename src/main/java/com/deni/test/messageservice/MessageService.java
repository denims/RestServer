package com.deni.test.messageservice;



import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.deni.test.message.Messages;

@Component
public class MessageService {

	
	public Messages getMessage(int no) {
		Configuration config = new Configuration();
		config.addAnnotatedClass(Messages.class);
		config.setProperty("hibernate.hbm2ddl.auto", "update");
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Messages message = session.get(Messages.class, no);
		session.close();
		return message;
	}
	
	@PostConstruct
	public void initialSetup() {
		Configuration config = new Configuration();
		config.addAnnotatedClass(Messages.class);
		config.setProperty("hibernate.hbm2ddl.auto", "create");
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Messages message;
		for(int i =0; i<10;i++) {
			message = new Messages(i,"Message"+i);
			session.save(message);
		}
		session.getTransaction().commit();
		session.close();
	}

}
