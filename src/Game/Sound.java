package Game;



import  javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
public class Sound {

    private Clip clip;
    private URL soundURL;


    public Sound(String path){
        initClip(path);
    }

    public void play(boolean fromStart) {

        if (fromStart) {
            clip.setFramePosition(0);
        }
        clip.start();
    }

    public void stop() {

        clip.stop();
    }

    public void setLoop(int times) {
        clip.loop(times);
    }

    private void initClip(String path) {

        soundURL = Sound.class.getResource(path); //if loading from jar
        AudioInputStream inputStream = null;

        try {

            if (soundURL == null) {
                path = path.substring(1);
                File file = new File(path);
                soundURL = file.toURI().toURL(); //if executing on intellij
            }

            inputStream = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(inputStream);

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /*
         soundURL[0] = getClass().getResource("clip watching.wav"); // Watching -- 1m10s a 2min 30
         soundURL[1] = getClass().getResource("clip falling.wav"); // Falling -- 4m30s a 5m20s
         soundURL[2] = getClass().getResource("clip hacking.wav"); // Hacking -- 30s a 1m45s
         soundURL[3] = getClass().getResource("clip test worked.wav"); // The test worked -- 6m30s a 8min
     }

    public void setFile(int i) {

        try {

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        } catch (Exception e) {
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void setLoop(int times) {
        clip.loop(times);
    }

        public void stop() {
            clip.stop();

        }
*/    }