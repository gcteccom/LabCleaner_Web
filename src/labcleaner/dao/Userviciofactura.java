package labcleaner.dao;
// Generated 23-mar-2018 19:41:08 by Hibernate Tools 5.2.6.Final

/**
 * Userviciofactura generated by hbm2java
 */
public class Userviciofactura implements java.io.Serializable {

	private Integer id;
	private Factura factura;
	private Servicio servicio;

	public Userviciofactura() {
	}

	public Userviciofactura(Factura factura, Servicio servicio) {
		this.factura = factura;
		this.servicio = servicio;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}
