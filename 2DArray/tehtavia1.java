package app;

public class tehtavia1 {

	public static void main(String[] args) {
		
		int kokonaisluku = 4;
		System.out.println(summa(kokonaisluku));
		
		
		int [][] taulukko = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int summa = 0;
		
		System.out.println(taulukonSumma(taulukko, summa));

	}

	public static int summa(int kokonaisluku) {
		int aloitus = 0;
		for (int i = 1; i <= kokonaisluku; i++) {
			aloitus = aloitus + i;
		}
		return aloitus;		
		
	}
	
	private static int taulukonSumma(int taulukko [][], int summa) {
		
		for (int i = 0; i < taulukko.length; i++) {
			for (int j = 0; j < taulukko[i].length; j++) {
				summa = summa + taulukko [i][j];
			}
		}
		return summa;
	}

}
