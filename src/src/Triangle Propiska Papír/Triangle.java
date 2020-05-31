
public class Triangle {
	double obvod;
	double obsah;
	double a;
	double b;
	double c;

	public static Triangle factoryRovnoramenny(double a, double b, double c) {
		if (a == b && c != b && a != c) {

			return new Triangle(a, b, c);

		}
		if (a == c && b != a && c != b) {

			return new Triangle(a, b, c);
		}
		if (c == b && a != b && c != a) {
			return new Triangle(a, b, c);

		}
		return null;

	}

	public static Triangle factoryRovnostranny(double a, double b, double c) {
		if (a == b && c == b && a == c) {

			return new Triangle(a, b, c);
		}
		return null;
	}

	public double getObvod() {
		return a + b + c;
	}

	public double getObsah() {
		double s = (a + b + c) / 2;
		double S = s * (s - a) * (s - b) * (s - c);
		double vysledek = Math.sqrt(S);
		return vysledek;

	}

	public String toString() {
		return "Triangle [obvod=" + obvod + ", obsah=" + obsah + ", a=" + a + ", b=" + b + ", c=" + c + ", getObvod()="
				+ getObvod() + ", getObsah()=" + getObsah() + "]";
	}

	Triangle(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

}
