public class SumExists {
    boolean checkSum(int []arr,int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x)
                    return true;
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SumExists m=new SumExists();
        int []arr=new int []{1, -2, 1, 0, 5};
        System.out.println(m.checkSum(arr, 0));
    }
}
