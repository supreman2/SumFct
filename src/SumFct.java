import java.math.BigInteger;
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {

        BigInteger cur1 = BigInteger.valueOf(0);
        BigInteger cur2 = BigInteger.valueOf(0);
        BigInteger res = BigInteger.valueOf(0);
        BigInteger delta;// = 0;

        for(int i=1;i<=n.intValue()+1;i++) {
            if (i==1){
                delta = BigInteger.valueOf(1);
                res = res.add(delta);
                cur1 = BigInteger.valueOf(0);
                cur2 = delta;
                continue;
            }

            delta = cur1.add(cur2);
            res = res.add(delta);
            cur1 = cur2;
            cur2 = delta;
        }
        return res.multiply(BigInteger.valueOf(4));
    }
}