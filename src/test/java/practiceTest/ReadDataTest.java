package practiceTest;
import org.testng.annotations.Test;

public class ReadDataTest 
{
	@Test
		public void readdata()
		{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		}
	}
