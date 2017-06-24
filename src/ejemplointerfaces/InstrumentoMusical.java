package ejemplointerfaces;

/**
 *
 * @author JUAN
 *
 * Para poder implementar el metodo sonar de la interface Sonoro debo implementarlo también
 * o bien hacer abstracta a la clase InstrumentoMusical, en este caso hare lo segundo
 * De un interface implementamos y de una clase abstracta heredamos haciendo extends, en este caso
 * la sirena implementara el interfaz Sonoro al igual que la clase abstracta instrumentoMusical, pero tambor y 
 * trompeta extenderan las propiedades de la clase abstracta InstrumentoMusical
 * 
 */
public abstract class InstrumentoMusical implements Sonoro {
    
}
