public class Penguin extends Bird {
    public void fish(){
        System.out.println("The penguin fishes for food");
    }

    public Penguin(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new penguin has arrived");
    }

    public Penguin(){
        
    }
    
}
