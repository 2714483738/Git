package org.sshTP.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.sshTP.pojo.Emp;

@Repository
public class EmpDao {
	
	@Resource
	private SessionFactory sf;
	
	/**
	 * ��ѯȫ��
	 * @param sql
	 * @return
	 */
	public List<Emp> findAll(String sql) {
		Session session = sf.openSession();
		SQLQuery query = session.createSQLQuery(sql).addEntity(Emp.class);
		List dl = query.list();
		return dl;
	}
	
	/**
	 * ���Ա��
	 * @param emp
	 */
	public void addEmp(Emp emp) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(emp);
	}
	
	/**
	 * ����ָ��emp
	 * @return
	 */
	public Emp findEmpByEid(Emp emp) {
		Session session = sf.openSession();
		emp = session.get(Emp.class, emp.getEid());
		return emp;
	}
	

}
