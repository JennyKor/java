
import java.io.*;

public class Reading {
	public static void main(String[] args) {
		
		// Muuttujan arvona tekstitiedoston nimi
		String FILENAME = "out.txt";
		
		//Testataan koodia virheiden varalta
		try {
			/*Avataan tiedosto lukemista varten luomalla olio 
			 * FileInputStream-luokasta, liitt�en n�in sy�tevirran
			 * tiedostosta ohjelmaan
			 */
			FileInputStream myInputStream = new FileInputStream(FILENAME);
			
			/*
			 * Luetaan tiedosto InputStreamReader-luokan avulla luomalla olio
			 * siit� ja antamalla parametriksi sy�tevirran olio. Luokka lukee 
			 * bittivirrat ja k��nt�� ne merkkivirroiksi. Metodeja ovat:
			 * read() -- lukee yksitt�isen merkin
			 * read(char[], cbuf, int offset, int lenght) -- lukee merkkeij� arrayhin,
			 * parametrein� kohdebufferi, kohta mist� merkist� aloitetaan lukeminen, ja
			 * maksimim��r� luettuja merkkej�
			 * ready() -- boolean: onko stream valmis luettavaksi
			 * close() -- sulkee streamin.
			 */
			InputStreamReader myReader = new InputStreamReader(myInputStream);
			
			/*
			 * BufferedReader-luokka bufferoi merkkej� tekstiksi. read(),
			 * close()- ja ready() -metodien lis�ksi:
			 * readLine() -- lukee rivin teksti�
			 * skip(long n) -- hypp�� merkkien yli, jossa n ylihypitt�vien merkkien m��r�
			 * markSupported() -- kertoo, tukeeko stream mark()-operaatiota
			 * mark() -- merkkaa sen hetkisen sijainnin streamissa
			 * reset() -- palauttaa streamin viimeisimp��n merkattuun sijaintiin
			 * lines() -- palauttaa streamin, t�m�n BufferedReadin kuvailemat tekstirivit??
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
		
			// Jos tiedostoa ei l�ydy, ilmoitetaan virheest�:
		} catch (FileNotFoundException e) {
			System.out.print("File missing!");
		
			// Jos jokin muu virhe tapahtuu:
		} catch (IOException e) {
			System.out.print("Error in reading!");
		}
	}
}