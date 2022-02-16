package idat.ciclo4.prc.model.sp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MedicamentoSp {
	
	@Id
	private Long id_producto;
	private String imagen_producto;
	private String nombre_producto;
	private String prescripcion;
	private String presentacion;
	private Double precio;
	private Double precio_unitario;
	private Integer stock;
	private Byte is_active;
	private Integer id_categoria_producto;
	private String nombreCategoria;
	private Integer id_marca_producto;
	private String nombreMarca;
}
