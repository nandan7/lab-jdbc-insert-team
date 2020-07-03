package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import dao.TeamDAO;
import model.Team;
import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		ConnectionManager c=new ConnectionManager();
		 Connection a=c.getConnection();
		 if(a==null) {
			 System.out.println("Check your connection");
			
		 }
		 else {
			 System.out.println("Connection established");
		 }
		 TeamDAO teamdao=new TeamDAO();
			Team team = new Team(0,null, null, 0, 0);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter team name:");
			String tname=br.readLine();
			System.out.println("Enter coach name:");
			String cname=br.readLine();
			System.out.println("Enter id:");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter captain:");
			int captain=Integer.parseInt(br.readLine());
			System.out.println("Enter city:");
			int city=Integer.parseInt(br.readLine());
			
			
			
			team.setId(id);
			team.setName(tname);
			team.setCoach(cname);
			team.setHome_city(city);
			team.setCaptain(captain);			
			teamdao.createTeam(team);

	}
}
