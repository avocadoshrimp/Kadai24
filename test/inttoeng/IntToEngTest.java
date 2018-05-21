package inttoeng;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;

public class IntToEngTest {
	
	@Test
	public void てすと1() {
		IntToEng num = new IntToEng();
		String expected ="one";
		String actual = num.translateEng(1);
		assertThat(actual,is(expected));
	} 
	
	@Test
	public void てすと21() {
		IntToEng num = new IntToEng();
		String expected ="twenty one";
		String actual = num.translateEng(21);
		assertThat(actual,is(expected));
	} 

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
