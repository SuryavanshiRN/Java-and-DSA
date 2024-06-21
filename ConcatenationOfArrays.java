import java.util.Arrays;

public class ConcatenationOfArrays {
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        int [] ans = new int[2* nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(ans));


    }

}
