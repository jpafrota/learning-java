package com.jpafrota.cursojava.aula46lab;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {

	// como a flasse Figura3D já é abstrata, ela não precisa implementar os métodos das interfaces DimSup e DimVol.
	
	@Override
	public String toString() {
		
		return super.toString() + "área: " + this.calcularArea() + "\nVolume: " + this.calcularVolume() + "\n";
		
	} 
}
