int Rx = 295;
int Ry = 291;
int Lx = 204;
int Ly = 293;
PImage cat;
void setup() {
  size(800,600);
  cat = loadImage("cat.jpg");
  cat.resize(800,600);
  background(cat);

}
void draw() {
  fill(#FF0000);
  noStroke();
  ellipse(Rx, Ry, 30, 30);
  ellipse(Lx, Ly, 30, 30);

}
