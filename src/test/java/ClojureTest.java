/*
 * 
 */


import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import main.Pruebas;

public class ClojureTest {

	public void test() throws IOException {
		Assert.assertEquals(new Pruebas().contieneStatement(), true);
		
	}

}
