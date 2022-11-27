package MenuRepresentation;
import Game.Sound;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuRepresentation {

    private Picture menuBackground;
    private Picture menuLoading;
    private Picture instructions;
    private Picture credits;
    private Sound loading;
    private Sound menu;

    public MenuRepresentation() {




        this.menuBackground = new Picture(0, 0, "resources/menu/menu.png");
        this.menuLoading = new Picture(0,0, "resources/menu/capa.png");
        this.instructions = new Picture(0,0, "resources/menu/options.png");
        this.credits = new Picture(0,0, "");
        this.loading = new Sound("/Resources/sound/clipfalling.wav");
        this.menu = new Sound("/Resources/sound/clipfalling.wav");
    }

    public void init() throws InterruptedException {
        menuLoading.draw();
        Thread.sleep(600);
        loading.play(true);
        Thread.sleep(5500);
        menuLoading.delete();
    }

    public void mainMenu() {
        menuBackground.draw();
    }

    public void stopMenuSound() {
        menu.stop();
    }

    public void menuSound() {
        menu = new Sound("/Resources/sound/clipfalling.wav");
        menu.setLoop(10);
        menu.play(true);
    }

    public void instructions() {
        instructions.draw();
    }

    public void credits() {
        credits.draw();
    }

    public void creditsDelete() {
        credits.delete();
    }

    public void instructionsDelete() {
        instructions.delete();
    }
}

