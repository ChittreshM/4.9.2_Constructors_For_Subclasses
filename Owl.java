public class Owl extends Bird {
    public void hunt(){
        System.out.println("The owl hunts for food");
    }

    public Owl(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new owl has arrived");
      }

      public Owl(){
        
      }
}
