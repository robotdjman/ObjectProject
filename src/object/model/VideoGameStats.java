package object.model;

public class VideoGameStats
{
	private String name;
	private int hoursplayed;
	private int minutesplayed;
	
	public int getHoursplayed() {
		return hoursplayed;
	}
	public int getMinutesPlayed() {
		return minutesplayed;
	}
	public String getName() {
		return name;
	}
	public void addHours(int hours) {
		hoursplayed = hoursplayed + hours;
	}
	public void addMinutes(int minutes) {
		minutesplayed = minutesplayed + minutes;
	}
	public void setName(String name) {
		this.name = name;
	}
}
