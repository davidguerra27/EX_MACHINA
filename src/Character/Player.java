package Character;

import Field.*;
import Game.Sound;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static Field.MapFactory.*;

public class Player extends Character implements KeyboardHandler {

    private int fieldX = 0;
    private int fieldY = 0;
    private String[] pathFile = new String[8];

    protected MapFactory myFactory;
    protected FieldCreator fieldCreator;

    public Boolean pass,passTwo,passThree;
    Sound soundOne = new Sound("/Resources/sound/clipwaching.wav");

    Sound room2 = new Sound("/resources/sound/clipfalling.wav");
    Sound room3 = new Sound("/resources/sound/cliphacking.wav");
    Sound room4 = new Sound("/resources/sound/cliptestworked.wav");




    public Boolean movementStart = false;
    public int counter = 0;
    private Picture picture1;
    private Picture picture2;
    private Picture picture3;
    private Picture picture4;
    private Picture finalPicture;

    public DoorDialogue doorDialogue;
    public IntroDialogue introDialogue;
    public Book1Dialogue book1Dialogue;

    public Book2Dialogue book2Dialogue;
    public ClockDialogue clockDialogue;
    public Bed2Dialogue bed2Dialogue;
    public Bed3Dialogue bed3Dialogue;

    public OldPhoneDialogue oldPhoneDialogue;

    public HeatingDialogue heatingDialogue;
    public LabLockerDialogue labLocker1Dialogue;
    public LabLocker2Dialogue labLocker2Dialogue;
    public CoinsDialogue coinsDialogue;
    public PhoneDialogue phoneDialogue;
    public WristWatchDialogue wristWatchDialogue;
    public TutorialDialogue tutorialDialogue;
    public WardrobeDialogue wardrobeDialogue;

    public LampDialogue lampDialogue;
    public RouterDialogue routerDialogue;
    public LicenseDialogue licenseDialogue;
    public LabLocker3Dialogue labLocker3Dialogue;


    public Rectangle hitBox;
    public boolean collisionOn = false;

    private int x = 900;
    private int y = 80;

    public Player(MapFactory myFactory, FieldCreator fieldCreator) {
        this.myFactory = myFactory;
        this.fieldCreator = fieldCreator;
        soundOne.play(true);

        pathFile[0] = ("Resources/Player/player_front_1.png");
        pathFile[1] = ("Resources/Player/player_front_2.png");
        pathFile[2] = ("Resources/Player/player_back_1.png");
        pathFile[3] = ("Resources/Player/player_back_2.png");
        pathFile[4] = ("Resources/Player/player_left_1.png");
        pathFile[5] = ("Resources/Player/player_left_2.png");
        pathFile[6] = ("Resources/Player/player_right_1.png");
        pathFile[7] = ("Resources/Player/player_right_2.png");


        picture1 = new Picture(980, 600, pathFile[0]);
        picture2 = new Picture(980, 600, pathFile[2]);
        picture3 = new Picture(980, 600, pathFile[4]);
        picture4 = new Picture(980, 600, pathFile[6]);
        finalPicture = new Picture(10,10 ,"Resources/Menu/the_end.png");
        this.pass = false;
        this.passTwo = false;
        this.passThree = false;
        //DIALOGUES
        doorDialogue = new DoorDialogue();
        introDialogue = new IntroDialogue();
        book1Dialogue = new Book1Dialogue();
        book2Dialogue = new Book2Dialogue();
        clockDialogue = new ClockDialogue();
        bed2Dialogue = new Bed2Dialogue();
        bed3Dialogue = new Bed3Dialogue();
        oldPhoneDialogue = new OldPhoneDialogue();
        heatingDialogue = new HeatingDialogue();
        labLocker1Dialogue = new LabLockerDialogue();
        labLocker2Dialogue = new LabLocker2Dialogue();
        coinsDialogue = new CoinsDialogue();
        phoneDialogue = new PhoneDialogue();
        wristWatchDialogue = new WristWatchDialogue();
        tutorialDialogue = new TutorialDialogue();
        wardrobeDialogue = new WardrobeDialogue();
        lampDialogue = new LampDialogue();
        routerDialogue = new RouterDialogue();
        labLocker3Dialogue = new LabLocker3Dialogue();
        licenseDialogue = new LicenseDialogue();





        hitBox = new Rectangle(980, 600, 32, 32);
    }

    public boolean Collision() {
        for(int i= 0 ; i < myFactory.wallList.size(); i++ ){
            if (hitBox.getX() < myFactory.wallList.get(i).getX() + myFactory.wallList.get(i).getWidth()
                    && hitBox.getX() + hitBox.getWidth() > myFactory.wallList.get(i).getX()
                    && hitBox.getY() < myFactory.wallList.get(i).getY() + myFactory.wallList.get(i).getHeight()
                    && hitBox.getHeight() + hitBox.getY() > myFactory.wallList.get(i).getY()){

                System.out.println("COLISAO"+ myFactory.wallList.get(i));
                return true;
            }

        }
        return false;
        /*if ((hitBox.getX() < wall1.getX() + wall1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall1.getX()
                && hitBox.getY() < wall1.getY() + wall1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall1.getY()) || (hitBox.getX() < wall13.getX() + wall13.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall13.getX()
                && hitBox.getY() < wall13.getY() + wall13.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall13.getY()) || (hitBox.getX() > wall13.getX() + wall13.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall13.getX()
                && hitBox.getY() < wall13.getY() + wall13.getHeight()
                && hitBox.getHeight() + hitBox.getY() < wall13.getY()) || (hitBox.getX() > wall4.getX() + wall4.getHeight()
                && hitBox.getX() + hitBox.getWidth() > wall4.getX()
                && hitBox.getY() < wall4.getY() + wall4.getWidth()
                && hitBox.getY() + hitBox.getHeight() < wall4.getY()) || (hitBox.getX() > wall2.getX() + wall2.getHeight()
                && hitBox.getX() + hitBox.getWidth() > wall2.getX()
                && hitBox.getY() < wall2.getY() + wall2.getWidth()
                && hitBox.getY() + hitBox.getHeight() < wall2.getY()) || (hitBox.getX() < wall5.getX() + wall5.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall5.getX()
                && hitBox.getY() < wall5.getY() + wall5.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall5.getY()) || (hitBox.getX() < wall7.getX() + wall7.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall7.getX()
                && hitBox.getY() < wall7.getY() + wall7.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall7.getY()) || (hitBox.getX() < wall9.getX() + wall9.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall9.getX()
                && hitBox.getY() < wall9.getY() + wall9.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall9.getY()) || hitBox.getX() < wall12.getX() + wall12.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall12.getX()
                && hitBox.getY() < wall12.getY() + wall12.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall12.getY() || (hitBox.getX() < wall15.getX() + wall15.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall15.getX()
                && hitBox.getY() < wall15.getY() + wall15.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wall15.getY()) || (hitBox.getX() > wall15.getX() + wall15.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall15.getX()
                && hitBox.getY() > wall15.getY() + wall13.getHeight()
                && hitBox.getHeight() + hitBox.getY() < wall15.getY()) || (hitBox.getX() < wall6.getX() + wall6.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wall6.getX()
                && hitBox.getY() < wall6.getY() + wall6.getHeight()
                && hitBox.getY() + hitBox.getHeight() > wall6.getY())) {

            System.out.println("COLISAO");
            return true;
        }
        return false;*/

    }
        public Boolean setMovementStart() {
            this.movementStart = true;
            return true;

        }
    public Boolean objectsCollision() {
        if ((hitBox.getX() < computer.getX() + computer.getWidth()
                && hitBox.getX() + hitBox.getWidth() > computer.getX()
                && hitBox.getY() < computer.getY() + computer.getHeight()
                && hitBox.getHeight() + hitBox.getY() > computer.getY())) {

            Dialoge dialoge = new Dialoge();
            dialoge.init();

            if (dialoge.rightAnswer == true) {
                System.out.println("vai te porta");
                this.pass = true;
                room2.play(true);
                soundOne.stop();


            }
            System.out.println(dialoge.rightAnswer);
            System.out.println("COLISAO OBJETO");

            return true;
        }else if ((hitBox.getX() < computerTwo.getX() + computerTwo.getWidth()
                && hitBox.getX() + hitBox.getWidth() > computerTwo.getX()
                && hitBox.getY() < computerTwo.getY() + computerTwo.getHeight()
                && hitBox.getHeight() + hitBox.getY() > computerTwo.getY())){
            DialogueTwo dialoge2 = new DialogueTwo();
            dialoge2.init();
            if (dialoge2.rightAnswerTwo == true) {
                System.out.println("vai te porta");
                room2.stop();
                room3.play(true);
                this.passTwo = true;
            }
            System.out.println(dialoge2.rightAnswerTwo);
            System.out.println("COLISAO OBJETO");

            return true;

        }else if ((hitBox.getX() < computerThree.getX() + computerThree.getWidth()
                && hitBox.getX() + hitBox.getWidth() > computerThree.getX()
                && hitBox.getY() < computerThree.getY() + computerThree.getHeight()
                && hitBox.getHeight() + hitBox.getY() > computerThree.getY())) {
            DialogueThree dialogue3 = new DialogueThree();
            dialogue3.init();
            if (dialogue3.rightAnswerThree == true) {
                System.out.println("vai te porta");
                this.passThree = true;
                room3.stop();
                room4.play(true);
            }
            System.out.println(dialogue3.rightAnswerThree);
            System.out.println("COLISAO OBJETO");

            return true;
        }else if ((hitBox.getX() < computerFour.getX() + computerFour.getWidth()
                && hitBox.getX() + hitBox.getWidth() > computerFour.getX()
                && hitBox.getY() < computerFour.getY() + computerFour.getHeight()
                && hitBox.getHeight() + hitBox.getY() > computerFour.getY())) {
            DialogueFour dialogueFour = new DialogueFour();
            dialogueFour.init();
            if (dialogueFour.rightAnswerFour == true) {
                this.pass = true;

                finalPicture.draw();
                picture1.delete();
                picture2.delete();
                picture3.delete();
                picture4.delete();

            }
            System.out.println(dialogueFour.rightAnswerFour);


            return true;
        }
        return false;
    }

    public Boolean doorsCollision() {


        if ((hitBox.getX() < myFactory.doorOne.getX() + myFactory.doorOne.getWidth()
                && hitBox.getX() + hitBox.getWidth() > myFactory.doorOne.getX()
                && hitBox.getY() < myFactory.doorOne.getY() + myFactory.doorOne.getHeight()
                && hitBox.getHeight() + hitBox.getY() > myFactory.doorOne.getY())) {


            if (this.pass) {

                return false;
            }
            doorDialogue.init();
            return true;
        }  if ((hitBox.getX() < doorTwo.getX() + doorTwo.getWidth()
                && hitBox.getX() + hitBox.getWidth() > doorTwo.getX()
                && hitBox.getY() < doorTwo.getY() + doorTwo.getHeight()
                && hitBox.getHeight() + hitBox.getY() > doorTwo.getY())&& this.pass == true) {
            if (this.passTwo) {

                return false;
            }
            doorDialogue.init();
            return true;
        } else if ((hitBox.getX() < myFactory.doorThree.getX() + myFactory.doorThree.getWidth()
                && hitBox.getX() + hitBox.getWidth() > myFactory.doorThree.getX()
                && hitBox.getY() < myFactory.doorThree.getY() + myFactory.doorThree.getHeight()
                && hitBox.getHeight() + hitBox.getY() > myFactory.doorThree.getY())) {
            if (this.passThree) {

                return false;
            }
            doorDialogue.init();
            return true;
        } else if ((hitBox.getX() < checkpoint1.getX() + checkpoint1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > checkpoint1.getX()
                && hitBox.getY() < checkpoint1.getY() + checkpoint1.getHeight()
                && hitBox.getHeight() + hitBox.getY()   > checkpoint1.getY())){

            introDialogue.init();
        }else if ((hitBox.getX() < checkpoint2.getX() + checkpoint2.getWidth()
                && hitBox.getX() + hitBox.getWidth() > checkpoint2.getX()
                && hitBox.getY() < checkpoint2.getY() + checkpoint2.getHeight()
                && hitBox.getHeight() + hitBox.getY()   > checkpoint2.getY())){

            tutorialDialogue.init();
        }
        else if ((hitBox.getX() < book1.getX() + book1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > book1.getX()
                && hitBox.getY() < book1.getY() + book1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > book1.getY())){

            book1Dialogue.init();
            return true;
        }else if ((hitBox.getX() < iPod1.getX() + iPod1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > iPod1.getX()
                && hitBox.getY() < iPod1.getY() + iPod1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > iPod1.getY())){

            book2Dialogue.init();
            return true;
        }else if ((hitBox.getX() < wardrobe1.getX() + wardrobe1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wardrobe1.getX()
                && hitBox.getY() < wardrobe1.getY() + wardrobe1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wardrobe1.getY())) {

            wardrobeDialogue.init();
            return true;
        }else if ((hitBox.getX() < myFactory.hologram.getX() + myFactory.hologram.getWidth()
            && hitBox.getX() + hitBox.getWidth() > myFactory.hologram.getX()
            && hitBox.getY() < myFactory.hologram.getY() + myFactory.hologram.getHeight()
            && hitBox.getHeight() + hitBox.getY() > myFactory.hologram.getY())){


        return true;
    } else if ((hitBox.getX() < clock1.getX() + clock1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > clock1.getX()
                && hitBox.getY() < clock1.getY() + clock1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > clock1.getY())){

            clockDialogue.init();
            return true;
        } else if ((hitBox.getX() < calendar.getX() + calendar.getWidth()
                && hitBox.getX() + hitBox.getWidth() > calendar.getX()
                && hitBox.getY() < calendar.getY() + calendar.getHeight()
                && hitBox.getHeight() + hitBox.getY() > calendar.getY())){

            bed2Dialogue.init();
            return true;
        } else if ((hitBox.getX() < bed1.getX() + bed1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > bed1.getX()
                && hitBox.getY() < bed1.getY() + bed1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > bed1.getY())){

            bed3Dialogue.init();
            return true;
        } else if ((hitBox.getX() < oldPhone.getX() + oldPhone.getWidth()
                && hitBox.getX() + hitBox.getWidth() > oldPhone.getX()
                && hitBox.getY() < oldPhone.getY() + oldPhone.getHeight()
                && hitBox.getHeight() + hitBox.getY() > oldPhone.getY())){

            oldPhoneDialogue.init();
            return true;
        }
        else if ((hitBox.getX() < heating.getX() + heating.getWidth()
                && hitBox.getX() + hitBox.getWidth() > heating.getX()
                && hitBox.getY() < heating.getY() + heating.getHeight()
                && hitBox.getHeight() + hitBox.getY() > heating.getY())){

            heatingDialogue.init();
            return true;
        }
        else if ((hitBox.getX() < labLocker.getX() + labLocker.getWidth()
                && hitBox.getX() + hitBox.getWidth() > labLocker.getX()
                && hitBox.getY() < labLocker.getY() + labLocker.getHeight()
                && hitBox.getHeight() + hitBox.getY() > labLocker.getY())){

            labLocker1Dialogue.init();
            return true;
        }
        else if ((hitBox.getX() < labLocker2.getX() + labLocker2.getWidth()
                && hitBox.getX() + hitBox.getWidth() > labLocker2.getX()
                && hitBox.getY() < labLocker2.getY() + labLocker2.getHeight()
                && hitBox.getHeight() + hitBox.getY() > labLocker2.getY())){

            labLocker2Dialogue.init();
            return true;
        }
        else if ((hitBox.getX() < coins.getX() + coins.getWidth()
                && hitBox.getX() + hitBox.getWidth() > coins.getX()
                && hitBox.getY() < coins.getY() + coins.getHeight()
                && hitBox.getHeight() + hitBox.getY() > coins.getY())){

            coinsDialogue.init();
            return true;
        }
        else if ((hitBox.getX() < phone1.getX() + phone1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > phone1.getX()
                && hitBox.getY() < phone1.getY() + phone1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > phone1.getY())){

            phoneDialogue.init();
            return true;
        }else if ((hitBox.getX() < wristWatch1.getX() + wristWatch1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > wristWatch1.getX()
                && hitBox.getY() < wristWatch1.getY() + wristWatch1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > wristWatch1.getY())){

            wristWatchDialogue.init();
            return true;
        } else if ((hitBox.getX() < labLocker3.getX() + labLocker3.getWidth()
                && hitBox.getX() + hitBox.getWidth() > labLocker3.getX()
                && hitBox.getY() < labLocker3.getY() + labLocker3.getHeight()
                && hitBox.getHeight() + hitBox.getY() > labLocker3.getY())){

            labLocker3Dialogue.init();
            return true;
        } else if ((hitBox.getX() < licence1.getX() + licence1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > licence1.getX()
                && hitBox.getY() < licence1.getY() + licence1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > licence1.getY())){

            licenseDialogue.init();
            return true;
        }else if ((hitBox.getX() < lamp1.getX() + lamp1.getWidth()
                && hitBox.getX() + hitBox.getWidth() > lamp1.getX()
                && hitBox.getY() < lamp1.getY() + lamp1.getHeight()
                && hitBox.getHeight() + hitBox.getY() > lamp1.getY())){

            lampDialogue.init();
            return true;
        }else if ((hitBox.getX() < router.getX() + router.getWidth()
                && hitBox.getX() + hitBox.getWidth() > router.getX()
                && hitBox.getY() < router.getY() + router.getHeight()
                && hitBox.getHeight() + hitBox.getY() > router.getY())){

            routerDialogue.init();
            return true;
        }

        return false;
    }


    public void init() {
        picture1.draw();

        initKeyboard();
    }

    public void getPicture() {

    }

    public int getX() {
        return this.picture1.getX();
    }

    public int getY() {
        return this.picture1.getY();
    }

    private void initKeyboard() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_D);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_A);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_W);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_S);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent functionPressed = new KeyboardEvent();
        functionPressed.setKey(KeyboardEvent.KEY_F);
        functionPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(rightPressed);
        keyboard.addEventListener(leftPressed);
        keyboard.addEventListener(upPressed);
        keyboard.addEventListener(downPressed);
        keyboard.addEventListener(functionPressed);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int x;
        int y;
        counter++;

        if (movementStart) {

            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_D:
                    picture4.draw();
                    //hitBox.draw();

                    picture1.delete();
                    picture2.delete();
                    picture3.delete();



                    if (!doorsCollision()) {
                        if (!objectsCollision()) {
                            if (!Collision()) {

                                picture1.translate(5, 0);
                                picture2.translate(5, 0);
                                picture3.translate(5, 0);
                                picture4.translate(5, 0);
                                hitBox.translate(5, 0);
                            }
                        }
                    }
                    if (doorsCollision()) {
                        picture1.translate(-5, 0);
                        picture2.translate(-5, 0);
                        picture3.translate(-5, 0);
                        picture4.translate(-5, 0);
                        hitBox.translate(-5, 0);

                    }
                    if (Collision()) {
                        picture1.translate(-5, 0);
                        picture2.translate(-5, 0);
                        picture3.translate(-5, 0);
                        picture4.translate(-5, 0);
                        hitBox.translate(-5, 0);
                    }
                    if (objectsCollision()) {

                        picture1.translate(-5, 0);
                        picture2.translate(-5, 0);
                        picture3.translate(-5, 0);
                        picture4.translate(-5, 0);
                        hitBox.translate(-5, 0);


                    }

                    break;

                case KeyboardEvent.KEY_A:
                    System.out.println("x " + picture1.getX());

                    picture3.draw();
                    picture1.delete();
                    picture2.delete();
                    picture4.delete();

                    if (!doorsCollision()) {
                        if (!objectsCollision()) {

                            if (!Collision()) {

                                picture1.translate(-5, 0);
                                picture2.translate(-5, 0);
                                picture3.translate(-5, 0);
                                picture4.translate(-5, 0);
                                hitBox.translate(-5, 0);

                            }
                        }
                    }
                    if (doorsCollision()) {
                        picture1.translate(5, 0);
                        picture2.translate(5, 0);
                        picture3.translate(5, 0);
                        picture4.translate(5, 0);
                        hitBox.translate(5, 0);

                    }
                    if (Collision()) {
                        picture1.translate(5, 0);
                        picture2.translate(5, 0);
                        picture3.translate(5, 0);
                        picture4.translate(5, 0);
                        hitBox.translate(5, 0);
                    }
                    if (objectsCollision()) {
                        picture1.translate(5, 0);
                        picture2.translate(5, 0);
                        picture3.translate(5, 0);
                        picture4.translate(5, 0);
                        hitBox.translate(5, 0);
                    }

                    break;

                case KeyboardEvent.KEY_W:

                    picture2.draw();
                    picture1.delete();
                    picture3.delete();
                    picture4.delete();


                    if (!doorsCollision()) {
                        if (!objectsCollision()) {
                            if (!Collision()) {

                                picture1.translate(0, -5);
                                picture2.translate(0, -5);
                                picture3.translate(0, -5);
                                picture4.translate(0, -5);
                                hitBox.translate(0, -5);
                            }
                        }
                    }

                    if (doorsCollision()) {
                        picture1.translate(0, 5);
                        picture2.translate(0, 5);
                        picture3.translate(0, 5);
                        picture4.translate(0, 5);
                        hitBox.translate(0, 5);
                    }
                    if (Collision()) {
                        picture1.translate(0, 5);
                        picture2.translate(0, 5);
                        picture3.translate(0, 5);
                        picture4.translate(0, 5);
                        hitBox.translate(0, 5);
                    }
                    if (objectsCollision()) {

                        picture1.translate(0, 5);
                        picture2.translate(0, 5);
                        picture3.translate(0, 5);
                        picture4.translate(0, 5);
                        hitBox.translate(0, 5);
                    }
                    break;

                case KeyboardEvent.KEY_S:

                    System.out.println(" y -" + picture1.getY());

                    picture1.draw();
                    picture2.delete();
                    picture3.delete();
                    picture4.delete();


                    if (!doorsCollision()) {
                        if (!objectsCollision()) {
                            if (!Collision()) {
                                picture1.translate(0, 5);
                                picture2.translate(0, 5);
                                picture3.translate(0, 5);
                                picture4.translate(0, 5);
                                hitBox.translate(0, 5);
                            }
                        }
                    }
                    if (doorsCollision()) {
                        picture1.translate(0, -5);
                        picture2.translate(0, -5);
                        picture3.translate(0, -5);
                        picture4.translate(0, -5);
                        hitBox.translate(0, -5);
                    }

                    if (Collision()) {
                        picture1.translate(0, -5);
                        picture2.translate(0, -5);
                        picture3.translate(0, -5);
                        picture4.translate(0, -5);
                        hitBox.translate(0, -5);
                    }
                    if (objectsCollision()) {
                        picture1.translate(0, -5);
                        picture2.translate(0, -5);
                        picture3.translate(0, -5);
                        picture4.translate(0, -5);
                        hitBox.translate(0, -5);
                    }
                    break;

                case KeyboardEvent.KEY_F:

                    doorDialogue.remove();
                    introDialogue.remove();
                    book1Dialogue.remove();
                    book2Dialogue.remove();
                    clockDialogue.remove();
                    bed2Dialogue.remove();
                    bed3Dialogue.remove();
                    oldPhoneDialogue.remove();
                    heatingDialogue.remove();
                    labLocker1Dialogue.remove();
                    labLocker2Dialogue.remove();
                    coinsDialogue.remove();
                    phoneDialogue.remove();
                    wristWatchDialogue.remove();
                    tutorialDialogue.remove();
                    wardrobeDialogue.remove();
                    lampDialogue.remove();
                    routerDialogue.remove();
                    licenseDialogue.remove();
                    labLocker3Dialogue.remove();


                    System.out.println("F");
                    break;
            }
        }
    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_D:
                picture3 = picture1;
                break;
            case KeyboardEvent.KEY_A:
                picture4 = picture1;

                break;
            case KeyboardEvent.KEY_W:
                picture2 = picture1;
                break;
            case KeyboardEvent.KEY_S:
                picture1 = picture4;
                break;
            case KeyboardEvent.KEY_F:
                break;
        }
    }
}
