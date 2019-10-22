import java.math.BigInteger;
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {

        int cur1 = 0;
        int cur2 = 0;
        int res = 0;
        int delta;// = 0;

        for(int i=1;i<=n.intValue()+1;i++) {

            if (i==1){
                delta = 1;
                res += delta;
                cur1 = 0;
                cur2 = delta;
                continue;
            }

            delta = cur1 + cur2;
            res += delta;
            cur1 = cur2;
            cur2 = delta;
        }
        return BigInteger.valueOf(res*4);
    }
}