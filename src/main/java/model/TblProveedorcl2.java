package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorcl2 database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorcl2")
@NamedQuery(name="TblProveedorcl2.findAll", query="SELECT t FROM TblProveedorcl2 t")
public class TblProveedorcl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProveedor;

	private String emailProvecl2;

	@Temporal(TemporalType.DATE)
	private Date feingProvecl2;

	private String nomProvecl2;

	private String rsocialProvecl2;

	private String rucProvecl2;

	public TblProveedorcl2() {
	}

	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getEmailProvecl2() {
		return this.emailProvecl2;
	}

	public void setEmailProvecl2(String emailProvecl2) {
		this.emailProvecl2 = emailProvecl2;
	}

	public Date getFeingProvecl2() {
		return this.feingProvecl2;
	}

	public void setFeingProvecl2(Date feingProvecl2) {
		this.feingProvecl2 = feingProvecl2;
	}

	public String getNomProvecl2() {
		return this.nomProvecl2;
	}

	public void setNomProvecl2(String nomProvecl2) {
		this.nomProvecl2 = nomProvecl2;
	}

	public String getRsocialProvecl2() {
		return this.rsocialProvecl2;
	}

	public void setRsocialProvecl2(String rsocialProvecl2) {
		this.rsocialProvecl2 = rsocialProvecl2;
	}

	public String getRucProvecl2() {
		return this.rucProvecl2;
	}

	public void setRucProvecl2(String rucProvecl2) {
		this.rucProvecl2 = rucProvecl2;
	}

}