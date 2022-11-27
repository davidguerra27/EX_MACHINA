package MenuAndButtons;

public enum ButtonType {
    //get the coordinates of the button templates
    PLAY(10,10,10 ,10 ),
    INSTRUCTIONS(1,1,1,1),
    CREDITS(1, 10,1 ,1 ),
    BACK(1,1 , 1, 1);

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    ButtonType(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }
}

