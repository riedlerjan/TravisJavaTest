package at.htlwels.riedler;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bruch b1=new Bruch();
		Bruch b2=new Bruch();
		Bruch b3=  new Bruch();
		b1.setzeNenner(2);
		b1.setzezaehler(4);
		b2.setzeNenner(4);
		b2.setzezaehler(6);
		
		
		b1.addiere(b2);
		
		System.out.println(b1);
	}

}
