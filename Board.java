public class Board{

  private String[][] squares;

  public Board(){
squares = new String[10][10];
for(int r = 0; r < squares.length; r++){
for(int c = 0; c <squares[0].length; c++){
  squares[r][c] = "-";
}}
  }

  public String toString(){

String ret = "";
    int counter = 0;
    
for(int r = 0; r < squares.length; r++){
  
for(int c = 0; c <squares[0].length; c++){

  if(counter == 10){
ret += "\n" + (squares[r][c]) + " ";
    counter = 0;
  }else{
ret += (squares[r][c]) + " ";
    }
  counter++;
  
  }

  }
    
    return ret;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal){
    return false;
  }

  public boolean foundShip(int len){
    return false;
  }

  public int shoot(int row, int col){
    return 0;
  }

  public boolean gameOver(){
    return false;
  }

}