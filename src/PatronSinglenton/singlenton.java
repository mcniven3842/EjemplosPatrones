package PatronSinglenton;

public class singlenton {
	
    static private singlenton Singlenton = null;
    
    /** El constrcutor se declara privado **/
    /** para que inguna otra clase puede instanciar **/
    private singlenton() { }

    static public singlenton getSingleton() {

        if (Singlenton == null) {
            Singlenton = new singlenton();
        }
        return Singlenton;
    }

    public String metodo() {
        return "Singleton instanciado bajo demanda";
    }
    
    /** 2 alternativa para declarar una clase con singlenton **/
    /** el resultado es el mismo, se obliga a las demas clases a llamar al metodo**/
    /** que instancia **/
    /**
    public class Singleton {
 
     static private Singleton singleton = new Singleton();\\
 
     private Singleton() { }
 
     static public Singleton getSingleton() {
         return singleton;
     }
     public String metodo() {\\
         return "Singleton ya instanciado";\\
     }
 
 	} 
     
    **/

}
