
public class Propiska {
	double šíøkaStopy;
	double šíøkaPropisky;

	public Propiska(double šíøkaStopy, double šíøkaPropisky) {
		super();
		this.šíøkaStopy = šíøkaStopy;
		this.šíøkaPropisky = šíøkaPropisky;

	}

	public double getŠíøkaStopy() {
		return šíøkaStopy;
	}

	public void setŠíøkaStopy(double šíøkaStopy) {
		this.šíøkaStopy = šíøkaStopy;
	}

	@Override
	public String toString() {
		return "Propiska [šíøkaStopy=" + šíøkaStopy + ", šíøkaPropisky=" + šíøkaPropisky + "]";
	}

	public double getŠíøkaPropisky() {
		return šíøkaPropisky;
	}

	public void setŠíøkaPropisky(double šíøkaPropisky) {
		this.šíøkaPropisky = šíøkaPropisky;
	}

}
