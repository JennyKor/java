public class Kolmio {
	
	public static void main(String[] args) {
		Kolmio kolmio = new Kolmio();
		
		kolmio.setLeveys(8);
		kolmio.setKorkeus(5);
		
		
		System.out.println(kolmio.getLeveys());
		System.out.println(kolmio.getKorkeus());
		
		System.out.println(kolmio.getPintaAla());
	}
	
	private int leveys;
	private int korkeus;
	
	public int getLeveys() {
		return leveys;
	}
	public void setLeveys(int leveys) {
		
		this.leveys = Math.abs(leveys);
	}
	public int getKorkeus() {
		return korkeus;
	}
	public void setKorkeus(int korkeus) {

		this.korkeus = Math.abs(korkeus);
	}
	
	public int getPintaAla() {
		return korkeus * leveys / 2;

	}
	
}

