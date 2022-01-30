package com.pms.gof;

import com.pms.gof.singleton.SingletonEager;
import com.pms.gof.singleton.SingletonLazy;

public class Main {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
	}

}
