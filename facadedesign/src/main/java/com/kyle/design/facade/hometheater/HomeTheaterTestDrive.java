package com.kyle.design.facade.hometheater;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-23 15:54
 * @description :
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amplifier);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amplifier);
        CDPlayer cd = new CDPlayer("CD Player", amplifier);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amplifier, tuner, player,
                        projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
