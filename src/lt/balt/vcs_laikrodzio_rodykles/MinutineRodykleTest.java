package lt.balt.vcs_laikrodzio_rodykles;

import org.junit.*;
import static org.junit.Assert.*;

public class MinutineRodykleTest {

	private MinutineRodykle testuojamaMinRodykle;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Klasės testavimo pradžia: MinutineRodykleTest");
	}

	@Before
	public void beforeTest() {
		testuojamaMinRodykle = new MinutineRodykle(5);
	}

	@Test
	public void testSkaiciuotiKampaTarpVertikalesIrRodykles() {
		double rezultatas = testuojamaMinRodykle.skaiciuotiKampaTarpVertikalesIrRodykles();
		assertEquals(30, rezultatas, 0.01);
	}

	@After
	public void afterTest() {
		testuojamaMinRodykle = null;
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Klasės testavimo pabaiga: MinutineRodykleTest");
	}

}
