/*

The Fibonacci series is a sequence of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1. 
The sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. Mathematically, it is defined by the recurrence relation:

F(n)=F(n−1)+F(n−2)

with initial conditions:
F(0) = 0;
f(1) = 1;

then it means :

F(2) = F(1) + F(0)
     = 1 + 0
     = 1 

So, each term in the Fibonacci sequence is the sum of the two preceding terms.
The sequence was introduced to the West by the Italian mathematician Leonardo of Pisa, who is also known as Fibonacci, in his book Liber Abaci, published in 1202.
The Fibonacci sequence has many interesting properties and is often found in nature, art, and various fields of mathematics and computer science.

*/


#include<bits/stdc++.h>

using namespace std;

int Fib(int n){

    if(n == 0 || n == 1)
        return n;
    else{
        int friend_ = Fib(n-1) + Fib(n-2);
        return friend_;
    }    
}

int main() {
    
    int num;
    cin>>num;
    
    cout << Fib(num);

    return 0;
}