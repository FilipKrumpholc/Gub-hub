import java.util.HashMap;
import java.util.Scanner;

public class Superheroes {
	public static void main(String[] args) {
		System.out.println("Zadejte první písmeno svého køestního jména" + " a  první písmeno svého pøíjmení ");

		Scanner sc = new Scanner(System.in);

		String pismeno = sc.next();
		String druhePismeno = sc.next();

		HashMap<String, String> pismena = new HashMap<String, String>();
		pismena.put("A", "Amazing");
		pismena.put("B", "Magnetic");
		pismena.put("C", "Fire");
		pismena.put("D", "Magnificent");
		pismena.put("E", "Dynamic");
		pismena.put("F", "Doctor");
		pismena.put("G", "Wonder");
		pismena.put("H", "Super");
		pismena.put("I", "Awesome");
		pismena.put("J", "Kick-Ass");
		pismena.put("K", "Bad-Ass");
		pismena.put("L", "Alabaster");
		pismena.put("M", "Chocolate");
		pismena.put("N", "Vanilla");
		pismena.put("O", "Strawberry");
		pismena.put("P", "Astro");
		pismena.put("Q", "Secret");
		pismena.put("R", "Space");
		pismena.put("S", "Orange");
		pismena.put("T", "Night");
		pismena.put("U", "Purple");
		pismena.put("V", "Sticky");
		pismena.put("W", "Pretentious");
		pismena.put("X", "D-Cup");
		pismena.put("Y", "Bodacious");
		pismena.put("Z", "Dark");

		HashMap<String, String> druhePismena = new HashMap<String, String>();
		druhePismena.put("A", "Thunderbolt");
		druhePismena.put("B", "Storm");
		druhePismena.put("C", "Dynamo");
		druhePismena.put("D", "Octopus");
		druhePismena.put("E", "Falcon");
		druhePismena.put("F", "Munchkin");
		druhePismena.put("G", "Doctor");
		druhePismena.put("H", "Tornado");
		druhePismena.put("I", "Hurricane");
		druhePismena.put("J", "Blizzard");
		druhePismena.put("K", "Volcano");
		druhePismena.put("L", "Dagger");
		druhePismena.put("M", "Laser");
		druhePismena.put("N", "Meteor");
		druhePismena.put("O", "Rocket");
		druhePismena.put("P", "Thunder");
		druhePismena.put("Q", "Lightning");
		druhePismena.put("R", "Avenger");
		druhePismena.put("S", "Destroyer");
		druhePismena.put("T", "Muffin");
		druhePismena.put("U", "Cookie");
		druhePismena.put("V", "Exterminator");
		druhePismena.put("W", "Assasin");
		druhePismena.put("X", "Marshmallow");
		druhePismena.put("Y", "Sausage");
		druhePismena.put("Z", "Weirdo");

		System.out.println("Tvé superhrdinovské jméno je " + pismena.get(pismeno) + " "
   + druhePismena.get(druhePismeno) );
	
	}
}
