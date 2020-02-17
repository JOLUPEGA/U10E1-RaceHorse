
package Horse;

import EnumColor.Color;

public class Horse {
    
    private String nombre;
    private Color color;
    private Integer nanio;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }
    
    public void setNanio(Integer nanio){
        this.nanio = nanio;
    }
    public Integer getNanio(){
        return this.nanio;
    }
}
