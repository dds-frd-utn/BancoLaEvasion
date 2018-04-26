package utn.frd.laevasion.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tipo_movimiento")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "TipoMovimiento.findAll", query = "SELECT t FROM TipoMovimiento t"), @NamedQuery(name = "TipoMovimiento.findById", query = "SELECT t FROM TipoMovimiento t WHERE t.id = :id"), @NamedQuery(name = "TipoMovimiento.findByNombre", query = "SELECT t FROM TipoMovimiento t WHERE t.nombre = :nombre") })
public class TipoMovimiento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre")
    private String nombre;

    public TipoMovimiento() {
    }

    public TipoMovimiento(Integer id) {
        this.id = id;
    }

    public TipoMovimiento(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TipoMovimiento)) {
            return false;
        }
        TipoMovimiento other = (TipoMovimiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utn.frd.laevasion.TipoMovimiento[ id=" + id + " ]";
    }
}
