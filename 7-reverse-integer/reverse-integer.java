class Solution {
    public int reverse(int x) {
        int sum=0;
        int n=x;
        if(x<0)
        {
            x=-1*x;
        }
        while(x!=0)
        {
            if(sum > Integer.MAX_VALUE / 10 ||
              (sum == Integer.MAX_VALUE / 10 && x%10 > 7))
                return 0;

            if(sum < Integer.MIN_VALUE / 10 ||
              (sum == Integer.MIN_VALUE / 10 && x%10 < -8))
                return 0;
                
            sum=sum*10+x%10;
            x=x/10;
        }
        if(n<0)
        {
            sum=-1*sum;
        }
        return sum;
    }
}