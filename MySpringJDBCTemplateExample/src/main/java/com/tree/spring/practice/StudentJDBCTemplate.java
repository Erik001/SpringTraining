package com.tree.spring.practice;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);

	}

	public void create(String name, Integer age) {
		String sql = "insert into Student (name, age) values (?, ?)";
		jdbcTemplateObject.update(sql, name, age);
		System.out.println("Created Record, Name: " + name + ", Age: " + age);
		return;
	}

	public Student getStudent(Integer id) {
		String sql = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(sql, new Object[] { id }, new StudentMapper());
		return student;
	}

	public List<Student> listStudents() {
		String sql = "select * from Student";
		List<Student> listOfStudents = jdbcTemplateObject.query(sql, new StudentMapper());
		return listOfStudents;
	}

	public void delete(Integer id) {
		String sql = "delete from Student where id = ?";
		jdbcTemplateObject.update(sql, id);
		System.out.println("Deleted Record with Id: " + id);
		return;
	}

	public void update(Integer id, Integer age) {
		String sql = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(sql, age, id);
		System.out.println("Updated Record with Id: " + id);
		return;
	}

}
