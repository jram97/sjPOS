package sv.com.stjacks.sjpos.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * @author Javier Ramirez
 * The persistent class for the tipo_documento_tienda database table.
 * 
 */
@Entity
@Table(name = "tipo_documento_tienda")
@NamedQueries({
    @NamedQuery(name = "TipoDocumentoTienda.findAll", query = "SELECT t FROM TipoDocumentoTienda t")
    , @NamedQuery(name = "TipoDocumentoTienda.findByIdTipoDocumentoTienda", query = "SELECT t FROM TipoDocumentoTienda t WHERE t.idTipoDocumentoTienda = :idTipoDocumentoTienda")})
public class TipoDocumentoTienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_tipo_documento_tienda")
    private Integer idTipoDocumentoTienda;

    @JoinColumn(name = "id_tienda", referencedColumnName = "id_tienda")
    @ManyToOne(optional = false)
    private Tienda tienda;
    
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    @ManyToOne(optional = false)
    private TipoDocumento idTipoDocumento;

    public TipoDocumentoTienda() {
    }

    public TipoDocumentoTienda(Integer idTipoDocumentoTienda) {
        this.idTipoDocumentoTienda = idTipoDocumentoTienda;
    }

    public Integer getIdTipoDocumentoTienda() {
        return idTipoDocumentoTienda;
    }

    public void setIdTipoDocumentoTienda(Integer idTipoDocumentoTienda) {
        this.idTipoDocumentoTienda = idTipoDocumentoTienda;
    }

    public Tienda getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Tienda idTienda) {
        this.idTienda = idTienda;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDocumentoTienda != null ? idTipoDocumentoTienda.hashCode() : 0);
        return hash;
    }

}
