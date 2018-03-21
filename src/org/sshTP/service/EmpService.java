package org.sshTP.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sshTP.dao.EmpDao;
import org.sshTP.pojo.Emp;

@Service
@Transactional
public class EmpService {
	
	@Resource
	private EmpDao ed;
	
	
	public List<Emp> finAll(String sql) {
		
		return ed.findAll(sql);
	}
	
	public void addEmp(Emp emp) {
		ed.addEmp(emp);
	}
	
	public Emp findEmpByid(Emp emp) {
		emp = ed.findEmpByEid(emp);
		return emp;
	}

}
