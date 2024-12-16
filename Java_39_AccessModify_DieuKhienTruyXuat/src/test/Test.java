package test;

import code.Information;

public class Test {
	private Information info;
	
	public void method() {
//		this.info.a // Không truy xuất được khi khác package
//		this.info.b // Không truy xuât được khi khác package
//		this.info.c // Không truy xuất được khi khác package
		this.info.d = 3; // truy xuất được khi khác package
	}
}
