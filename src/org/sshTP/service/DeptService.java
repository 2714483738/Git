package org.sshTP.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sshTP.dao.DeptDao;
import org.sshTP.pojo.Dept;

@Service
@Transactional
public class DeptService {
	
	@Resource
	private DeptDao dd;
	
	public List<Dept> findAll() {
		List<Dept> dl = dd.findAll();
		return dl;
		
	}

}
