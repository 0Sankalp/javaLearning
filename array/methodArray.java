package array;

public class methodArraj {
    //Java Program to demonstrate the way of passing an array  
//to method.  

    //creating a method which receives an array as a parameter  
    static void min(int arr[]){  
    int min=arr[0];  
    for(int i=1;i<arr.length;i++)  
     if(min>arr[i])  
      min=arr[i];  
      
    System.out.println(min);  
    }  
      
    public static void main(String args[]){  
    int a[]={33,3,4,5};//declaring and initializing an array  
    min(a);//passing array to method  
    }}  

