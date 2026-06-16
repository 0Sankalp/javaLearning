public class sumreverse {
    
        public static void main(String args[]) {
          int s=21;
          int e= 25;
          int sum=0;
          for(int i=s;i<=e;i++){
              int rev=0;
              int num=i;
              while(num>0){
                  int rem=num%10;
                  rev= rev*10+rem;
                  num=num/10;
              }
              sum+=rev;
          }
          System.out.println(sum);
        }
    }
    

