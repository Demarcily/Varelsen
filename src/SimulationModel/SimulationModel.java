package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;

import java.util.ArrayList;
import java.util.Random;

public class SimulationModel {
  private Scene scene;
  private Cell[] c;
  private Random random = new Random();
  private int i;
  private int j;
  public SimulationModel(int width, int height, int scale) {
    c = new Cell[(width/scale) * (height/scale)];
    i = 0;
    while (i < height/scale) {
      j = 0;
      while(j < width/scale) {
        c[i*(height/scale) + j] = new Cell(j, i, random.nextBoolean());
        System.out.println(c[i*(height/scale) + j]);
        j++;
      }
      i++;
    }
    System.out.println(c[50].getAlive());
  }

  public void update() {
    i = 0;
    while (i < c.length) {
      c[i].update();
      i++;
    }
  }

  public ArrayList<Shape> getShapes() {
    i = 0;
    ArrayList<Shape> shapes = new ArrayList<>();
    while (i < c.length) {
      if (c[i].getAlive()) {
        shapes.add(c[i].getShape());
      }
        i++;

    }
    return shapes;
  }
}
