/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoanexinet;

/**
 *
 * @author peyot
 */
public class reto1 {
    //. Write a function that prints the next 20 leap years.
final static int CURRENT_YEAR=2021;
final static int NUMBER_OF_LEAPYEARS=20;
// Leap year definition in gregorian calendar
/*
Every year that is exactly divisible by four is a leap year, 
except for years that are exactly divisible by 100,
but these centurial years are leap years if they are exactly divisible by 400. 
For example, the years 1700, 1800, and 1900 are not leap years, but the years 1600 and 2000 are.
*/
public static void main(String [] args){
    System.out.println("The next 20 leap years from 2021 are:");
    for (int i=0;i<=NUMBER_OF_LEAPYEARS*4;i++){
        
    if( (CURRENT_YEAR+i)%4==0){
        if((CURRENT_YEAR+i)%100!=0){ //Catch exception in years that are 100 divisible.
            System.out.println(" "+ (CURRENT_YEAR+i) +",");
        }
    }
    
    }
    System.out.println("");
    
    }
}
