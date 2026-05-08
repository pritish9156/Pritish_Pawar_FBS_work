package demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class EmployeeDao {

	
	DbConnection dbc=new DbConnection();
	
	public ArrayList<Employee> getAllEmployees() throws SQLException
	{
		Connection con=dbc.getConnection();
		Statement stmt=con.createStatement();
		ResultSet resultSet = stmt.executeQuery("select * from employee");
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		
		while(resultSet.next())
		{
			Employee employee=new Employee();
			employee.setId(resultSet.getInt(1));
			employee.setName(resultSet.getString(2));
			employee.setSalary(resultSet.getDouble(3));
			emplist.add(employee);
		}
		
		return emplist;
	}

	public int addEmployee(Employee emp) throws SQLException, IOException {
		
		Connection con=dbc.getConnection();
		Statement stmt=con.createStatement();

		stmt.execute(
		    "create table if not exists employee ("
		    + "id int primary key, "
		    + "name varchar(100), "
		    + "salary double"
		    + ")"
		);
		
		return stmt.executeUpdate( "insert into employee values("+ emp.getId() + ", '"+ emp.getName() + "', " + emp.getSalary() + ")");
	}
	
	public void delete() {
		
	}

	public ArrayList<Employee> searchEmployeeByName(String empName) {
		
		Connection con = dbc.getConnection();
		ArrayList<Employee> arrList = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee where name = ?");
			ps.setString(1, empName);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				if(arrList==null)
					arrList = new ArrayList<Employee>();
				
				Employee emp = new Employee(res.getInt(1), res.getString(2), res.getDouble(3));
				arrList.add(emp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrList;
	}

	public Employee searchEmployeeById(int empId) {
		Connection con = dbc.getConnection();
		Employee emp = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee where id = ?");
			ps.setInt(1, empId);
			
			ResultSet res = ps.executeQuery();
			
			if(res.next())
				emp = new Employee(res.getInt(1), res.getString(2), res.getDouble(3));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public Boolean updateEmployeeName(Employee empToUpdate, String empName) {
		
		Connection con = dbc.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("update employee set name=? where id=?");
			ps.setString(1, empName);
			ps.setInt(2, empToUpdate.getId());
			
			int res = ps.executeUpdate();
			
			if(res!=0)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public Boolean updateEmployeeSalary(Employee empToUpdate, double empSal) {
		
		Connection con = dbc.getConnection();
		
		try {
			PreparedStatement ptst = con.prepareStatement("update employee set salary = ? where id = ?");
			ptst.setDouble(1, empSal);
			ptst.setInt(2, empToUpdate.getId());
			
			int res = ptst.executeUpdate();
		
			if(res!=0)
				return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean deleteEmployee(int id) {
		
		Connection con = dbc.getConnection();
		try {
			PreparedStatement ptmt = con.prepareStatement("delete from employee where id=?");
			ptmt.setInt(1, id);
			int res = ptmt.executeUpdate();
			if(res!=0)
				return true;
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
