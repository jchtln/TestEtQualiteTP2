package exercice1;

import org.junit.Assert;
import org.junit.Test;

public class TestMagasin {

    private Magasin magasin;

@Test
    public  void testSolde(){
    magasin = new Magasin();
    magasin.ajouterProduit(new Produit("p1",1,Categorie.CATEGORIE1),
            new Produit("p2",2,Categorie.CATEGORIE2));

    magasin.solder();

//    magasin.getStock()
//            .stream
//            .filter( p -> p.getCategorie()==Categorie.CATEGORIE1)
//            .forEach(p -> Assert.assertTrue(p.getReduction()==0.2));
}
}
