package monkija;

public class Monkija {

	
	public static void main(String[] args) {
		Monkija monkija = new Monkija();
		monkija.kiihdyta(40);
		monkija.kiihdyta(5);
		monkija.kiihdyta(20);
		monkija.hidasta(30);
		monkija.hidasta(20);
		monkija.hidasta(22);
	}
	
	
	private int nopeus;
    
	public int getNopeus(){
        return nopeus;
    }
	
	public void hidasta(int maara) {
		
		nopeus -= maara;
		if (nopeus < -10) {
			nopeus = -10;
			System.out.println("Ei voi mennä hitaammin. Nopeus on " + nopeus);
			}
			
		else {
			System.out.println("Nopeus on " + nopeus);
			}
			
	}
	
	public void kiihdyta(int maara) {
		
		nopeus += maara;
			if (nopeus > 60) {
			nopeus = 60;
			System.out.println("Ei voi mennä kovempaa. Nopeus on " + nopeus);
			}
			
		else {
			System.out.println("Nopeus on " + nopeus);
			}	
		
	}
	
}
