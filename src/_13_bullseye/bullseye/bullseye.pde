void setup(){
  size(800,800);
 background(#F0E6E6);
    }

void draw(){
  fill(#FC6969);
  ellipse(400,400,300,300);
  int size = 275;
 
  for (int i = 0; i < 12; i++) {
    if (i%2 == 0){
    fill(#403B3B); 
    }
    else {
    fill (#FC6969);
    }
    ellipse(400,400,size,size);
    size=size-25;
  }
    }
                     
