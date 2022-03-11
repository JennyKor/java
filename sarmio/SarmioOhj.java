package sarmio;

public class SarmioOhj {

	public static void main(String[] args) {
		Sarmio sarmio = new Sarmio();
		sarmio.setKorkeus(-5);
		sarmio.setLeveys(-2);
		sarmio.setSyvyys(-3);
		
		System.out.println(sarmio.getTilavuus());
	}


}
