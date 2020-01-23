package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * Javier Ramirez
 * The persistent class for the genero database table.
 * 
 */
@Entity
@Table(name = "genero")
@NamedQueries({
    @NamedQuery(name = "Genero.findAll", query = "SELECT g FROM Genero g")
    , @NamedQuery(name = "Genero.findByIdGenero", query = "SELECT g FROM Genero g WHERE g.idGenero = :idGenero")
    , @NamedQuery(name = "Genero.findByNombreGen", query = "SELECT g FROM Genero g WHERE g.nombreGen = :nombreGen")
    , @NamedQuery(name = "Genero.findByEstadoGen", query = "SELECT g FROM Genero g WHERE g.estadoGen = :estadoGen")
    , @NamedQuery(name = "Genero.findByDescripcionGen", query = "SELECT g FROM Genero g WHERE g.descripcionGen = :descripcionGen")
    , @NamedQuery(name = "Genero.findByFechaRegistroGen", query = "SELECT g FROM Genero g WHERE g.fechaRegistroGen = :fechaRegistroGen")})
public class Genero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "nombre_gen")
    private String nombreGen;
    
    @Column(name = "estado_gen")
    private boolean estadoGen;
    
    @Column(name = "descripcion_gen")
    private String descripcionGen;
    
    @Column(name = "fecha_registro_gen")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistroGen;
    
    @OneToMany(mappedBy = "idGenero")
    private List<Articulo> articuloList;

    public Genero() {
    }

    public Genero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Genero(Integer idGenero, String nombreGen, boolean estadoGen, Date fechaRegistroGen) {
        this.idGenero = idGenero;
        this.nombreGen = nombreGen;
        this.estadoGen = estadoGen;
        this.fechaRegistroGen = fechaRegistroGen;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGen() {
        return nombreGen;
    }

    public void setNombreGen(String nombreGen) {
        this.nombreGen = nombreGen;
    }

    public boolean getEstadoGen() {
        return estadoGen;
    }

    public void setEstadoGen(boolean estadoGen) {
        this.estadoGen = estadoGen;
    }

    public String getDescripcionGen() {
        return descripcionGen;
    }

    public void setDescripcionGen(String descripcionGen) {
        this.descripcionGen = descripcionGen;
    }

    public Date getFechaRegistroGen() {
        return fechaRegistroGen;
    }

    public void setFechaRegistroGen(Date fechaRegistroGen) {
        this.fechaRegistroGen = fechaRegistroGen;
    }

    public List<Articulo> getArticuloList() {
        return articuloList;
    }

    public void setArticuloList(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGenero != null ? idGenero.hashCode() : 0);
        return hash;
    }
}