package test.hvl.dat109;

import no.hvl.dat109.objekter.Brett;
import no.hvl.dat109.objekter.Brikke;
import no.hvl.dat109.objekter.Rute;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {
    private Brett brett;
    private Map<Integer, Rute> ruteKart;
    Brikke brikke;

    @BeforeEach
    public void setup() {
        brett = new Brett();

        ruteKart = brett.getBrett();

        brikke = new Brikke("Rosa", brett);
    }

    @Test
    public void sjekkOmBrettHarHundreFelter() {
        assertEquals(100, ruteKart.size());
    }

    @Test
    public void sjekkOmBrettHarSlanger() {
    	
        assertEquals(6, ruteKart.get(16).getNyRuteNr());
        assertEquals(26, ruteKart.get(47).getNyRuteNr());
        assertEquals(11, ruteKart.get(49).getNyRuteNr());
        assertEquals(53, ruteKart.get(56).getNyRuteNr());
        assertEquals(18, ruteKart.get(62).getNyRuteNr());
    }

    @Test
    public void sjekkOmBrettHarStiger() {
    	
        assertEquals(38, ruteKart.get(2).getNyRuteNr());
        assertEquals(14, ruteKart.get(4).getNyRuteNr());
        assertEquals(31, ruteKart.get(8).getNyRuteNr());
        assertEquals(42, ruteKart.get(21).getNyRuteNr());
        assertEquals(84, ruteKart.get(28).getNyRuteNr());
    }

    @Test
    public void sjekkOmBrikkeInitialiseresTilPosisjon1() {
        assertEquals(1, brikke.getRute().getRuteNr());
    }

    @Test
    public void sjekkOmBrikkeFlyttesSeksRuter() {
        brikke.flytt(6);
        assertEquals(7, brikke.getRute().getRuteNr());
    }

    @Test
    public void sjekkOmBrikkeKanFlyttesTilBestemtRute() {
        brikke.flyttTilNyPosisjon(50);
        assertEquals(50, brikke.getRute().getRuteNr());
    }

    @Test
    public void sjekkOmNyRuteErFireLengerFrem(){
        Rute rute = brett.getBrett().get(1); //startrute
        Rute nyRute = brett.nyRutePos(rute, 4);
        assertEquals(5, nyRute.getRuteNr());
    }
}
