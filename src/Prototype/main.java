package Prototype;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// Recibiremos en los argumentos los estampados de las camisetas

		// Creamos los prototipos
		Camiseta prototipoMCorta = new CamisetaMCorta(40, "blanco", "Logotipo");
		Camiseta prototipoMLarga = new CamisetaMLarga(40, "blanco", "Logotipo");
	}
	// Almacenamos las camisetas disponibles
	ArrayList camisetas = new ArrayList();
	
	for(int i = 0; i<args.length;i++){
        Camiseta cc =  CamisetaMCorta.clone();
        cc.setEstampado(args[i]);

        for(int j = 35; j<60; j++){
                Camiseta cc_talla = cc.clone();
                cc_talla.setTalla(j);
                camisetas.add(cc_talla);
        }
        

        Camiseta cl =  CamisetaMLarga.clone();
        cl.setEstampado(args[i]);
        
        for(int j = 35; j<60; j++){
                Camiseta cl_talla = cl.clone();
                cl_talla.setTalla(j);
                camisetas.add(cl_talla);
        }        
	
}
