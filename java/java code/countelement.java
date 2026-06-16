import java.util.Arrays;
public class countelement {
    
    public static void main(String args[]) {
        int [] arr ={2,3,5,3,6,2,7};
        int n= arr.length;
        boolean [] vis= new boolean[101];
        Arrays.fill(vis,false);
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[arr[i]]==false){
                count++;
                vis[arr[i]]=true;
            }
        }
        System.out.println(count);
      }
}

