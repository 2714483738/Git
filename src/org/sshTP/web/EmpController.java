package org.sshTP.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sshTP.pojo.Emp;
import org.sshTP.service.DeptService;
import org.sshTP.service.EmpService;

@Controller
@CrossOrigin("*")
public class EmpController {
	
	@Resource
	private EmpService es;	
	@Resource
	private DeptService ds;
	
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public List<Emp> fn(Emp emp) {
		//��ѯȫ������
		String sql = "select * from emp where 1=1";
		//ģ����ѯ�������
		if (emp != null && emp.getEname() !=null && !emp.getEname().equals("")) {
			sql += " and ename like '%" + emp.getEname() + "%'";
		}
		//���ղ���Ա��������ѯ
		if (emp != null && emp.getEid() != null) {
			sql += " and did =" + emp.getEid();
		}
		List<Emp> dl = es.finAll(sql);
		return dl;
	}
	
	
	
	

}
