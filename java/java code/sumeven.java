public class sumeven {
    public static void main(String args[]) {
      int [] arr={1,2,3,4,5,6};
      
      int sum_even=0;
      int sum_odd=0;
      
    //   for(int i=0;i<arr.length;i++){
    //       if(arr[i]%2==0){
    //         //   sum_even=sum_even+arr[i] 
    //           sum_even+=arr[i];
    //       }
    //   }
      
    //   for(int i=0;i<arr.length;i++){
    //       if(arr[i]%2!=0){
    //         //   sum_odd=sum_odd+arr[i] 
    //           sum_odd+=arr[i];
    //       }
    //   }
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            sum_even+=arr[i];
        }else if(arr[i]%2!=0){
            sum_odd+=arr[i];
        }
    }
      System.out.println(sum_even);
      System.out.println(sum_odd);
    }
}



//output
// 12
// 9