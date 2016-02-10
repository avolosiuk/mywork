package dz9;

public class Text extends File {
    private String name ;

   public Text(String name){
       this.name=name;
   }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Text{" +
                "name='" + name + '\'' +
                '}';
    }
}
