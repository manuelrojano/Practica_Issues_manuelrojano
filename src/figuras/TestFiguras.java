package figuras;

import java.util.ArrayList;

public class TestFiguras {

	public static void main(String[] args) throws Exception {
		
		//Rectángulos
		Rectangulo rectangulo1 = new Rectangulo(generarAleatorio(), generarAleatorio());
		Rectangulo rectangulo2 = new Rectangulo(generarAleatorio(), generarAleatorio());
		Rectangulo rectangulo3 = new Rectangulo(generarAleatorio(), generarAleatorio());
		Rectangulo rectangulo4 = new Rectangulo(generarAleatorio(), generarAleatorio());
		Rectangulo rectangulo5 = new Rectangulo(generarAleatorio(), generarAleatorio());
		
		//Triángulos
		Triangulo triangulo1 = new Triangulo(generarAleatorio(), generarAleatorio());
		Triangulo triangulo2 = new Triangulo(generarAleatorio(), generarAleatorio());
		Triangulo triangulo3 = new Triangulo(generarAleatorio(), generarAleatorio());
		Triangulo triangulo4 = new Triangulo(generarAleatorio(), generarAleatorio());
		Triangulo triangulo5 = new Triangulo(generarAleatorio(), generarAleatorio());
		
		//Creaccion de la lista e inserción de las figuras
		ArrayList<FiguraCerrada> listaFiguras = new ArrayList<FiguraCerrada>();
		listaFiguras.add(rectangulo1);
		listaFiguras.add(rectangulo2);
		listaFiguras.add(rectangulo3);
		listaFiguras.add(rectangulo4);
		listaFiguras.add(rectangulo5);
		
		listaFiguras.add(triangulo1);
		listaFiguras.add(triangulo2);
		listaFiguras.add(triangulo3);
		listaFiguras.add(triangulo4);
		listaFiguras.add(triangulo5);
		
		for(FiguraCerrada arrayFiguras : listaFiguras) {
			if(arrayFiguras.getArea() > 20)
				System.out.println(arrayFiguras);
		}
		
	}
	
	public static double generarAleatorio() {
		double numero = Math.random() * (15-0.01) +  0.1;
		return numero;

	}
}
