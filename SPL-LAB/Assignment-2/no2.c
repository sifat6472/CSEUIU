#include <stdio.h>
#include <math.h>

int n1, n2;

typedef struct{
    int cords[10];
}Point;

double measureDistance(Point p1, Point p2);

int main(){
    Point p1;
    Point p2;

    printf("Enter the value of N for Point1: ");
    scanf("%d", &n1);

    printf("Enter the %d dimension values for Point1 : ", n1);
    for (int i = 0; i < n1; i++){
        scanf("%d", &p1.cords[i]);
    }

    printf("\nEnter the value of N for Point2: ");
    scanf("%d", &n2);

    printf("Enter the %d dimension values for Point2 : ", n2);
    for (int i = 0; i < n2; i++){
        scanf("%d", &p2.cords[i]);
    }

    if (n1 == n2){
        printf("\nDistance between p1 & p2 : %lf", measureDistance(p1, p2));
    }
    else 
        printf("\nMismatched dimension ");
        
    return 0;
}

double measureDistance(Point p1, Point p2){

    int result = 0;

    for(int i = 0; i < n1; i++){
        result += ((p1.cords[i] - p2.cords[i])*(p1.cords[i] - p2.cords[i]));
    }
    return sqrt(result);
}