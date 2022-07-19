//muti level
package com.globallogic.demo;
public class InheritenceMultilevel {
}
	class Dadi{
		
			Dadi() {
					System.out.println("Dadi ka DNA");
 
			}
	}
class Chacha extends Dadi{
	Chacha() {
		System.out.println("Chacha ka DNA");
		}
	}
class Cousin extends Chacha{
	Cousin() {
		System.out.println("Cousin ka DNA");
		}
	}
}