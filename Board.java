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
  
  }}
    return ret;
  }


  
  public boolean addShip(int row, int col, int len, boolean horizontal){

if(horizontal == true){
  if((col + len) > squares[0].length){
    return false;
  }else{
    
for(int c = col; c < col+len; c++){
if(!squares[row][c].equals("-")){
  return false;
  }
}

for(int i = 0; i < len; i++){
  squares[(row - 1)][(col - 1) + i] = "b";
}
    
return true;
    
}}else{
if((row + len) > squares.length){
  return false;
}else{

for(int r = row; r < row+len; r++) {
if(!squares[r][col].equals("-")){
  return false;
  }
}

for(int e = 0; e < len; e++){
  squares[(row - 1) + e][(col - 1)] = "b";
}
  
  return true;
  
}}}

  

  public boolean foundShip(int len){

for(int i = 0; i < squares.length; i++){

int counter = 0;

while(counter < squares[0].length){

int foundLen = 0;

while(counter < squares[0].length && squares[i][counter].equals("b")){

foundLen++;
counter++;

}

if(foundLen == len){
  return true;
  }

foundLen = 0;
counter++;

}}

for(int k = 0; k < squares[0].length; k++){

int counter = 0;

while(counter < squares.length){

int foundLen = 0;

while(counter < squares.length && squares[counter][k].equals("b")){
foundLen++;
counter++;
}

if(foundLen == len){
return true;
  }
  
foundLen = 0;
counter++;
  
}}

return false;
}



  public int shoot(int row, int col){

if(
  row > squares.length ||
  row < 0 ||
  col > squares[0].length ||
  col < 0
){
  return -1;
}

    if((squares[row-1][col-1].equals("-")) == true){
      squares[row-1][col-1] = "m";
      return 0;
    }else{
      if((squares[row-1][col-1].equals("b")) == true){
        squares[row-1][col-1] = "x";
        return 1;
      }
    }

    if(
(squares[row-1][col-1].equals("m")) == true ||
(squares[row-1][col-1].equals("x")) == true
    ){
      return 2;
    }
    
    return 0;
  }


  
  public boolean gameOver(){

for(int i = 0; i < squares.length; i++) {

for(int k = 0; k < squares[0].length; k++) {

if(squares[i][k].equals("b")){
  return false;
  }}}

return true;

}
}