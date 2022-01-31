package com.pms.gof;

import com.pms.gof.facade.Facade;
import com.pms.gof.singleton.SingletonEager;
import com.pms.gof.singleton.SingletonLazy;
import com.pms.gof.singleton.SingletonLazyHolder;
import com.pms.gof.strategy.Comportamento;
import com.pms.gof.strategy.ComportamentoAgressivo;
import com.pms.gof.strategy.ComportamentoDefensivo;
import com.pms.gof.strategy.ComportamentoNormal;
import com.pms.gof.strategy.Robo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Singleton");
		
		System.out.println("Lazy");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println("----");
		System.out.println("Eager");
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		System.out.println("----");
		System.out.println("LazyHolder");
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println("----");
		System.out.println("Strategy");
		
		
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento  agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		System.out.println("----");
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		System.out.println("----");
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
	
		System.out.println("----");
		System.out.println("Facade");
		
		Facade facade = new Facade();
		facade.migrarCliente("Phillip", "13561110");		
		
	}

}
