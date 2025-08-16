package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.Employee;

public class EmployeeDao {
	
	public int addEmp(int id,String name,int sal) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");
			
			String query="insert into emp values(?,?,?) ";
			
			PreparedStatement pst=conn.prepareStatement(query);
			
			pst.setInt(1,id);
			pst.setString(2, name);
			pst.setInt(3, sal);
			
			
			int result=pst.executeUpdate();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	
	public List<Employee> getAllEmployee(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","1234");
			
			String query="select*from emp";
			
			PreparedStatement pst=conn.prepareStatement(query);
			
			ResultSet rs=pst.executeQuery();
			
			List<Employee> list=new ArrayList<>();
			
			while(rs.next()) {
				int id=rs.getInt(1);	
			    String name=rs.getString(2);
				int sal=rs.getInt(3);
				
				Employee e=new Employee(id,name,sal);
				
				list.add(e);
			}
			return list;
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
 }
	
	public int deleteById(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");
			
			String query="delete from emp where id=?";
			
			PreparedStatement pst=conn.prepareStatement(query);
			
			pst.setInt(1,id);
			
			
			
			int result=pst.executeUpdate();
			return result;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
		
	}
	
	
	public Employee getbyId(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");
			
			String query="select*from emp where id=?";
			
			PreparedStatement pst=conn.prepareStatement(query);
			
			pst.setInt(1,id);
			
			
			
			ResultSet rs=pst.executeQuery();
			
			rs.next();
			
			int i=rs.getInt("id");	
		    String name=rs.getString("name");
			int sal=rs.getInt("sal");
			
			Employee e=new Employee(i,name,sal);
			
			return e;
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	
	public int updateEmp(int id,String name,int sal) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");
			
			String query="update emp set name = ?, sal = ? where id = ? ";
			
			PreparedStatement pst=conn.prepareStatement(query);
			
			pst.setInt(3,id);
			pst.setString(1, name);
			pst.setInt(2, sal);
			
			
			int result = pst.executeUpdate();
			return result;
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}

}
