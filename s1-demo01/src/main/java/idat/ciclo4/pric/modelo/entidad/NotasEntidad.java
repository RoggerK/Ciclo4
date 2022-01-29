package idat.ciclo4.pric.modelo.entidad;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NotasEntidad {
	
	private Integer nota1;
	private Integer nota2;
	private Integer nota3;
	private Integer nota4;
	
	public void setNota1(Integer nota1) {
		this.nota1 = this.verificaNota(nota1);
	}
	public void setNota2(Integer nota2) {
		this.nota2 = this.verificaNota(nota2);
	}
	public void setNota3(Integer nota3) {
		this.nota3 = this.verificaNota(nota3);
	}
	public void setNota4(Integer nota4) {
		this.nota4 = this.verificaNota(nota4);
	}
	
	public Integer verificaNota(Integer nota) {
		
		if(nota < 0 || nota > 20) {
			return -1;
		}else {
			return nota;
		}
	}
}
