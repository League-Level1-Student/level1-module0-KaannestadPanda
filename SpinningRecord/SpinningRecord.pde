import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;
int rotated=1;
void setup(){
  size(600,600);
  pictureOfRecord= loadImage("goodrecord.jpg");
  pictureOfRecord.resize(600,600);
  minim = new Minim(this);
  song = minim.loadFile("sawing-wood-daniel_simon.wav",512);
}

void draw(){
  
  if(mousePressed){
  rotateImage(pictureOfRecord, rotated);
  image(pictureOfRecord,0, 0);
rotated-=3;
song.play();
song.pause();
  }
}


void rotateImage(PImage image, int amountToRotate){
 translate(width/2,height/2); 
rotate(amountToRotate*TWO_PI/360);
 translate(-image.width/2, -image.height/2);
}