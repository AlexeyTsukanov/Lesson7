package com.home.d2.wolkman;

public class Player {
    private final int SERIAL_NUMBER_OF_VERSION = 1234567;
    private InputJack inputJack = new InputJack();

    public Player(){}

    public void play(){
        inputJack.playMusic(3.5);
    }

    @Override
    public String toString() {
        return "Player{" +
                "SERIAL_NUMBER=" + SERIAL_NUMBER_OF_VERSION +
                '}';
    }

    static class InputJack{
        private final double SIZE = 3.5;

        private void playMusic(double SizeOfPlug){
            if (SizeOfPlug == SIZE) {
                System.out.println("Music is playing!");
            }
        }


    }
}
