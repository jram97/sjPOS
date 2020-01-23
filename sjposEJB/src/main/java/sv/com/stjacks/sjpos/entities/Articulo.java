package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * @author Javier Ramirez
 * The persistent class for the articulo database table.
 * 
 */
@Entity
@Table(name = "articulo")
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a")
    , @NamedQuery(name = "Articulo.findByIdArticulo", query = "SELECT a FROM Articulo a WHERE a.idArticulo = :idArticulo")
    , @NamedQuery(name = "Articulo.findByNombreArt", query = "SELECT a FROM Articulo a WHERE a.nombreArt = :nombreArt")
    , @NamedQuery(name = "Articulo.findByDescripcionArt", query = "SELECT a FROM Articulo a WHERE a.descripcionArt = :descripcionArt")
    , @NamedQuery(name = "Articulo.findByCantidadArt", query = "SELECT a FROM Articulo a WHERE a.cantidadArt = :cantidadArt")
    , @NamedQuery(name = "Articulo.findByEstadoArt", query = "SELECT a FROM Articulo a WHERE a.estadoArt = :estadoArt")
    , @NamedQuery(name = "Articulo.findByFechaRegistroArt", query = "SELECT a FROM Articulo a WHERE a.fechaRegistroArt = :fechaRegistroArt")})
public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Integer idArticulo;

    @Column(name = "nombre_art")
    private String nombreArt;
    
    @Column(name = "descripcion_art")
    private String descripcionArt;
    
    @Column(name = "cantidad_art")
    private int cantidadArt;
    
    @Column(name = "estado_art")
    private boolean estadoArt;
    
    @Column(name = "fecha_registro_art")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistroArt;
    
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    
    @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    @ManyToOne
    private Genero idGenero;
    
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
    @ManyToOne(optional = false)
    private Marca idMarca;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArticulo")
    private List<Producto> productoList;

    public Articulo() {
    }

    public Articulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Articulo(Integer idArticulo, String nombreArt, int cantidadArt, boolean estadoArt, Date fechaRegistroArt) {
        this.idArticulo = idArticulo;
        this.nombreArt = nombreArt;
        this.cantidadArt = cantidadArt;
        this.estadoArt = estadoArt;
        this.fechaRegistroArt = fechaRegistroArt;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public String getDescripcionArt() {
        return descripcionArt;
    }

    public void setDescripcionArt(String descripcionArt) {
        this.descripcionArt = descripcionArt;
    }

    public int getCantidadArt() {
        return cantidadArt;
    }

    public void setCantidadArt(int cantidadArt) {
        this.cantidadArt = cantidadArt;
    }

    public boolean getEstadoArt() {
        return estadoArt;
    }

    public void setEstadoArt(boolean estadoArt) {
        this.estadoArt = estadoArt;
    }

    public Date getFechaRegistroArt() {
        return fechaRegistroArt;
    }

    public void setFechaRegistroArt(Date fechaRegistroArt) {
        this.fechaRegistroArt = fechaRegistroArt;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
    }

    public Marca getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Marca idMarca) {
        this.idMarca = idMarca;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulo != null ? idArticulo.hashCode() : 0);
        return hash;
    }
}
