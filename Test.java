package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Resta;

class Test {
	OperacionAritmetica context;

	//Validos
	
	//Algun valor ingresado es negativo (primer digito)
	@org.junit.jupiter.api.Test
	void testGetResta1() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(-5,10), -1);
	}
	
	//Algun valor ingresado es negativo (segundo digito)
	@org.junit.jupiter.api.Test
	void testGetResta2() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(5,-10), -1);
	}

	//Algun valor ingresado es negativo (ambos digitos)
	@org.junit.jupiter.api.Test
	void testGetDivision1() {
		context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(-1, -2), -1);
	}
	
	//Segundo digito mayor al primero
	@org.junit.jupiter.api.Test
	void testGetResta3() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(10,20), -2);
	}
	
	//Se realiza una division entre cero
	@org.junit.jupiter.api.Test
	void testGetDivision2() {
		context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(10,0), -3);
	}
	
	
	//Invalidos
	
	//Solo digitos positivos
		@org.junit.jupiter.api.Test
		void testGetResta5() {
			context = new OperacionAritmetica( new Resta());
			assertNotEquals(context.procesar(5,10), -1);
		}
		
		//Primer digito mayor al segundo
		@org.junit.jupiter.api.Test
		void testGetResta6() {
			context = new OperacionAritmetica( new Resta());
			assertNotEquals(context.procesar(20,10), -2);
		}
		
		//No se realiza una division entre cero
		@org.junit.jupiter.api.Test
		void testGetDivision3() {
			context = new OperacionAritmetica( new Division());
			assertNotEquals(context.procesar(9,3), -3);
		}
	
}
