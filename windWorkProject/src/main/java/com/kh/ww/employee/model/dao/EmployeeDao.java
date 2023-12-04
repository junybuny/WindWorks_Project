package com.kh.ww.employee.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.ww.employee.model.vo.Employee;

public class EmployeeDao {
	
	public int insertEmployee(SqlSessionTemplate sqlSession, Employee e) {
		return sqlSession.insert("employeeMapper.insertEmployee", e);
	}

	public Employee loginEmployee(SqlSessionTemplate sqlSession, Employee e) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("employeeMapper.loginEmployee", e);
	}
}
