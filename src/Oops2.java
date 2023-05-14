public class Oops2 {
    public void main(String[] args) {
        Mammal Tiger = new Mammal ();
        Tiger.eats();
        Tiger.legs=4;
        Tiger.skinTone="Blue";
        System.out.println(Tiger);




    }

    class Animal{
        public int legs;
        String color;
        int eyes;
        String skinTone;
        String eat;
        void eats(){
            System.out.println("eats");
        }

    }

    class Fish extends Animal {
        String fins;
        String swim;
        void swim(){
            System.out.println("swim");
        }
    }


    class Mammal extends Animal{
        void walk(){
            System.out.println("walks");
        }
    }


}
