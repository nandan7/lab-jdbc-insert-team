package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	
public void createTeam(Team team) throws SQLException, ClassNotFoundException {
Connection con=ConnectionManager.getConnection();
	
	String sql="INSERT INTO TEAM(ID,NAME,COACH,HOME_CITY,CAPTAIN)VALUES(?,?,?,?,?)";
	PreparedStatement st=con.prepareStatement(sql);
	int id=team.getId();
	String name=team.getName();
	String coach=team.getCoach();
	int city=team.getHome_city();
	int captain=team.getCaptain();
	st.setInt(1,id);
	st.setString(2,name);
	st.setString(3,coach);
	st.setInt(4,city);
	st.setInt(5,captain);
		st.executeUpdate();
		con.close();
		System.out.println("Team has been created");
    }
}
