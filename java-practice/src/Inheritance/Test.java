package Inheritance;

public class Test {

	public static void main(String[] args) {
		Sport sport = new Sport();
		sport.getName();
		Sport s = new Cricket();
		s.getName();
		Cricket c = new Cricket();
		c.getName();
		// Cricket c1 = new Sport();
		System.out.println(sport.players);
		System.out.println(s.players);
		System.out.println(c.players);
		System.out.println(sport.getPlayersCount());
		System.out.println(s.getPlayersCount());
		System.out.println(c.getPlayersCount());
		System.out.println(sport.getCountry());
		System.out.println(s.getCountry());
		System.out.println(c.getCountry());

	}

}
