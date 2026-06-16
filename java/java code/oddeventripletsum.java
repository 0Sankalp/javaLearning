public class oddeventripletsum {
   
        public static void main(String args[]) {
          
       int [] arr={1,2,3,4,5,6,};
       
       int even_sum=0;
       int odd_sum=0;
       
       for(int i=0;i<arr.length-2;i++){
           for(int j=i+1;j<arr.length-1;j++){
               for(int k=j+1;k<arr.length;k++){
                   int sum= arr[i]+arr[j]+arr[k];
                   if(sum%2==0){
                       even_sum++;
                   }else{
                       odd_sum++;
                   }
               }
           }
       }
       
       System.out.println(even_sum);
       System.out.println(odd_sum);
         
        }
    }
    

