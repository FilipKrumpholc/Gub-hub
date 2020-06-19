

public class Prevodnik {
	double kilogramy;
	double gramy;
	double tuny;

	public String PrevodnikKilogramuNaGramy(double kilogramy) {
		return kilogramy + "kg = " + kilogramy * 1000 + "g";
	}

	public String PrevodnikGramuNaKilogramy(double gramy) {
		return gramy + "g = " + gramy / 1000 + "kg";
	}

	public String PrevodnikTunuNaGramy(double tuny) {
		return tuny + "t = " + tuny * 1000000 + "g";
	}

	public String PrevodnikGramuNaTuny(double gramy) {
		return gramy + "g = " + gramy / 1000000 + "t";
	}

	public String PrevodnikTunuNaKilogramy(double tuny) {
		return tuny + "t = " + tuny * 1000 + "kg";
	}

	public String PrevodnikKilogramuNaTuny(double kilogramy) {
		return kilogramy + "kg = " + kilogramy / 1000 + "t";
	}

	public void setKilogramy(double kilogramy) {
		this.kilogramy = kilogramy;
	}

	public void setGramy(double gramy) {
		this.gramy = gramy;
	}

	public void setTuny(double tuny) {
		this.tuny = tuny;
	}

	public static void main(String[] args) {
		Prevodnik p = new Prevodnik();
		int a = 50;
		p.setKilogramy(a);
		System.out.println(p.PrevodnikKilogramuNaGramy(a));
	}
}
