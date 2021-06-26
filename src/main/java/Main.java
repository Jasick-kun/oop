
public class Main {
    public void main(String [] args ){
        Dog Tuzik=new Dog("haski",5d,"white");
        Tuzik.speak();
        huntingDog Archi=new huntingDog("archi",7d,"black",10d);
        Archi.speak();
    }
    public class Dog{
        private String name;
        private Double speed;
        private String color;
        public Dog (String name){
            this.name=name;
        }
        public Dog (String name, Double speed){
            this.name=name;
            this.speed=speed;
        }
        public Dog (String name,Double speed,String color){
            this.name=name;
            this.speed=speed;
            this.color=color;
        }
        public void speak(){
            System.out.println("gaw");
        }
    }
    public class huntingDog extends Dog{
        private Double strength;
        public huntingDog(String name,Double speed, String color,Double strength) {
            super(name,speed,color);
            this.strength=strength;
        }
        @Override
        public void speak(){
            System.out.println("auf");
        }


    }
}
