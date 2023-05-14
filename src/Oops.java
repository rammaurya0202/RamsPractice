public class Oops {
    public static void main(String[] args) {
  Pen p1 =new Pen();
  p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }

}
 class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newtip){
        tip = newtip;

    }


}
class Student{
    String name;
    int age;
    float percentage;
    void caluPercentage(int phy,int chem,int math){
        percentage =(phy +chem +math)/3;

    }
}
