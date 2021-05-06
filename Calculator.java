//naming convetion:packge name starts with lower letter
package mypack;
//import java.lang.System;
public class Calculator
{
 //add constructor AND methods,which should accessible to other classes also.
 //add,subtract,multilpy,div,sqr
 int i,j;
 public Calculator()
 {
	i=1;
    j=1;
 }	
 //method overloading:within a class you can define methods
// with same name and different parameter or different signature
 public int add(int i,int j)
 {
    return i+j;
 }
 public double add(double i,double j)
 {
	 return i+j;
 }
 public int add()
 {
	 return i+j;
 }
 public int subtract(int i, int j)
 {
   return i-j;
  }
}
