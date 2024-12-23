class Solution {
    public int minPartitions(String n) {
        int largest=0;
        for(int i=0;i<n.length();i++){
            largest=Math.max(largest,n.charAt(i));
            System.out.println(n.charAt(i));
        }
        return largest;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.minPartitions("32"));
    }
}