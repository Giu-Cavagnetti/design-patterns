package mydesignpatternstest;

import mydesignpatterns.strutturali.facade.*;

public class FacadeTest {
    public static void main(String[] args) throws InterruptedException {

        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        BluRayPlayer bluRay = new BluRayPlayer();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audio, bluRay, lights);
        //volendo si poteva utilizzare un builder qui

        homeTheater.guardaFilm("Interstellar");

        System.out.println();

        Thread.sleep(10000);

        homeTheater.terminaFilm();
    }
}
