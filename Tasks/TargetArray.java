public class TargetArray {
    static int n=5;
    public static void main(String[] args) {
        int temp=0;
        int[] nums=new int[]{0,1,2,3,4};
        int [] index=new int[]{0,1,2,2,1};
        int [] target=new int[nums.length];
        for (int i=0;i<index.length;i++){
            if(target[index[i]]==0){  
            target[index[i]]=nums[i];
            }
            else{
                temp=target[index[i]];
                target[index[i]]=nums[i];
                target[i]=temp;
            }
        }
        for (int i=0;i<n;i++){
           System.out.println(target[i]+" ");
        }
    }
}
