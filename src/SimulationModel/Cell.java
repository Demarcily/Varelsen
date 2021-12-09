package SimulationModel;

import Shapes.Point;
import Shapes.Shape;

import java.util.Random;

public class Cell {
  private int x;
  private int y;
  private Random random = new Random();
  private boolean alive;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
    alive = random.nextBoolean();
  }

  public Shape getShape() {
    return new Point(x, y);
  }

  public void update() {

  }

  public String toString() {
    return "Cell: " + y + "" + x + "\nx: " + x + "\ny: " + y;
  }

  public boolean getAlive() {
    return alive;
  }
}
