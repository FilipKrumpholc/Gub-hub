
public class Propiska {
	double ���kaStopy;
	double ���kaPropisky;

	public Propiska(double ���kaStopy, double ���kaPropisky) {
		super();
		this.���kaStopy = ���kaStopy;
		this.���kaPropisky = ���kaPropisky;

	}

	public double get���kaStopy() {
		return ���kaStopy;
	}

	public void set���kaStopy(double ���kaStopy) {
		this.���kaStopy = ���kaStopy;
	}

	@Override
	public String toString() {
		return "Propiska [���kaStopy=" + ���kaStopy + ", ���kaPropisky=" + ���kaPropisky + "]";
	}

	public double get���kaPropisky() {
		return ���kaPropisky;
	}

	public void set���kaPropisky(double ���kaPropisky) {
		this.���kaPropisky = ���kaPropisky;
	}

}
