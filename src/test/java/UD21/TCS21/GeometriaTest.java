package UD21.TCS21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class GeometriaTest {
	@Test
	public void testAreaCuadrado() {
		Geometria gm = new Geometria();
		int resultado = gm.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaCiruclo() {
		Geometria gm = new Geometria();
		double resultado = gm.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTriangulo() {
		Geometria gm = new Geometria();
		int resultado = gm.areatriangulo(2, 2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRectangulo() {
		Geometria gm = new Geometria();
		int resultado = gm.arearectangulo(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaPentagono() {
		Geometria gm = new Geometria();
		int resultado = gm.areapentagono(2, 2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRombo() {
		Geometria gm = new Geometria();
		int resultado = gm.arearombo(2, 2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRomboide() {
		Geometria gm = new Geometria();
		int resultado = gm.arearomboide(2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTrapecio() {
		Geometria gm = new Geometria();
		int resultado = gm.areatrapecio(2, 2, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testSwitch() {
		Geometria GeoTest1 = new Geometria(1);
		String esperado = "cuadrado";
		assertEquals(esperado, GeoTest1.getNom());
		
		Geometria GeoTest2 = new Geometria(2);
		String esperado2 = "Circulo";
		assertEquals(esperado2, GeoTest2.getNom());
		
		Geometria GeoTest3 = new Geometria(3);
		String esperado3 = "Triangulo";
		assertEquals(esperado3, GeoTest3.getNom());
		
		Geometria GeoTest4 = new Geometria(4);
		String esperado4 = "Rectangulo";
		assertEquals(esperado4, GeoTest4.getNom());
		
		Geometria GeoTest5 = new Geometria(5);
		String esperado5 = "Pentagono";
		assertEquals(esperado5, GeoTest5.getNom());
		
		Geometria GeoTest6 = new Geometria(6);
		String esperado6 = "Rombo";
		assertEquals(esperado6, GeoTest6.getNom());
		
		Geometria GeoTest7 = new Geometria(7);
		String esperado7 = "Romboide";
		assertEquals(esperado7, GeoTest7.getNom());
		
		Geometria GeoTest8 = new Geometria(8);
		String esperado8 = "Trapecio";
		assertEquals(esperado8, GeoTest8.getNom());
		
		Geometria GeoTestDefault = new Geometria(100);
		String esperado9 = "Default";
		assertEquals(esperado9, GeoTestDefault.getNom());		
	}
	
	@Test
    public void testSetGetId() {
        Geometria GeoTest = new Geometria();
        GeoTest.setId(1);
        assertEquals(1, GeoTest.getId());
    }
	
	@Test
	public void testGetArea() {
		Geometria GeoTest = new Geometria();
        GeoTest.setArea(1.1);
        assertEquals(1.1, GeoTest.getArea());
	}
	
	@Test
	public void testToString() {
		Geometria GeoTest = new Geometria();
        GeoTest.setArea(1.1);
        GeoTest.setId(1);
        GeoTest.setArea(2.2);
        GeoTest.setNom("dodecaedro");
        String esperado = "Geometria [id=" + 1 + ", nom=" + "dodecaedro" + ", area=" + 2.2 + "]";;
        assertEquals(esperado, GeoTest.toString());
    }
}
