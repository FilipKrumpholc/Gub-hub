
public class Main {
	public static boolean on = true;
	public static LIterator pc = new LIterator();

	public static void main(String[] args) {
		while (on) {
			System.out.println("P��kazy:\npridat=P�id� prvek\nvypsat=Vyp�e prvky\nukoncit=Ukon�� program");
			pc.Lit();
		}

	}

	public static void Iterate() {
		System.out.println();
		for (String string : pc) {
			System.out.println(string);
		}
		System.out.println();
	}

}
