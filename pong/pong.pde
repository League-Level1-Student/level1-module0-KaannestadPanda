import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int randomNumber = (int) random(600);
int newRandomNumber = (int) random(100);
int ballX=randomNumber;
int ballSpeed=3;
int verticalBallSpeed=4;
int ballY=newRandomNumber;
int horizontalDecider = (int) random(100);
int verticalDecider = (int) random(100);
void setup(){
  backgroundImage=loadImage("background.jpeg");
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
  size(600, 400);
background(200, 200, 200);
if(horizontalDecider%2==0){
 ballSpeed=ballSpeed*-1; 
}
else{
  
}
if(verticalDecider%2==0){
 verticalBallSpeed=verticalBallSpeed*-1; 
}
else{
  
}
}




void draw(){
  background(200, 200, 200);
  image(backgroundImage,0,0);
  image(backgroundImage,0,0,width,height);
  
  fill(0,255,0);
stroke(255,0,0);
ellipse(ballX, ballY, 40, 40);
ballX+=ballSpeed;
ballY+=verticalBallSpeed;

if(ballX>600||ballX<0){
 ballSpeed=ballSpeed*-1; 
}
  if(ballY>400||ballY<0){
 verticalBallSpeed=verticalBallSpeed*-1; 
}
if(ballY>400){
 sound.trigger(); 
}
fill(200,200,200);
rect(mouseX,380,50,20);






}


boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}