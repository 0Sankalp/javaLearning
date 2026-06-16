public class MyClass {
    public static void main(String args[]) {
      int [] arr= {1,2,3,4,5,6};
      int even_ind_sum=0;
      int odd_ind_sum=0;
      
       for(int i=0;i<arr.length;i++){
           if(i%2==0){
               even_ind_sum+=arr[i];
          }
       }
      
       for(int i=0;i<arr.length;i++){
           if(i%2!=0){
               odd_ind_sum+=arr[i];
           }
       }
    
    //for(int i=0;i<arr.length;i++){
      //  if(i%2==0){
        //    even_ind_sum+=arr[i];
        //}else{
          //  odd_ind_sum+=arr[i];
        //}
   // }
     // System.out.print(even_ind_sum+" "+odd_ind_sum);
      System.out.println(odd_ind_sum);
    
    //  define an array of size 2
    // int [] ans=new int[2];
    // ans[0]=even_ind_sum;
    // ans[1]=odd_ind_sum;
     
    //  for(int i=0;i<ans.length;i++){
    //      System.out.println(ans[i]);
    //  }
    }
}