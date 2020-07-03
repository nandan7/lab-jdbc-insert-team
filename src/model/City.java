package model;

public class City{
	Long cityId;
	String cityName;
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public City(Long cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
}
