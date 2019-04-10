package lt.balt.vcs_laikrodzio_rodykles;

import org.junit.*;
import static org.junit.Assert.*;

public class ValandineRodykleTest {

	private ValandineRodykle testuojamaValRodykle;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Klasės testavimo pradžia: ValandineRodykleTest");
	}

	@Before
	public void beforeTest() {
		testuojamaValRodykle = new ValandineRodykle(5);
	}

	@Test
	public void testSkaiciuotiKampaTarpVertikalesIrRodykles() {
		double rezultatas = testuojamaValRodykle.skaiciuotiKampaTarpVertikalesIrRodykles();
		assertEquals(150, rezultatas, 0.01);
	}

	@After
	public void afterTest() {
		testuojamaValRodykle = null;
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Klasės testavimo pabaiga: ValandineRodykleTest");
	}

}
