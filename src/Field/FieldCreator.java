package Field;
//GIVES US ACCESS TO THE GAME SCREEN
//import Game.GamePanel;

import Game.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import Character.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class FieldCreator implements KeyboardHandler {
    //ISTANCIATING THE GAME PANEL ALLOWS US TO
    // READ THE MAP AND LATER DRAW IT ON THE SCREEN(ignore the red)

    //THE ARRAY THAT WILL CONTAIN ALL THE DIFERENT TYPES OF CELLS(SOLID,OR NOT);

    //TWO DIMENSIONAL ARRAY THAT HOLDS THE COORDINATES OF EACH CELL
    public int MapCellNum[][];
    // GAME ENTRANCE IMAGE
    private Picture picture;
    // PRESS START IMAGE
    private Picture pictureTwo;
    // MAP IMAGE
    private Picture pictureMap;
    // MENU IMAGE
    private Picture pictureMenu;
    private Boolean gameStart = false;

    // Vou precisar o gameStart pelo resto abaixo?
    private Boolean gameCredits = false;
    private Boolean gameSound = false;
    private Boolean gameOptions = false;
    private Picture credits;
    private Picture options;

    private Picture sound;
    private Picture firstMenu;


    private Picture sofaOne;
    private Picture computer,computerTwo,computerThree,computerFour,licence1;
    private Picture table;
    private Picture sofaTwo;
    public Rectangle doorOne,doorTwo,doorThree,checkpoint1,checkpoint2;
    private Picture hologram;
    private Player player;

    private Dialoge dialoge;
    //OBJECTS
    public Picture book1,book2,lamp1,lamp2,lamp3,lamp4,phone1,iPod1,bed,ROBOT, clock1,chair1
            ,bed1,chair2,calendar, chair1room3, chair2room3,chair3room3, labLocker,labLocker2,labLocker3,
            oldPhone, heating, morse, coins,wristWatch1,wardrobe, table1, chair1Room4, router,creditsmenu;




    public Boolean pass;
    //FIELD CREATOR CONSTRUCTOR
    public FieldCreator() {


        Rectangle rectangle = new Rectangle(10, 10, 1024, 640);
        rectangle.setColor(Color.BLACK);
        rectangle.fill();


        this.pictureMenu = new Picture(10,10,"Resources/Menu/menu.png");
        this.picture = new Picture(10, 10, "resources/menu/capa.png");
        this.pictureTwo = new Picture(650, 530, "resources/menu/space.png");
        this.pictureMap = new Picture(10,10,"Resources/sound/mapa.jpg");
        this.credits = new Picture(700,300,"resources/menu/credits.png");
        this.options = new Picture(700,100,"resources/menu/options.png");
        this.sound = new Picture(700,200,"resources/menu/sound.png");
        this.firstMenu = new Picture(10,10,"resources/menu.jpg");
        this.sofaOne = new Picture(510,150,"Resources/Objects/couch-1.png");
        this.computer = new Picture(700,65,"Resources/Objects/computer1.bmp");
        this.creditsmenu = new Picture(10,10,"Resources/menu/creditspage.png");



        this.table = new Picture(510,65,"Resources/Objects/table.png");
        this.sofaTwo = new Picture(475,400,"Resources/Objects/couch-2.png");
        this.hologram = new Picture(800,400,"Resources/Objects/hologram_table.png");
        this.ROBOT = new Picture(810,360,"Resources/Objects/robot2.png");
        this.doorOne = new Rectangle(500,260,10,40);;
        this.doorTwo = new Rectangle(70,580,40,10);
        this.doorThree = new Rectangle(540,260,10,40);



        this.checkpoint1 = new Rectangle(1000,520,20,5);




        this.computerTwo = new Picture(420,65,"Resources/Objects/computer1.bmp");
        this.computerThree = new Picture(467, 500,"Resources/Objects/computer_rotate.png");
        this.computerFour = new Picture(700,320,"Resources/Objects/computer1.bmp");
        this.clock1 = new Picture(150,50,"Resources/Objects/clock1.png");
        this.book1 = new Picture(520,75,"Resources/Objects/bible1.png");
        this.iPod1 = new Picture(508,160,"Resources/Objects/iPod1.png");
        this.chair1 = new Picture(148,60,"Resources/Objects/chair.png");
        this.chair2 = new Picture(200,282,"Resources/Objects/chair.png");
        this.wardrobe = new Picture(760,250, "Resources/Objects/wardrobe1.png");

        this.calendar = new Picture(208,278,"Resources/Objects/calendar.png");
        this.bed1 = new Picture(80,60,"Resources/Objects/bed1.png");
        this.chair1room3 = new Picture(160,540,"Resources/Objects/chair.png");
        this.chair2room3 = new Picture(200,540,"Resources/Objects/chair.png");
        this.chair3room3 = new Picture(300 , 540,"Resources/Objects/chair.png");
        this.labLocker = new Picture(180, 320 , "Resources/Objects/lab1_rotated.png");
        this.labLocker2 = new Picture(315,320,"Resources/Objects/lab1_rotated.png");
        this.oldPhone = new Picture(170,535, "Resources/Objects/oldPhone.png");
        this.heating = new Picture(80, 420 ,"Resources/Objects/heating1.png");
        this.morse = new Picture( 200, 400, "Resources/Objects/morse.png");
        this.coins = new Picture(204, 530, "Resources/Objects/coins1.png");
        this.phone1 = new Picture(465,410,"Resources/Objects/phone1.png");
        this.wristWatch1 = new Picture ( 305,535,"Resources/Objects/wristWatch1.png");
        this.licence1 = new Picture(530,540,"Resources/Objects/licence1.png");
        this.table1 = new Picture(510,525,"Resources/Objects/table.png");
        this.labLocker3 = new Picture(510,385,"Resources/Objects/lab1_rotated.png");
        this.lamp1 = new Picture(900,320,"Resources/Objects/lamp1.png");
        this.chair1Room4 = new Picture(880,540,"Resources/Objects/chair.png");
        this.router = new Picture(890,530,"Resources/Objects/tablet1.png");


        MapFactory myFactory = new MapFactory();
        player = new Player(myFactory, this);

        this.pass = player.pass;


        player.getPicture();
        player.init();


    }

    public void init() throws InterruptedException {

        this.pictureMap.draw();
        this.picture.draw();



        initKeyboard();
        while (!gameStart) {
            Thread.sleep(600);
          if (!gameStart) {
              this.pictureTwo.draw();


          } Thread.sleep(600);
            this.pictureTwo.delete();


        } // NEED TO SEE THE SLEEP METHOD CAUSE ITS MESSING WITH THE SPACING

        this.options.delete();
        this.credits.delete();
        this.sound.delete();
    }

    private void initKeyboard() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spacePressed);

        KeyboardEvent rPressed = new KeyboardEvent();
        rPressed.setKey(KeyboardEvent.KEY_R);
        rPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(rPressed);

        KeyboardEvent tPressed = new KeyboardEvent();
        tPressed.setKey(KeyboardEvent.KEY_T);
        tPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(tPressed);

        KeyboardEvent yPressed = new KeyboardEvent();
        yPressed.setKey(KeyboardEvent.KEY_Y);
        yPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(yPressed);

        KeyboardEvent qPressed = new KeyboardEvent();
        qPressed.setKey(KeyboardEvent.KEY_Q);
        qPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(qPressed);


        KeyboardEvent xPressed = new KeyboardEvent();
        xPressed.setKey(KeyboardEvent.KEY_X);
        xPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(xPressed);

    }

    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                Thread.currentThread().interrupt();
                pictureTwo.delete();
                Thread.currentThread().interrupt();

                this.sofaOne.draw();
                this.sofaTwo.draw();
                this.pictureMenu.draw();

                picture.delete();


                gameStart = true;

                break;

            case KeyboardEvent.KEY_R:
                gameStart = true;
                //ROOM ONE
                this.table.draw();
                this.computer.draw();
                this.book1.draw();
                this.iPod1.draw();
                this.chair1.draw();
                this.wardrobe.draw();
                //ROOM TWO
                this.computerTwo.draw();
                this.clock1.draw();
                this.bed1.draw();
                this.chair2.draw();
                this.calendar.draw();
                //ROOM THREE
                this.computerThree.draw();
                this.chair1room3.draw();
                this.chair2room3.draw();
                this.chair3room3.draw();
                this.labLocker.draw();
                this.labLocker2.draw();
                this.oldPhone.draw();
                this.heating.draw();
                this.morse.draw();
                this.coins.draw();
                this.phone1.draw();
                this.wristWatch1.draw();
                //ROOM FOUR
                this.computerFour.draw();
                this.hologram.draw();
                this.ROBOT.draw();
                this.pictureMenu.delete();
                this.table1.draw();
                this.licence1.draw();
                this.labLocker3.draw();
                this.lamp1.draw();
                this.chair1Room4.draw();
                this.router.draw();


                pictureTwo.delete();
                credits.delete();
                picture.delete();
                this.player.setMovementStart();



                break;

            case KeyboardEvent.KEY_Y:
                gameStart = true;

                creditsmenu.draw();

                pictureTwo.delete();
                options.delete();
                credits.delete();

                picture.delete();

                break;
            case KeyboardEvent.KEY_Q:
                pictureMenu.draw();
                pictureTwo.delete();
                creditsmenu.delete();


                picture.delete();


                break;
                    

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }




}
