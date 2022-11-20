package classes;

/**
 *
 * @author ASUS
 */
public class Grille {
private int x;
private int y;
public Grille (int x,int y)
{
 this.x=x;
 this.y=y;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    
    public Boolean Controle_Instructions(String inst)
    {
    int i=0;
    while(i<inst.length())
    {
    if(inst.contains("A") || inst.contains("D") || inst.contains("G"))
    {    
        i++;
    }
    else
    {
    return false;
    }
    }
    return true;
    }
    public void setY(int y) {
        this.y = y;
    }

}
