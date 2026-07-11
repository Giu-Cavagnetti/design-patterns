package mydesignpatterns.strutturali.facade;

public class HomeTheaterFacade {

    private final TV tv;
    private final AudioSystem audio;
    private final BluRayPlayer bluRay;
    private final Lights lights;

    public HomeTheaterFacade(
            TV tv,
            AudioSystem audio,
            BluRayPlayer bluRay,
            Lights lights) {

        this.tv = tv;
        this.audio = audio;
        this.bluRay = bluRay;
        this.lights = lights;
    }

    public void guardaFilm(String film) {

        System.out.println("Preparazione film...");

        lights.spegni();
        tv.accendi();
        audio.accendi();
        audio.setVolume(20);

        bluRay.accendi();
        bluRay.play(film);
    }

    public void terminaFilm() {

        System.out.println("Spegnimento Home Theater...");

        bluRay.stop();
        bluRay.spegni();

        audio.spegni();
        tv.spegni();

        lights.accendi();
    }
}