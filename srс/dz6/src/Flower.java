

public class Flower {

   private String n;

    public void state() {
        try {
            throw new IllegalStateException() ;
            //

        }
        catch(IllegalStateException e ){

            System.err.println("IllegalStateException: " + e.getMessage());
        }

    }

    public void collect() throws DamageFlowerException {
        if (n==null){

            throw new DamageFlowerException();
        }


    }


}


