public class Elephant extends Animal{
    public void forage(){
        System.out.println("The elephant forages for food");
    }

    public void  trumpet(){
        System.out.println("The elephant trumpets");
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new elephant has arrived");
    }

    public Elephant(){
        
    }
}
