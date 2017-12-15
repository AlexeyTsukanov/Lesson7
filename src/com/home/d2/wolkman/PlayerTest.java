package com.home.d2.wolkman;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        System.out.println(player);

        Player playerVer2 = new PlayerVer2();
        playerVer2.play();
        System.out.println(playerVer2);
    }
}
