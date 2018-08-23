int a;
float size=20;
void setup(){
  size(600,600);
  background(100,0,200);
}




void draw(){
  makeMagical();
  for(int i=0; i<300;i++){
   float red=random(255);
   float green=random(255);
   float blue=random(255);
   int g=i*2;
   
     
    fill(100,0,200);
    
    
if(mousePressed==true){
  size+=.0005;
    
  }  
  if(mousePressed==true&&mouseButton==RIGHT){
  size-=.001;
    
  }
  stroke(0,255,0);
  ellipse(getWormX(i),getWormY(i),size,size);
}
  
  
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  noStroke();
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}