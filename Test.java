package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Resta;

class Test {
	OperacionAritmetica context;

	//Validos
	
	//Resta con algun digito negativo (primer digito)
	@org.junit.jupiter.api.Test
	void testGetResta1() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(-5,10), -1);
	}
	
	//Resta con algun digito negativo(segundo digito)
	@org.junit.jupiter.api.Test
	void testGetResta2() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(5,-10), -1);
	}
	
	//Resta con el primer digito igual al segundo
	@org.junit.jupiter.api.Test
	void testGetResta3() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(5,5), 0);
	}

	//Division con algun digito negativo (ambos digitos)
	@org.junit.jupiter.api.Test
	void testGetDivision1() {
		context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(-1, -2), -1);
	}
	
	//Resta con el segundo digito mayor al primero
	@org.junit.jupiter.api.Test
	void testGetResta4() {
		context = new OperacionAritmetica( new Resta());
		assertEquals(context.procesar(10,20), -2);
	}
	
	//Division entre cero
	@org.junit.jupiter.api.Test
	void testGetDivision2() {
		context = new OperacionAritmetica( new Division());
		assertEquals(context.procesar(10,0), -3);
	}
	
	//Division con el primer digito igual al segundo
		@org.junit.jupiter.api.Test
		void testGetDivision3() {
			context = new OperacionAritmetica( new Division());
			assertEquals(context.procesar(9,9), 1);
		}
		
	//Invalidos

	//Resta de digitos positivos
	@org.junit.jupiter.api.Test
	void testGetResta5() {
		context = new OperacionAritmetica( new Resta());
		assertNotEquals(context.procesar(5,10), -1);
	}
	
	//Resta con el primer digito mayor al segundo
	@org.junit.jupiter.api.Test
	void testGetResta6() {
		context = new OperacionAritmetica( new Resta());
		assertNotEquals(context.procesar(20,10), -2);
	}
	
	//No se realiza una division entre cero
	@org.junit.jupiter.api.Test
	void testGetDivision4() {
		context = new OperacionAritmetica( new Division());
		assertNotEquals(context.procesar(9,3), -3);
	}
	
}
