public class maxpairarray {
  
        public static void main(String args[]) {
         int [] arr1= {1,2,3,4};
         int [] arr2 ={4,5,6,7};
         
         int n=arr1.length;
         int m=arr2.length;
         int mx_sum=0;
         
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 int sum=arr1[i]+arr2[j];
                  mx_sum=Math.max(mx_sum,sum);
                //if(sum>mx_sum){
                 //   mx_sum=sum;
               // }
             }
         }
         
         System.out.println(mx_sum);
         
        }
    }
    

