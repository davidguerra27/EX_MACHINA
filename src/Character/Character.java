package Character;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import  org.academiadecodigo.simplegraphics.pictures.Picture;



//SUPERCLASS WITH THE PROPERTIES OF EVERY CHARACTER
public class Character {
    //Players world position in the map
    public int worldX, worldY;
    //Number of cells the player will advance in each move
    public int speed;
    //Direction of the players movement
    public String direction;
    //Counter  for the players animation
    public int spriteCounter = 0;
    //2 sprites(images per direction
    public int spriteNum =1;
    //Players solid area for collision with other objects
    public Rectangle solidArea;
    //solid area inicial position
    public int solidAreaDefaultX , solidAreaDefaultY;
    //If player is hitting solid objects, iniciates as false, changes later
    public boolean collisionOn = false;

}
