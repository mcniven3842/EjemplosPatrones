package EjemSinglenton;

public class Singleton {
	 private static Singleton instance;
	 public String value;

	 /** Declara en constructor privado **/
	 private Singleton(String value) {
		 // Secuencia de tiempo, hace que tarde 1 segundo, el numero 1000 esta dado en milsegundos
	     try {
	    	 Thread.sleep(1000);
	     } catch (InterruptedException ex) {
	    	 ex.printStackTrace();
	     }
	     	this.value = value;
	     }

	    public static Singleton getInstance(String value) {
	        /** con este condicional evita que se pueda instanciar varias veces **/
	        /** ya que si la instancia contiene un valor no permite instanciarlo nuevamente**/
	    	if (instance == null) {
	            instance = new Singleton(value);
	        }
	        return instance;
	    }

}
