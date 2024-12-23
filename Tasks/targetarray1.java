import java.util.*;

public class targetarray1 {
    public static void main(String[] args) {
        
        List<Integer> target=new ArrayList<>();
        int[] nums=new int[]{0,1,2,3,4};
        int [] index=new int[]{0,1,2,2,1};
        
        for(int i=0;i<index.length;i++){
            target.add(index[i],nums[i]);
        }
    }
}