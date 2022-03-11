package sarmio;

public class Sarmio {

	private int leveys;
	private int korkeus;
	private int syvyys;
	
	
	public int getLeveys() {
		return leveys;
	}

	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}


	public int getSyvyys() {
		return syvyys;
	}

	public void setSyvyys(int syvyys) {
		this.syvyys = syvyys;
	}


	public int getKorkeus() {
		return korkeus;
	}

	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
	}
	
	public int getTilavuus() {
		int tulo;
		tulo = leveys*korkeus*syvyys;
			if (tulo < 0) {
				tulo = -1;
			}
		return tulo;
	}
}
