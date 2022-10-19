
import java.io.Serializable;
import javax.persistance.Entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

@Entity
@Table(name="peliculas")
public class Peliculas implements Serializable{
    
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public Peliculas getPelicuas() {
        return pelicuas;
    }

    public void setPelicuas(Peliculas pelicuas) {
        this.pelicuas = pelicuas;
    }
    
    private String Nombre;
    private String Horario;
    private String Sala;
    private String Precio;
    
    @JoinColumn(name"peliculas_id")
    private Peliculas pelicuas;
}
