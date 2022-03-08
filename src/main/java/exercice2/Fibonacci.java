package exercice2;



import static java.lang.Integer.MAX_VALUE;


public class Fibonacci {

    public static int evaluate(int n) throws Exception{
        boolean calculOK = true;
        int res=0;
        if (n == 0)
            res=1;
        else {
            if (n == 1) {
                res=1;
            } else {
                if (2 <= n) {
                    int u0 = 1;
                    int u1 = 1;
                    res = u0 + u1;
                    int i = 3;
                    while ((i <= n) && calculOK) {
                        u0 = u1;
                        u1 = res;
                        if (u1 < (MAX_VALUE - u0)) {
                            res = u0 + u1;
                            i = i + 1;
                        } else
                            calculOK = false;
                    }
                    if (calculOK){ }
                    else
                        throw new InvalidNumberException(n);

                }
            }

        }
        return res;}

    public static void main(String args[]) throws Exception {

        int i=0;
        int u0=1;
        int u1=1;
        boolean calculOK=true;
        while (calculOK){
            u0=evaluate(i);
            u1=evaluate(i+1);
            //u0+u1<MAX_VALUE
            if ((u1)<MAX_VALUE-u0) //(u1<(MAX_VALUE-0)) le bon
                i=i+1;
            else
                calculOK=false;
        }
        System.out.println("Fib limite ="+(i+1));
        System.out.println((i+1)+" :"+evaluate(i+1));
        System.out.println((i+2)+" :"+evaluate(i+2));

    }
}

