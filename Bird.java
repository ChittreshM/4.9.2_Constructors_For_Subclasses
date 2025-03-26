public class Bird extends Animal {
    public Bird(){

    }

    public Bird(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A bird arrives");
    }
}
