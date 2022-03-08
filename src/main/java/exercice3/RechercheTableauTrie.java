package exercice3;

public class RechercheTableauTrie {
    public boolean rechercheDico(int t[], int x) {

        int min;         //A         t: {},  x
        int max;         //A
        int milieu;      //A

        min = 0;        //A
        max = t.length - 1;//A

        while (min < max) {   //B                t:{1},  2
            milieu = (min + max) / 2;     //C    t:{1,2,3}, 3
            if (x > t[milieu]) {          //D    t:{1,2,3},  1
                min = milieu + 1;         //E
            } else {
                max = milieu;              //F
            }
        }

        boolean trouve;
        if (t[min] == x) {                 //G
            trouve = true;
        } else {                   //H
            trouve = false;
        }
        return trouve;
    }

}
