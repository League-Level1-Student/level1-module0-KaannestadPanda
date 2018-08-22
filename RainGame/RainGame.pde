int why=0;
int randomNumber = (int) random(width);
int score=0;
void setup(){
  size(400,600);
  
}


void draw(){
  background(100,0,155);
  
  fill(0, 0, 255);
stroke(0, 0, 255);
ellipse(randomNumber, why, 20, 40);
why+=10;

fill(0,255,0);
rect(0,550,400,50);
fill(100,100,100);
rect(mouseX,550,40,50);
if(why>555){
  why=0;
   
   checkCatch(randomNumber);
   randomNumber = (int) random(width);
}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}


void checkCatch(int x){
     if (x > mouseX && x < mouseX+40)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }