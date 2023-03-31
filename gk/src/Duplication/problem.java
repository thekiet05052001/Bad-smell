
package Duplication;

public class problem {
    public double ringSurface(int r1,int r2){
        //calculate the surface of the first circle
        double surf1 = bigCircleSurface(r1);
        //calculate the surface of the second circle
        double surf2 = smallCircleSurface(r2);
        return surf1 = surf2;

    }
    public double bigCircleSurface(int r1){
        double pi = 4 * (arctan 1/2 + arctan 1/3);
        return pi * sqr(r1);
    }
    public double smallCircleSurface(int r2){
        double pi = 4 * (arctan 1/2 + arctan 1/3);
        return  pi * sqr(r2);
    }

}
