package Livraison;

public class Delivery {

    private int poids;
    private int distance;

    public void delivery(int poids,int distance){
        this.distance = distance;
        this.poids = poids;
    }

    public double getPrixLivraison(){
        double prix = 0;

        if(poids < 10){
            prix = 10;
        } else if (poids > 10 && poids < 25) {
            prix = 12;
        } else {
            prix = 15;
        }

        if(distance < 50){
            return prix;
        } else {
            int distSup = distance - 50;
            double prixSup = distSup * 0.5;
            prix += prixSup;
            return prix;
        }
    }

}
