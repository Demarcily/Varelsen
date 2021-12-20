package Shapes;

/**
 * 2D point in screen coordinates
 * Created 2021-03-31
 *
 * @author Magnus Silverdal
 */
public class Point extends Shape{
  private int x;
  private int y;
  private int color;
  private int type;

  public Point(int x, int y, int color, int type) {
    this.x = x;
    this.y = y;
    this.color = color;
    this.type = type;
  }
  // Getters
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public int getColor() {
    return color;
  }

  //Setters
  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y;
  }
  public void setColor(int color) {
    this.color = color;
  }


}
