package test;

import com.uttara.test.Person;
import com.uttara.test.Spanner;
import com.uttara.test.Thing;
import com.uttara.test.Tool;
import com.uttara.test.TubeLight;

public class TestThing {

	public static void main(String[] args) {
	
		Spanner sp = new Spanner();
		Tool t = sp;
		Thing thingy = t;
		/*
		sp.doSomething();
		sp.rotateScrew();
		System.out.println("using Thing ref");
		thingy.doSomething();
		System.out.println("using Tool ref");
		t.doSomething();
		*/
		TubeLight siska = new TubeLight();
		
		Person p = new Person("IrfanKhan");
		p.testThing(siska);
		p.testThing(sp);
		
	}

}




