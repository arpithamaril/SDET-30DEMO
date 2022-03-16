import org.testng.annotations.Test;

public class JenkinParameterizedTest
{
	@Test
	public void jenkin()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
