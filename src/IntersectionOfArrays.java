/* CS 331
 * Due by Sept 17
 *By Caroline Resler
 */

/**
 *
 * @author Caroline
 */
import java.io.*;
import java.util.Random;
import java.util.HashSet;
import java.util.Arrays;
public class IntersectionOfArrays {

    
    public static void main(String[] args) {
        int [] Array1= new int [10];
        
        //Unsorted Array with Math.Random elements
        for(int i = 0; i < Array1.length; i++) {
            
        Array1[i] = (int)(Math.random()*20+1);
        
        //System.out.println("Array1: " + Array1[i]);
      
    }
        //Java SortArray1
        Arrays.sort(Array1);
        System.out.println("Java Sorted Array1: "+ Arrays.toString(Array1));
         
         
        
        
        int [] Array2= new int [10];
        
        //Unsorted Array with Math.Random elements
        for(int i = 0; i < Array2.length; i++) {
            
        Array2[i] = (int)(Math.random()*14+1);
        
        //System.out.println("Array2: " + Array2[i]);
      
    }
        //Java SortArray2
        Arrays.sort(Array2);
        System.out.println("Java Sorted Array2: "+ Arrays.toString(Array2));
         
         
        int a1 = Array1.length;
        int a2 = Array2.length;
        
        //comment out one or the other to get cpu time
        PrintIntersectionSorted(Array1,Array2,a1,a2);
        PrintIntersectionUnsorted(Array1, Array2, a1, a2);
        
    //finds cpu time    
    long startTimeinNano = 0;
    
    int runs = 10000; 
    
    for(int i = -10000;i < runs;i++) {
        
        if(i == 0) startTimeinNano = System.nanoTime();
    
        
    }
    
    long endTimeinNano = System.nanoTime() - startTimeinNano;
    
    // prints out time in ns
    System.out.println("Each took an average of " + endTimeinNano/runs + " ns");
    
        
        
    }
    
  
    static void PrintIntersectionSorted(int Array1[], int Array2[], int a1, int a2){
        
        // while loop to check if variables are less than the array’s length
        int i = 0;
        int j = 0;
        
        while(i < a1 && j< a2){
    
            // If else statement to check if any integers are less value than the other
                
            if (Array1 [i] < Array2 [j]){
                i++;
            }
            else if (Array2 [j] < Array1 [i]){
                j++;
            }
             // else statement that outputs intersecting integers then increment by one
            else{
                System.out.println("Intersection: " + Array2[j++]);
                i++; 

    }
    
    }
    }
    public static void PrintIntersectionUnsorted(int Array1[], int Array2[], int a1, int a2){

    //Create a hashset of integers 
    HashSet<Integer> hash = new HashSet<>();

    //for loop to add value into Hash

        for( int i =0; i < a1;i++){
            
        hash.add(Array1[i]);
        
        }

        //for loop and a if else loop to check if hash contains same value

        for (int i = 0; i < a2; i++){
            
	if (hash.contains(Array2[i])){
            
        System.out.println("HashSet: " + Array2[i]);
        
        }
        
        }      

        }
    
}