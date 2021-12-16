package SimulationModel;

import Shapes.Point;
import Shapes.Shape;



public class Cell {
  private int x;
  private int y;
  private boolean alive;

  public Cell(int x, int y, boolean alive) {
    this.x = x;
    this.y = y;
    this.alive = alive;
  }

  public Shape getShape() {
    return new Point(x, y);
  }

  public void update() {

  }

  public String toString() {
    return "Cell\nx:" + x + "\ny: " + y + "\n Alive: " + alive;
  }

  public boolean getAlive() {
    return alive;
  }
}
