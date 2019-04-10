package lt.balt.vcs_laikrodzio_rodykles;

import org.junit.*;
import static org.junit.Assert.*;

public class RodyklinisLaikrodisTest {

	private RodyklinisLaikrodis testuojamasRodyklinisLaikrodis1;
	private RodyklinisLaikrodis testuojamasRodyklinisLaikrodis2;
	private RodyklinisLaikrodis testuojamasRodyklinisLaikrodis3;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Klasės testavimo pradžia: RodyklinisLaikrodisTest");
	}

	@Before
	public void beforeTest() {
		testuojamasRodyklinisLaikrodis1 = new RodyklinisLaikrodis();
		testuojamasRodyklinisLaikrodis2 = new RodyklinisLaikrodis(1, 10);
		testuojamasRodyklinisLaikrodis3 = new RodyklinisLaikrodis(2, 55);
	}

	@Test
	public void testSkaiciuotiKampaTarpLaikrodzioRodykliu() {
		double rezultatas1 = testuojamasRodyklinisLaikrodis1.skaiciuotiKampaTarpLaikrodzioRodykliu();
		assertEquals(0, rezultatas1, 0.01);
		double rezultatas2 = testuojamasRodyklinisLaikrodis2.skaiciuotiKampaTarpLaikrodzioRodykliu();
		assertEquals(25, rezultatas2, 0.01);
		double rezultatas3 = testuojamasRodyklinisLaikrodis3.skaiciuotiKampaTarpLaikrodzioRodykliu();
		assertEquals(117.5, rezultatas3, 0.01);
	}

	@After
	public void afterTest() {
		testuojamasRodyklinisLaikrodis1 = null;
		testuojamasRodyklinisLaikrodis2 = null;
		testuojamasRodyklinisLaikrodis3 = null;
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Klasės testavimo pabaiga: RodyklinisLaikrodisTest");
	}

}
