package exercice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static exercice1.Categorie.CATEGORIE1;

public class Magasin {

   private  Collection<Produit> stock;

    public Magasin(){
        stock = new ArrayList<>();
    }

   public void ajouterProduit(Produit... produits){
           this.stock.addAll(Arrays.asList(produits));
       }

    public void solder() throws ReductionImpossibleException {

       this.stock.stream().forEach( p -> {
           switch ( (p.getCategorie()) ){
               case CATEGORIE1:
               {
                   p.setReduction(0.2);
               }
               break;
               case CATEGORIE2:
               {
                   p.setReduction(0.5);
               }
               break;
               case CATEGORIE3:
               {
                   p.setReduction(0.7);
               }
               break;

           }
       });


    }
}