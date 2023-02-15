package com.webapplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	@Autowired
	SessionFactory sessionFactory;
	
	@PostMapping("post")
	public String insert() {
		Session session = sessionFactory.openSession();
		Employee e1 = new Employee(1, "omkar", 22, "3LPA");
	    session.save(e1);
	    Transaction transaction = session.beginTransaction();
	    transaction.commit();
	    return "added";
	}

}
