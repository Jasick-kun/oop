
public class Main {
    public void main(String [] args ){
        Dog Tuzik=new Dog();
        Tuzik.speed=5d;
        Tuzik.name="tuzik";
        Tuzik.color="white";// не оптимально и не удобно
        Tuzik.speak();
        huntingDog Archi=new huntingDog(10d);
        Archi.name="archi";// невозможно
        Archi.speak();
    }
    public class Dog{
        private String name;
        private Double speed;
        private String color;

        public void speak(){
            System.out.println("gaw");
        }
    }
    public class huntingDog extends Dog{
        private Double strength;
        public huntingDog(Double strength) {
            this.strength=strength;
        }
        @Override
        public void speak(){
            System.out.println("auf");
        }
    }
}
