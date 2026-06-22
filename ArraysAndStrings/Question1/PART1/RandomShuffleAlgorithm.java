import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class RandomShuffleAlgorithm{

    static void randomize(int[] arr,int n){
        Random r=new Random();
        for(int i=n-1;i>0;i--){
            int j=r.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
   System.out.println(Arrays.toString(arr));
    }
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int len=nums.length;
        randomize(nums,len);
    }
}