import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int vyber;
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Vyberte se co za po�etn� operaci chcete prov�st");
		System.out.println("1 +. s��tan�");
		System.out.println("2 -. od��tan�");
		System.out.println("3 :. d�len�");
		System.out.println("4 *. n�soben�");
//bere vyber u�ivatele
		vyber = sc.nextInt();
		while (vyber > 4) {
			System.out.println("Zadej si v�b�r");
			vyber = sc.nextInt();
		}
		Calkulacka ceska = new Calkulacka();
		if (vyber == 1) {
			c=ceska.scitej(a, b);
		System.out.println("vysledek je"+c);
		} else if (vyber == 2) {
			c=ceska.odecitej(a, b);
			System.out.println("vysledek je"+c);
		} else if (vyber == 3) {
			c=ceska.del(a, b);
			System.out.println("vysledek je"+c);
		} else if (vyber == 4) {
			c=ceska.vynasob(a, b);
			System.out.println("vysledek je"+c);
		}
	}
}
