//     PImage back;
//     PImage carLeft;
//     PImage carRight;
//     PImage frog;

//int x = 10; //frog's x position
//int y = 550; //frog's y position

//car car1 = new car(300,100,50,10);
//car car2 = new car(430,210,50,20);
//car car3 = new car(150,315,50,15);
//car car4 = new car(700,400,50,30);

//void setup(){
// size(800,600);
//            back = loadImage("froggerBackground.png");
//            carLeft = loadImage("carLeft.png");
//            carLeft.resize(160,100);
//            carRight = loadImage("carRight.png");
//            carRight.resize(160,100);
//            frog = loadImage("frog.png");
//            frog.resize(50,30);
            
//  smooth();
//  noStroke();
//}

//void draw(){
//  background(back);
          
//            //image (carRight,250, 210);
//            image (frog, x, y);
            
//  //ellipse(x,y, 30,30);
//  border();
//  car1.displayCarRight();
//  car2.display();
//  car3.displayCarRight();
//  car4.display();
  
//  car1.carLeft();
//  car2.carRight();
//  car3.carLeft();
//  car4.carRight();
  
//  car1.intersects(car1);
//  car2.intersects(car2);
//  car3.intersects(car3);
//  car4.intersects(car4);
//}


//void keyPressed()
//{
//      if(key == CODED){
//            if(keyCode == UP)
//            {
//              y= y-5;
//                  //Frog Y position goes up
//            }
//            else if(keyCode == DOWN)
//            {
//              y+=5;
//                  //Frog Y position goes down
//            }
//            else if(keyCode == RIGHT)
//            {
//              x+=5;
//                  //Frog X position goes right
//            }
//            else if(keyCode == LEFT)
//            {
//              x-=5;
//                  //Frog X position goes left
//            }
//      }
//}

//boolean border(){
//  if (x > 800){
//  x=x-20;
//  return true;
//  } else if(y > 600){
//  y=y-20;
//    return true;
//  }else if(x< 0){
//   x=x+20;
//    return true;
//  }else if(y < 0) {
//   y=y+20;
//  return true;
//  }else{
//  return false;
//  }
//}


//class car{
//int carX;
//int carY;
//int carSize;
//int carSpeed;

//public car(int carX,int carY,int carSize,int carSpeed){
//  this.carX = carX;
//  this.carY = carY;
//  this.carSize = carSize;
//  this.carSpeed = carSpeed;
//}
//void carLeft(){
//carSpeed = carX-=10;
//if (carX < 0){
//carX = 800;
//}
//}
//void carRight(){
// carSpeed = carX+=10;
// if (carX > 800){
// carX=0;
// }
//}

//int getX(){
// return carX; 
//}

//int getY(){
//return carY;
//}

//int getSize(){
// return carSize; 
//}

//boolean intersects(car car) {
//      if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
//      {
//        x = 10;
//        y = 550;
//             return true;
//      }
//      else
//      {
//             return false;
//      }
//}

//  void display(){
//       image (carLeft,carX,carY);

//}
//void displayCarRight(){
// image (carRight,carX, carY); 
//}

////http://level1.jointheleague.org/Mod3Recipes/Frogger.html
//}