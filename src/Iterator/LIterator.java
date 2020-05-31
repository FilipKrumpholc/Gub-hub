
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class LIterator implements Iterable<String> {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> field = new ArrayList<String>();

	public Iterator<String> iterator() {

		return field.iterator();
	}

	public void Lit() {
		String temp = sc.nextLine();
		switch (temp) {
		case "pridat":
			System.out.println("Zadejte:\n");
			field.add(sc.nextLine());
			break;
		case "vypsat":
			Main.Iterate();

			break;
		case "ukoncit":
			Main.on = false;
			break;
		default:
			System.out.println("Špatný pøíkaz");
			break;

		}
	}

}
