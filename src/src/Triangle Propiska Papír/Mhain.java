
public class Mhain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Paper p=new Paper(10000,200000);
	Paper p1=Paper.factoryA4();
	
	Triangle t1=Triangle.factoryRovnoramenny(3, 3, 6);
	
	System.out.println(t1.getObsah());
	System.out.println(t1.getObvod());
	System.out.println(p);
	System.out.println(p1);
	
	}

}
