package org.sshTP.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.sshTP.pojo.Dept;

@Repository
public class DeptDao {
	
	@Resource
	private SessionFactory sf;
	
	public List<Dept> findAll() {
		Session session = sf.openSession();
		String sql = "select * from dept";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Dept.class);
		List dl = query.list();
		return dl;
	}

}
