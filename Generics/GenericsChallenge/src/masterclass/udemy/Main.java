package masterclass.udemy;

public class Main {

    public static void main(String[] args) {

        League<Team<Football>> footballLeague = new League<>("AFL");
        Team<Football> nyGiants = new Team<>("NY Giants");
        Team<Football> melbourne = new Team<>("Melbourne");
        Team<Football> hawthorn = new Team<>("Hawthorn");
        Team<Football> fremantle = new Team<>("Fremantle");

        footballLeague.add(nyGiants);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        Team<Baseball> chicagoCubs = new Team<>("Chicago Cubs");
//        footballLeague.add(baseballTeam); // shows that chicagoCubs cannot be added to the footballLeague
        hawthorn.matchResult(nyGiants, 3, 8);
        hawthorn.matchResult(fremantle, 1, 0);
        footballLeague.showLeagueTable();
    }
}
