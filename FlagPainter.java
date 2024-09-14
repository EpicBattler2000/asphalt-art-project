import org.code.neighborhood.*;

public class FlagPainter extends MuralPainter {


public void drawBody(){
  FlagLside();
  FlagBottom();
  FlagRside();
  FlagTop();
  Symbol();
  
}

public void FlagLside(){
  turnRight();
  paintLine("white", 14);




  
}

public void FlagRside(){
   turnLeft();
  paintLine("white", 14);
}
  

public void FlagTop(){
  turnLeft();
  
  paintLine("white", 14);
  
}

public void FlagBottom(){
turnLeft();
  paintLine("white", 13);
  
   }
  public void Symbol(){
    turnRight();
    turnRight();
    move();
    turnRight();
   move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    paintLine("red", 4);
    turnRight();
    move();
    paintLine("red", 1);
    turnLeft();
    move();
    turnRight();
    paintLine("red", 4);
    turnRight();
    move();
    turnLeft();
    paintLine("red", 1);
    turnRight();
    move();
    paintLine("red", 4);
    turnRight();
    move();
   paintLine("red", 1);
    turnLeft();
    move();
    turnRight();
    paintLine("red", 4);
    turnRight();
    move();
    paintLine("red", 1);
    turnRight();
    turnRight();
    move();
    turnLeft();
    paintLine("red", 4);
    turnLeft();
    paintLine("red", 5);
    turnLeft();
    paintLine("red", 4);
    turnLeft();
    paintLine("red", 4);
    turnLeft();
    paintLine("red", 5);
    turnLeft();
    paintLine("red", 4);
    turnLeft();
    move();
    turnLeft();
    move();
    turnRight();
    paintLine("red", 4);
    turnLeft();
    move();
    turnLeft();
    paintLine("red", 4);
    turnRight();
    move();
    turnRight();
    paintLine("red", 4);
  }
}
  