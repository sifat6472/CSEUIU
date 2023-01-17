#include <stdio.h>
#include <limits.h>


// function to get the result for submatrix
int get_result(int n, int m, int tl_x, int tl_y, int br_x, int br_y, int arr[n][m]){
	// check if the user input is valid
	if(tl_x<0 || tl_x>=n || tl_y<0 || tl_y>=m || br_x<0 || br_x>=n || br_y<0 || br_y>=m || br_x<tl_x || br_y<tl_y){
		printf("Error: Inappropriate user input\n-2147483648\n");
		return INT_MIN;
	}
	int sum=0;
	for(int i=tl_x;i<=br_x;i++){
		for(int j=tl_y;j<=br_y;j++){
			sum+=arr[i][j];
		}
	}
	return sum;
}

int main(){
	int n,m;
	scanf("%d %d",&n,&m);
	int arr[n][m];
	// input matrix
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			scanf("%d",&arr[i][j]);
		}
	}

	int tl_x,tl_y,br_x,br_y;
	while(1){
		scanf("%d %d %d %d",&tl_x,&tl_y,&br_x,&br_y);
		int result=get_result(n,m,tl_x,tl_y,br_x,br_y,arr);
		if(result!=INT_MIN){
			printf("%d\n",result);
		}
	}
	return 0;
}
