#include <stdio.h>
#include <math.h>

typedef struct point {
    int x_coord;
    int y_coord;
} Point;

typedef struct circle {
    float radius;
    Point center;
} Circle;

float measureDistance(Point p1, Point p2) {
  return sqrt(pow(p2.x_coord - p1.x_coord, 2) + pow(p2.y_coord - p1.y_coord, 2));
}

void move(Point *p, int dirX, int dirY) {
  p->x_coord = dirX;
  p->y_coord = dirY;
}

int isInsideCircle(Circle c, Point p) {
  float distance = measureDistance(c.center, p);
  if (distance <= c.radius)
    return 1;
  return 0;
}

int main(void) {
    
    Point p1, p2;
    Circle c;
    float distance;
    int isInCircle;
    int dirX,dirY;

    printf("Enter the coordinate of 1st Point: ");
    scanf("%d %d", &p1.x_coord, &p1.y_coord);
    
    printf("\nEnter the coordinate of 2nd Point: ");
    scanf("%d %d", &p2.x_coord, &p2.y_coord);
    
    printf("\nEnter Circle radius: ");
    scanf("%f", &c.radius);

    c.center = p2;

    distance = measureDistance(p1, p2);
    
    printf("\nPoint(x = %d, y = %d)\nPoint(x = %d, y = %d)\nCircle (radius = %f, Point(x = %d, y = %d))\n",
          p1.x_coord, p1.y_coord, p2.x_coord, p2.y_coord, c.radius, c.center.x_coord,
          c.center.y_coord);
    
    printf("\nDistance between p1 and p2 is : %f\n", distance);

    printf("Enter the x & y cords to move the p1 : ");
    
    scanf("%d %d",&dirX,&dirY);

    move(&p1,dirX,dirY);
    
    printf("\nAfter moving p1:Point(x = %d, y = %d)\n", p1.x_coord, p1.y_coord);

    isInCircle = isInsideCircle(c, p1);
    if (isInCircle == 1)
      printf("\nIs p1 inside circle C? Yes\n");
    else
      printf("Is p1 inside circle C? No\n");

    return 0;
}