
public class MaxMinTest {
	MaxMin mm;
	
	@BeforeAll
	
	
	@BeforeEach
	void setup() {
		mm = new MinMax();
	}
	
	@Test
	public void bLarger() {
		double a = 10.0;
		double b = 16.0;
		double expected = 16.0;
		double actual = mm.maximum(a,b);
		assertTrue(actual>a, "b should xyz");
	}
	
	@AfterAll
	
	@AfterEach

	@
}
