/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author USUARIO
 */
public class Jugador extends Futbolista {
    
    public short golesMarcados;
    public byte dorsal;
    
    public Jugador(){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }
    
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre,edad,posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    
    @Override
    public int compareTo(Object obj){
        return Math.abs(this.getEdad()-((Futbolista)obj).getEdad());
    }
    
    @Override
    public String toString(){
        return "El futbolista "+getNombre()+" tiene "+getEdad()+", y juega de "+getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
    }
    
    @Override
    public boolean jugarConLasManos(){
        return false;
    }
    
    
    
}
