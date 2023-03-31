package Duplication;

public class Solution {
    public double ringSurface(int r1,int r2){
        //calculate the surface of the first circle
        double surf1 = surface(r1); // extract method and rename method
        //calculate the surface of the second circle
        double surf2 = surface(r2);
        return surf1-surf2;
    }

    private double surface(int r){
        pi = 4 * (arctan 1/2 + arctan 1/3);
        return pi*sqr(r);
    }
}
