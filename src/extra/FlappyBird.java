package extra;

public class FlappyBird {


/*
 int x = 100;
int y = 100;
int pipeX = 200;
int gravity = 1;
int birdVeolocity = 30;
int upperPipeHeight = 150; 
int lowerPipeHeight = 150;
int lowerPipeTop = 300;
int score = 0;
  PImage back;
  
    //PImage pipeBottom;
    // PImage pipeTop;
     PImage bird;
     
void setup(){
size(500,500);
smooth();
noStroke();
 back = loadImage("background.jpeg");
           // pipeBottom = loadImage("bottomPipe.png");
            //pipeTop = loadImage("topPipe.png");
            bird = loadImage("flappyBirdIconACTUAL.png");
            bird.resize(50,50);
}

void draw(){
background(#099B86);
fill(#FFF703);
stroke(#F0072A);
//ellipse(100, y, 30, 30);

 background(back);
        //    image (pipeBottom,250,375);
        //    image (pipeTop,250,-130);
            image (bird, x, y);

y = y+ gravity;
 fill(#3BDE10);
rect(pipeX, 0, 20, upperPipeHeight);
pipeX--;
fill(#3BDE10);
rect(pipeX, lowerPipeTop, 20, lowerPipeHeight);
fill(#3BDE10);
rect(0, 450, 500, 50);
teleportPipes();
intersectsPipes();
intersectsGround();
}
void mousePressed(){
 y = y - birdVeolocity; 
 
}
void teleportPipes(){
  if (pipeX == 0){
    pipeX = 500;
    upperPipeHeight = (int) random(100,225); 
    lowerPipeHeight = (int) random(100,250);
    score++;
  }
}
boolean intersectsPipes() {
     if ( y < upperPipeHeight && x > pipeX && x < (pipeX+20)){
       background(#0C0D0C);
       text("You lost and your score is " + score, 20,10);
       noLoop();
          return true; }
     else if (y>lowerPipeTop && x > pipeX && x < (pipeX+20)) {
       background(#0C0D0C);
       text("You lost and your score is " + score, 20,10);
       noLoop();
        return true; }
     else { 
 
   return false;}
} 
boolean intersectsGround(){
  if (y > 434){
  background(#0C0D0C);
  text("You lost and your score is " + score, 20,10);
  noLoop();
  //text(text, xPosition, yPosition); add score
  //http://level1.jointheleague.org/Mod3Recipes/FlappyBird.html
  return true; }
  else { 
  return false;}
}
  */

}
