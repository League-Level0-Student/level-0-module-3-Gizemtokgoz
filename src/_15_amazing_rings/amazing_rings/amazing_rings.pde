int xValue = 300;
int yValue = 1000;

void setup() {
  size(1300, 600);
 
}

void draw() {
  int size = 495;
  xValue = xValue + 2;
  yValue = yValue - 2;
  
  background(#FFFFFF);
  for (int i = 0; i < 100; i++) {
    noFill();
    ellipse(xValue, 300, size, size);
    size=size-5;
  }


  int Size = 495;

  for (int i = 0; i < 100; i++) {
    noFill();
    ellipse(yValue, 300, Size, Size);
    Size=Size-5;
  }
}
