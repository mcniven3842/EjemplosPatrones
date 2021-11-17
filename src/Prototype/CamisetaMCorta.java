package Prototype;

/** Ahora construiremos los prototipos concretos para camisetas de manga larga y manga corta: **/
public class CamisetaMCorta extends Camiseta{
    public CamisetaMCorta(String nombre,Integer talla, String color, String manga, String estampado, Object material){
            super( nombre, talla,  color,  manga,  estampado,  material);
    		this.nombre = "Prototipo";
            this.talla = talla;
            this.color = color;
            this.manga = "Corta";
            this.estampado = estampado;
            this.material = new Lana();
    }
    public Camiseta clone(){
            return new CamisetaMCorta(this.talla, this.color, this.estampado);
    }
}
