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
        //slangehode på 25->2, 52-42, 70->55, 95->72, 99->54
        assertEquals(2, ruteKart.get(25).getNyRuteNr());
        assertEquals(42, ruteKart.get(52).getNyRuteNr());
        assertEquals(55, ruteKart.get(70).getNyRuteNr());
        assertEquals(72, ruteKart.get(95).getNyRuteNr());
        assertEquals(54, ruteKart.get(99).getNyRuteNr());
    }

    @Test
    public void sjekkOmBrettHarStiger() {
        //stige på 6->25, 11->40, 17->69, 46->90, 60->85
        assertEquals(25, ruteKart.get(6).getNyRuteNr());
        assertEquals(40, ruteKart.get(11).getNyRuteNr());
        assertEquals(69, ruteKart.get(17).getNyRuteNr());
        assertEquals(90, ruteKart.get(46).getNyRuteNr());
        assertEquals(85, ruteKart.get(60).getNyRuteNr());
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
