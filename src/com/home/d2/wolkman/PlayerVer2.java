package com.home.d2.wolkman;

public class PlayerVer2 extends Player {
    private final int SERIAL_NUMBER_OF_VERSION = 78901234;

    public PlayerVer2(){}

    public void play(){
        super.play();
        super.play();
    }

    @Override
    public String toString() {
        return "PlayerVer2{" +
                "SERIAL_NUMBER_OF_VERSION=" + SERIAL_NUMBER_OF_VERSION +
                '}';
    }
}
