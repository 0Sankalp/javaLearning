public class targetelement {
   
        public static void main(String args[]) {
         int [] arr= {3,4,5,6,7,8,8,10};
         int target=8;
         int first_ind=-1;
         int last_ind=-1;
         
        //   first_ind
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                first_ind=i;
                break;
            }
        }
        
        //  last_ind
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                last_ind=i;
                break;
            }
        }
        System.out.print(first_ind+" "+last_ind);
        }
    }
    

