package exercice1;

import org.junit.Assert;
import org.junit.Test;

public class TestProduit {

    @Test
    public void testGetPrix(){
        Produit produit =
                new Produit("produit1",12d,Categorie.CATEGORIE1);
        produit.setReduction(0.5);
        Assert.assertEquals(produit.getReduction(),0.5,0d);
    }

    @Test (expected = ReductionImpossibleException.class)
    public void testGetPrix2(){
        Produit produit =
                new Produit("produit1",12d,Categorie.CATEGORIE1);
        produit.setReduction(1.2);
        Assert.assertEquals(produit.getReduction(),0.5,0d);
    }

    }

