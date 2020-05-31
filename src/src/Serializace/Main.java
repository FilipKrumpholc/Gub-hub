
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		ZoneId zone1 = ZoneId.systemDefault();
		LocalDateTime tim1 = LocalDateTime.now(zone1);
		LocalTime l1 = LocalTime.now(zone1);
		Date date1 = (Date) Date.from(tim1.atZone(zone1.systemDefault()).toInstant());

		Path pokemoni = Paths.get(System.getProperty("user.home") + "\\Desktop\\kolekce-pokemonu.dat");
		TreeSet<String> kolekce = new TreeSet<String>();

		ZoneId zone = ZoneId.systemDefault();
		LocalDateTime time = LocalDateTime.now(zone);

		try {

			kolekce.add("MEWTWO");
			kolekce.add("REGIGIGAS");
			kolekce.add("GARCHOMP");

			System.out.println(serialize(deserialize(pokemoni, time) + 1, kolekce, pokemoni, time));
		} catch (FileNotFoundException e) {
			System.err.println("File is not existing yet \n");
			System.out.println("File is going to be created");

			serialize(0, kolekce, pokemoni, time);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String serialize(int pocetspusteni, TreeSet<String> kolekce, Path pokemoni, LocalDateTime time)
			throws ClassNotFoundException, IOException {

		try (FileOutputStream fileOut = new FileOutputStream(pokemoni.toString());
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
			objOut.writeObject(kolekce);
			System.out.println("Amount of startups of the program is: " + pocetspusteni);

			objOut.writeInt(pocetspusteni);
			objOut.writeObject(time);

		}

		return "Serialized data is saved in " + pokemoni.toString();
	}

	public static int deserialize(Path pokemoni, LocalDateTime time) throws IOException, ClassNotFoundException {

		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(pokemoni.toString()));

		System.out.println("The output of de-serialized data is : " + (Object) objIn.readObject());

		int a = objIn.readInt();
		ZoneId zone = ZoneId.systemDefault();
		Date date = (Date) Date.from(time.atZone(zone.systemDefault()).toInstant());
		LocalDateTime tim = (LocalDateTime) objIn.readObject();
		Date date2 = (Date) Date.from(tim.atZone(zone.systemDefault()).toInstant());

		long datet = date.getTime() - date2.getTime();

		long dSeconds = datet / 1000 % 60;
		long dMinutes = datet / (60 * 1000) % 60;
		long dHours = datet / (60 * 60 * 1000) % 24;
		long dDays = datet / (24 * 60 * 60 * 1000);

		System.out.println("Last time the program was executed was: " + dDays + " days ago, " + dHours + " hours ago, "
				+ dMinutes + " minutes ago, " + dSeconds + " seconds ago, ");

		return a;

	}

}
