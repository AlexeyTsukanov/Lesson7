package com.company.lesson12.task4;

public class InstrumentTest {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[6];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(14.6);
        instruments[2] = new Trumpet(10.2);
        instruments[3] = new Guitar(4);
        instruments[4] = new Drum(15.5);
        instruments[5] = new Trumpet(11.7);

        for (Instrument instrument : instruments){
            instrument.play();
        }
    }
}
