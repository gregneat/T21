package pkg;
public class MichaelMCarP1 extends Car {
    
    //private int initX = -1, initY = -1;
    Rectangle mainBody = new Rectangle(0, 0, 240, 50); 
    Rectangle boundingBox = new Rectangle(0, 0, 240, 100 /*TODO*/);

    private int[] xTop = new int[4];
    private int[] yTop = new int[4];
    private Polygon top;

    private Ellipse backWheel;
    private Ellipse frontWheel;

    private int[] xFrontLight = new int[3];
    private int[] yFrontLight = new int[3];
    private Polygon frontLight;

    private int[] xBackLight = new int[3];
    private int[] yBackLight = new int[3];
    private Polygon backLight;
   
    private Line centerPillar;

    private Line doorLine;

    public MichaelMCarP1(int initX, int initY) {
        mainBody = new Rectangle(initX, initY, 240, 50); 
        boundingBox = new Rectangle(initX, initY - 35, 240, 97);

        xTop[0] = initX + 20;
        xTop[1] = initX + 90;
        xTop[2] = initX + 125;
        xTop[3] = initX + 170;

        yTop[0] = initY;
        yTop[1] = initY - 35;
        yTop[2] = initY - 35;
        yTop[3] = initY;

        top = new Polygon(xTop, yTop, 4);
        backWheel = new Ellipse(initX + 20, initY + 17, 45, 45);
        frontWheel = new Ellipse(initX + 170, initY + 17, 45, 45);

        xFrontLight[0] = initX + 210;
        xFrontLight[1] = initX + 240;
        xFrontLight[2] = initX + 240;

        yFrontLight[0] = initY + 7;
        yFrontLight[1] = initY + 10;
        yFrontLight[2] = initY + 17;

        frontLight = new Polygon(xFrontLight, yFrontLight, 3);
        frontLight.setColor(new Color(192, 192, 192));

        xBackLight[0] = initX;
        xBackLight[1] = initX;
        xBackLight[2] = initX + 30;

        yBackLight[0] = initY + 17;
        yBackLight[1] = initY + 10;
        yBackLight[2] = initY + 7;

        backLight = new Polygon(xBackLight, yBackLight, 3); 
        backLight.setColor(new Color(255, 0, 0));

        centerPillar = new Line(initX + 100, initY - 35, initX + 115, initY + 50);
        doorLine = new Line(initX + 170, initY, initX + 170, initY + 50);
    }

    public void fill() {
        mainBody.draw();
        top.draw();
        backWheel.fill();
        frontWheel.fill();
        frontLight.fill();
        backLight.fill();
        centerPillar.draw();
        doorLine.draw();
        mainBody.draw();
    }

    public void draw() {
        mainBody.draw();
        top.draw();
        backWheel.draw();
        frontWheel.draw();
        frontLight.draw();
        backLight.draw();
        centerPillar.draw();
        doorLine.draw();
        mainBody.draw();
        boundingBox.draw();
    }

    public void translate(double x, double y) {
        mainBody.translate(x, y);
        boundingBox.translate(x, y);
        top.translate(x, y);
        backWheel.translate(x, y);
        frontWheel.translate(x, y);
        frontLight.translate(x, y);
        backLight.translate(x, y);
        centerPillar.translate(x, y);
        doorLine.translate(x, y);
    }
    public Rectangle getBoundBox() {
        return boundingBox;
    }

    public double getX() {
        return boundingBox.getX();
    }

    public double getY() {
        return boundingBox.getY();
    }

    public double getHeight() {
        //TODO
        return 57;
    }

    public double getWidth() {
        return 240;
    }
}