public class Solution {
    public int pow(int x, int n, int d) {
        if(x == 0) return 0;
        if(n==0) return 1;
        
        long y;
         if(n%2==0) 
        {
            y= pow(x,n/2,d);
            y= (y*y)%d;
        }
        else
        {
             y = x%d;
            y = (y * pow(x,n-1,d)%d )% d;
        }
        
        return (int)(y+d)%d;
    }
}
