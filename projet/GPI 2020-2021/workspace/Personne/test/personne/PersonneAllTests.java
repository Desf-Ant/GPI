package personne;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PersonneTest.class, personneTestParameterized.class })
public class PersonneAllTests {
	
}
