
import java.io.*;

public class Reading {
	public static void main(String[] args) {
		
		// Muuttujan arvona tekstitiedoston nimi
		String FILENAME = "out.txt";
		
		//Testataan koodia virheiden varalta
		try {
			/*Avataan tiedosto lukemista varten luomalla olio 
			 * FileInputStream-luokasta, liittäen näin syötevirran
			 * tiedostosta ohjelmaan
			 */
			FileInputStream myInputStream = new FileInputStream(FILENAME);
			
			/*
			 * Luetaan tiedosto InputStreamReader-luokan avulla luomalla olio
			 * siitä ja antamalla parametriksi syötevirran olio. Luokka lukee 
			 * bittivirrat ja kääntää ne merkkivirroiksi. Metodeja ovat:
			 * read() -- lukee yksittäisen merkin
			 * read(char[], cbuf, int offset, int lenght) -- lukee merkkeijä arrayhin,
			 * parametreinä kohdebufferi, kohta mistä merkistä aloitetaan lukeminen, ja
			 * maksimimäärä luettuja merkkejä
			 * ready() -- boolean: onko stream valmis luettavaksi
			 * close() -- sulkee streamin.
			 */
			InputStreamReader myReader = new InputStreamReader(myInputStream);
			
			/*
			 * BufferedReader-luokka bufferoi merkkejä tekstiksi. read(),
			 * close()- ja ready() -metodien lisäksi:
			 * readLine() -- lukee rivin tekstiä
			 * skip(long n) -- hyppää merkkien yli, jossa n ylihypittävien merkkien määrä
			 * markSupported() -- kertoo, tukeeko stream mark()-operaatiota
			 * mark() -- merkkaa sen hetkisen sijainnin streamissa
			 * reset() -- palauttaa streamin viimeisimpään merkattuun sijaintiin
			 * lines() -- palauttaa streamin, tämän BufferedReadin kuvailemat tekstirivit??
			 */
			BufferedReader myBufferedReader = new BufferedReader(myReader);
			
			
			/*
			 * Niin kauan kun BufferedReader on valmis luettavaksi, line-muuttuja saa 
			 * arvokseen rivin tiedosta.
			 */
			while (myBufferedReader.ready()) {
				String line = myBufferedReader.readLine();
				System.out.println(line);
			}
			
			myBufferedReader.close();
		
			// Jos tiedostoa ei löydy, ilmoitetaan virheestä:
		} catch (FileNotFoundException e) {
			System.out.print("File missing!");
		
			// Jos jokin muu virhe tapahtuu:
		} catch (IOException e) {
			System.out.print("Error in reading!");
		}
	}
}