package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	Team adelaidCrows = new Team("Adelaid Crows");
	adelaidCrows.addPlayer(joe);
	adelaidCrows.addPlayer(pat);
	adelaidCrows.addPlayer(beckham);

        System.out.println(adelaidCrows.numPlayers());
    }
}
