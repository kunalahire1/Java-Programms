 package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.Dao.Employee;

public class connectionDb {

	public static void main(String[] args) throws Exception {
		
		Employee e=new Employee();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/propel","root","Malegaon@1");
		PreparedStatement pstate=conn.prepareStatement("insert into employee values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Connection establish Successfully " + conn);
		System.out.println("Enter id,name,address");
	
		e.setEmpId(sc.nextInt());
		e.setName(sc.next());
		e.setAddr(sc.next());
		pstate.setInt(1,e.getEmpId());
		pstate.setString(2,e.getName());
		pstate.setString(3,e.getAddr());
        int i=pstate.executeUpdate();
        if(i>0)
        {
        	System.out.println("Record inserted");
        }
        else
        {
        	System.out.println("Not inserted");
        }
		

	}

}
