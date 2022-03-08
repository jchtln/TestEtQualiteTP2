package exercice3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RechercheTableauTrieTest {


    RechercheTableauTrie rtt;

    @Before
    public void setRtt(){
        rtt=new RechercheTableauTrie();
    }

    @Test
    public void singletonNonOK(){
        int[] t={1};
        int x=0;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=false;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void singletonOK(){
        int[] t={0};
        int x=0;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=true;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void Moitie1(){
        int[] t={1,3};
        int x=2;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=false;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void Moitie2(){
        int[] t={2,3};
        int x=0;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=false;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void Moitie1OK(){
        int[] t={1,2,3};
        int x=1;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=true;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void Moitie1NonOK(){
        int[] t={1,3,5};
        int x=2;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=false;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void Moitie2OK(){
        int[] t={1,2,3};
        int x=3;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=true;
        Assert.assertEquals(res,attendu);
    }

    @Test
    public void Moitie2NonOK(){
        int[] t={1,2,5};
        int x=4;
        boolean res=rtt.rechercheDico(t,x);
        boolean attendu=false;
        Assert.assertEquals(res,attendu);
    }


    //pas rentrer dans le while
    // tab vide
    @Test
    public void TabVide(){
        int[] t={};
        int x=1;
        boolean res = rtt.rechercheDico(t,x);
        boolean attendu=false;
        Assert.assertEquals(res,attendu);
    }


}

