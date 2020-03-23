import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=n;
        int res=0;
        int d=count;
        if(count%2==0){
            //从去1位到去count/2位
            while(count!=d/2-1){
                res=res+count*(count-1);
                count--;
            }
            res=(res*2)%1000000007;
        }else{
            //从去1位到去count/2+1位，在加上一办
            while(count!=d/2+1){
                res=res+count*(count-1);
                count--;
            }
            int z=res;
            res=res+count*(count-1);
            res=(res+z)%1000000007;
        }
        System.out.println(res);
    }
}
