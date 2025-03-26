public class Feline extends Animal {
    public void forage(){
        System.out.println("The feline forages for food");
    }

    public void growl(){
        System.out.println("The feline growls.");
    }

    public void roar(){
        System.out.println("The feline roars.");
    }

    public Feline(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives");
    }

    public Feline(){
        
    }
}
