package com.pms.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @author Phillip
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	private SingletonLazyHolder() {
		
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
