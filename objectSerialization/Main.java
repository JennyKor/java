import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
        	
        	/*
        	 * Luodaan olio FileOutputStreamistä käyttäen sen muodostinta, ja 
        	 * annetaan parametriksi tiedosto. FileOutputStream kirjoittaa annetun 
        	 * tiedon tähän tiedostoon.
        	 * 
        	 * Luodaan olio ObjectOutputSteamistä käyttäen sen muodostinta, ja
        	 * annetaan parametriksi FileOutputStreamin olio. ObjectOutputStream
        	 * mahdollistaa olion kirjoittamisen tiedostoon.
        	 */
            FileOutputStream fileOut = new FileOutputStream("katintiedot.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            /*
             * Luodaan Kissa-luokasta kattiolio, ja tulostetaan sen tiedot.
             */
            Kissa katti = new Kissa();
            System.out.println("Kissan tiedot: " + katti.getHanta());
            System.out.println("Kissa luetut tiedot: " + katti.getLuonne());

            /* 
             * Kirjoitetaan kattiolion tiedot tiedostoon kutsumalla ObjectOutStreamin
             * metodia writeObject luokan oman olion kautta.
             */
            objOut.writeObject(katti);
            objOut.close();


        } catch (Exception e) {
        }

        try {
            FileInputStream fileIn = new FileInputStream("katintiedot.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            Kissa katti2;

            katti2 = (Kissa) objIn.readObject();
            objIn.close();

            System.out.println("Kissa luetut tiedot: " + katti2.getHanta());
            System.out.println("Kissa luetut tiedot: " + katti2.getLuonne());

        } catch (Exception e) {
        }

    }
}