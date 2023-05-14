public class ShorttestPath {

  public static int getShortestPath(String Path){
      for(int i =0; i<Path.length();i++){
          char dir = Path.charAt(i);

          //south
          if(dir =='S'){
              y--;
          }
          //North
          else if(dir =='N'){
              y++;
              //west
          } else if (dir =='W') {
              x--;
          }
          //east
          else{
              x++;
          }
      }
      int X2 =x*x;
      int Y2 =y*y;
      return Math.sqrt(X2+Y2);
  }

    public static void main(String[] args) {
        String Path ="WNEENESENNN";
        System.out.println(getShortestPath(Path));
    }
}
