package model;

public class Team{
	int id;
	String name;
	String coach;	
	int home_city;
	int captain;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public int getHome_city() {
		return home_city;
	}
	public void setHome_city(int home_city) {
		this.home_city = home_city;
	}
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	public Team(int id, String name, String coach, int home_city, int captain) {
		super();
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.home_city = home_city;
		this.captain = captain;
	}
	

}
