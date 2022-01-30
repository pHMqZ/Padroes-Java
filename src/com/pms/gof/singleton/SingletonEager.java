package com.pms.gof.singleton;

/**
 * Singleton "Eager"
 * 
 * @author Phillip
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
