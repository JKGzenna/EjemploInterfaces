package ejemplointerfaces;

/**
 * 
 * Interfaz Sonoro obliga a cualquier clase que lo implemente a tener el metodo sonar
 * Lo implementaran la clase abstracta InstrumentoMusical y la clase Sirena, tambor y trompeta
 * también lo implementaran derivado de la clase InstrumentoMusical que al ser abstracta extiende
 * sus propiedades a tambor y trompeta
 * 
 * @author JUAN
 * 
 */
public interface Sonoro {
    public void sonar(int volumen);
        
    
}
