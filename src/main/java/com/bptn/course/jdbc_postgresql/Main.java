package com.bptn.course.jdbc_postgresql;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		todolist jdbc = new todolist();
		Connection conn = jdbc.createConnection();
		jdbc.getAllUsers(conn);
		jdbc.closeConnection(conn);
	}

}
