
import java.io.*;

/*
 * Serializable-rajapinta mahdollistaa olion edustamisen bittisarjana,
 * joka sis‰lt‰‰ olion datan, olion tyypin, sek‰ tiedon olioon
 * tallennettujen tietojen muodosta. Kirjoitetut tiedot n‰kyv‰t 
 * tiedostossa symboleina.
 * 
 * T‰m‰ mahdollistaa sen, ett‰ kun serialisoitu olio on kijoitettu tiedostoon, 
 * se voidaan lukea sielt‰ ja luoda se uudelleen muistista. 
 */
public class Kissa implements Serializable {

    private String hanta;
    private String luonne;

    public Kissa() {
        hanta = "kippura";
        luonne = null;
    }

    public String getLuonne() {
        return luonne;
    }

    public void setLuonne(String luonne) {
        this.luonne = luonne;
    }

    public String getHanta() {
        return hanta;
    }

    public void setHanta(String hanta) {
        this.hanta = hanta;
    }
}