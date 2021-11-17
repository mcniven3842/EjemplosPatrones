/**Tenemos una fábrica de camisetas con estampados, típicas de las ferias y mercadillos. 
Para crear nuevas camisetas, cogeremos una similar y modificaremos 
únicamente el color, la talla y el estampado. Empezamos con el prototipo **/
package Prototype;

public abstract class Camiseta {
	protected String nombre;
	protected Integer talla;
	protected String color;
	protected String manga;
	protected String estampado;
	protected Object material;

    public Camiseta (String nombre,Integer talla, String color, String manga, String estampado, Object material){
            this.setNombre(nombre);
            this.setTalla(talla);
            this.setColor(color);
            this.setManga(manga);
            this.setEstampado(estampado);
            this.setMaterial(material);
    }

	public abstract Camiseta clone();
    /** Todos los getter y los setter. **/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTalla() {
		return talla;
	}
	public void setTalla(Integer talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManga() {
		return manga;
	}
	public void setManga(String manga) {
		this.manga = manga;
	}
	public String getEstampado() {
		return estampado;
	}
	public void setEstampado(String estampado) {
		this.estampado = estampado;
	}
	public Object getMaterial() {
		return material;
	}
	public void setMaterial(Object material) {
		this.material = material;
	}
}
