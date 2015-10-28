package vorlesung11;

public class WmFinalRundenSpiel {

	private final String team1, team2;

	private final WmFinalRundenSpiel vorgaenger1, vorgaenger2;
	private boolean teamSieger1;

	public WmFinalRundenSpiel(String team1, String team2,
			WmFinalRundenSpiel vorgaenger1, WmFinalRundenSpiel vorgaenger2, boolean teamSieger1) {
		
		this.team1 = team1;
		this.team2 = team2;
		this.vorgaenger1 = vorgaenger1;
		this.vorgaenger2 = vorgaenger2;
		this.teamSieger1 = teamSieger1;
	}
	
	public String getSieger() {
		return teamSieger1 ? team1 : team2; 
	}
	
	public String getTeam1() {
		return team1;
	}
	
	public String getTeam2() {
		return team2;
	} 

}