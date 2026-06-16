public class singlesumarray {
    
        public static void main(String args[]) {
          int [] arr= {1,2,3,4,5,6};
        //   int [] arr2={4};
          
          int sum=0;
          int n= arr.length;
        //   int n2=arr2.length;
          
          for(int i=0;i<n;i++){
              for(int j=i+1;j<n;j++){
                  sum+=arr[i]+arr[j];
              }
          }
        
        // for(int i=0;i<n2;i++){
        //       for(int j=i+1;j<n2;j++){
        //           sum+=arr[i]+arr[j];
        //       }
        //   }
        
          
          System.out.println("Total pair sum is :" + " "+sum);
        }
    }
    

