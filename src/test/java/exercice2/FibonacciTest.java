package exercice2;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;

public class FibonacciTest {

    Fibonacci f;

    @Before
    public void setF(){
        f=new Fibonacci();
    }

    @Test
    public void testfib0() throws Exception{
        int n=0;
        int res=f.evaluate(n);
        int attendu=1;
        Assert.assertEquals(res,1);

    }

    @Test
    public void testfib1() throws Exception{
        int n=1;
        int res=f.evaluate(n);
        int attendu=1;
        Assert.assertEquals(res,1);

    }

    @Test
    public void testfib3() throws Exception{
        int n=2;
        int res=f.evaluate(n);
        int attendu=2;
        Assert.assertEquals(res,attendu);

    }

    @Test
    public void testfib4() throws Exception{
        int n=3;
        int res=f.evaluate(n);
        int attendu=3;
        Assert.assertEquals(res,attendu);

    }

   /* @Test(expected = InvalidNumberException.class)
    public void testfibMoins1() throws Exception{
        int n=-1;
        int res=f.evaluate(n);
    }

    @Test
    public void testfib100() throws Exception{
        int n=100;
        int res=f.evaluate(n);
        int attendu=200;
        Assert.assertEquals(res,attendu);
    }*/

    //Tests aux valeurs limites



    @Test(expected = InvalidNumberException.class)
    public void testfib46() throws Exception{
        int n=46;
        int res=f.evaluate(n);
    }

    @Test(expected = InvalidNumberException.class)
    public void testfib500() throws Exception{
        int n=500;
        int res=f.evaluate(n);
    }


}
