package exercice1;

public class Produit {

    String libelle;
    double prix;
    double reduction=0;
    Categorie categorie;

    public Produit(String libelle, double prix, Categorie categorie) {
        this.libelle = libelle;
        this.prix = prix;
        this.categorie = categorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        if (reduction>1 || reduction<0){
            throw new ReductionImpossibleException();
        }
        this.reduction=reduction;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    double getPrix(){

        return this.prix = this.reduction*this.prix;
    }
}
