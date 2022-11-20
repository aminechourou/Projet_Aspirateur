package classes;

/**
 *
 * @author ASUS
 */
public class Aspirateur {
private int x;
private int y;
private Orientation orientation;

public Aspirateur ()
{
}

public Aspirateur (int x,int y,Orientation orientation)
{
 this.x=x;
 this.y=y;
 this.orientation=orientation;
}

public Boolean Controle_Orientation(String n)
{
  if(Orientation.E.toString().equals(n))
  {
   this.orientation=Orientation.E;
   return true;
  }
  else if(Orientation.N.toString().equals(n))
  {
   this.orientation=Orientation.N;
   return true;  
  }
  else if(Orientation.S.toString().equals(n))
  {
  this.orientation=Orientation.S;
  return true;
  }
  else if(Orientation.W.toString().equals(n))
  {
      this.orientation=Orientation.W;
      return true;
  }
  return false;
}
public void Avance()
{
    switch (orientation) {
        case E:
            x++;
            break;
        case W:
            x--;
            break;
        case N:
            y++;
            break;
        case S:
            y--;
            break;
        default :
            break;
    }
 
}
public void Mouvement(String instructions)
{
for(int i=0;i<instructions.length();i++)
{
if(instructions.charAt(i)=='A')
{
Avance();
}
else if(instructions.charAt(i)=='D')
{
Droite();
}
else if(instructions.charAt(i)=='G')
{
Gauche();
}
}
}
public void Droite()
{
    switch (orientation) {
        case E :
            orientation=Orientation.S;
            break;
        case W :
            orientation=Orientation.N;
            break;
        case N :
            orientation=Orientation.E;
            break;
        case S :
            orientation=Orientation.W;
            break;
        default :
            break;
        
    }
}

public void Gauche()
{
    switch (orientation) {
        case E :
            orientation=Orientation.N;
            break;
        case W :
            orientation=Orientation.S;
            break;
        case N :
            orientation=Orientation.W;
            break;
        case S :
            orientation=Orientation.E;
            break;
        default :
            break;
        
    }
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

    public void setY(int y) {
        this.y = y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

}
