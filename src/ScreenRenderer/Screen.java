package ScreenRenderer;

import Shapes.Circle;
import Shapes.Line;
import Shapes.Point;
import Shapes.Rectangle;

public class Screen {
  private int[] pixels;
  private int width;
  private int height;

  public Screen(int[] pixels, int width, int height) {
    this.width = width;
    this.height = height;
    this.pixels = pixels;
  }

  public void draw(int x, int y , int color) {
    pixels[y*width+x] = color;
  }

  public void draw(Point p, int color) {
    draw(p.getX(), p.getY(), color);
  }

  public void clear() {
    for (int i = 0 ; i < pixels.length; i++) {
      pixels[i] = 0x0;
    }
  }
}

