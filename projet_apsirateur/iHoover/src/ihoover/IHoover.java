package ihoover;

import classes.Aspirateur;
import classes.Grille;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class IHoover {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        
        System.out.print("Veuillez donner la dimension de la grille :\n");
        System.out.print("Valeur de x :\n");
        int x=input.nextInt();
        System.out.print("Valeur de y :\n");
        int y=input.nextInt();
        Grille G=new Grille(x,y);
        
        Aspirateur A =new Aspirateur();
        System.out.print("Veuillez donner la position initiale de l'aspirateur :\n");
        System.out.print("Valeur de x :\n");
        int xi=input.nextInt();
        if(xi<=x)
        {
        System.out.print("Valeur de y :\n");
        int yi=input.nextInt();
        if(yi<=y)
        {
        System.out.print("l'orientation(N,E,S,W) :\n");
        String o=input.next().toUpperCase();
        if(A.Controle_Orientation(o))
        {
        A.setX(xi);
        A.setY(yi);
        System.out.print("Les instructions (D:Droite,G:Gauche,A:avance):\n");
        String instructions=input.next().toUpperCase();
        if(G.Controle_Instructions(instructions))
        {
        A.Mouvement(instructions);
        if(A.getX()<=G.getX() && A.getY()<=G.getY()){
        System.out.println("x="+A.getX()+"   y="+A.getY()+"   orientation="+A.getOrientation());
        }
        else{
        System.out.println("L'aspirateur a depasse la grille !!");
        }
        }
        else
        {
        System.out.println("Vous devez choisir ces caracteres uniquement(D,G,A)");
        }
        }
        else
        {
        System.out.println("Vous avez choisi une mauvaise orientation!!!");
        }
        }
        else
        {
        System.out.println("Vous avez choisi une mauvaise orientation!!!");
        }
        }
        else
        {
        System.out.print("Valeur de la position initiale depasse la grille :\n");
        }
  }
    
}
