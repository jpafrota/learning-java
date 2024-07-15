package com.jpafrota.cursojava.aula46lab;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

	// como a flasse Figura2D já é abstrata, ela não precisa implementar os métodos da interface DimSup.
	// estes métodos deverão ser implementados por suas subclasses.
	
	@Override
	public String toString() {
		
		return super.toString() + "área: " + this.calcularArea() + "\n";
		
	} 
	
}
