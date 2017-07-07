//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//import junit.framework.Assert;
//
//import org.junit.Test;
//
//
///*
// * Resources used
// * http://www.random.org/
// * http://en.wikipedia.org/wiki/Fibonacci_number
// * http://www.calctool.org/CALC/math/default/fibonacci //Doesn't start from 0
// *
// */
//
//
//public class test {
//	String file = "output.txt";
//	String ls = System.getProperty("line.separator");
//
//	//Internal method test
//	@Test
//	public void testFibonacciAt() {
//
//		assertThat(Long.valueOf(34), is(Fibonacci.fibonacci(10)));
//	}
//
//
//	@Test
//	public void testMainPositive() throws IOException {
//
//		Fibonacci.main(new String[] { "1" });
//		assertThat(readFile(), is("Fibonacci number at position 1 is:0"));
//
//		Fibonacci.main(new String[] { "2" });
//		assertThat(readFile(), is("Fibonacci number at position 2 is:1"));
//
//	}
//
//	@Test
//	public void testMedian() throws IOException {
//
//		Fibonacci.main(new String[] { "20" });
//		assertThat(readFile(), is("Fibonacci number at position 20 is:6765"));
//
//	}
//
//	@Test
//	public void testTop() throws IOException {
//
//		assertThat(Long.valueOf(100), is(Fibonacci.fibonacci(9999999)));
//
//	}
//
//	@Test
//	public void testMainInvalid() throws IOException {
//		String invalid = "Input must be a number greater than 0";
//
//		// Zero
//		Fibonacci.main(new String[] { "0" });
//		assertThat(readFile(), is(invalid));
//
//	}
//
//
//	private String readFile() throws IOException {
//		BufferedReader reader = new BufferedReader(new FileReader(file));
//		String line = null;
//		StringBuilder stringBuilder = new StringBuilder();
//
//		while ((line = reader.readLine()) != null) {
//			stringBuilder.append(line);
//			stringBuilder.append(ls);
//		}
//
//		return stringBuilder.toString().trim();
//	}
//
//}