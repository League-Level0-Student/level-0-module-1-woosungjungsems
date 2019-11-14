
void setup() {
    size(900,900);
    fill(#EA8D13);
    ellipse(450, 450, 900, 900);
    fill(#DE2B2B);
    ellipse(450,450,800,800);
    fill(#FAF567);
    ellipse(450,450,720,720);
    PImage pepperoni = loadImage("peperoni.png");
    pepperoni.resize(800,800);
    image(pepperoni, 60, 60);
}
void draw() {
    
}
