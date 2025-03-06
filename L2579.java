class Solution {
    public long coloredCells(int n) {
        return (long)n*n+(long)(n-1)*(n-1);
    }
}
or this solution but the upper one is more optimized
  class Solution {
    public long coloredCells(int n) {
        if(n==1)
         return 1;
        long sum=0;
        sum+=4*(n-1)+coloredCells(n-1);
        return sum;
    }
}
