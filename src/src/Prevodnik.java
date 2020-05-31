
public class Prevodnik {
	double kilogramy;
	double gramy;

	public double Prevodnikzkilogramunagramy(double kilogramy) {

		return kilogramy/1000;

	}
	public double Prevodnikzgramunakilogramy(double gramy) {

		return gramy*1000;
	
	}
	
	public double getKilogramy() {
		return kilogramy;
	}

	public void setKilogramy(double kilogramy) {
		this.kilogramy = kilogramy;
	}

	public double getGramy() {
		return gramy;
	}

	public void setGramy(double gramy) {
		this.gramy = gramy;
	}
}
