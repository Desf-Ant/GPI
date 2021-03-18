package triangle;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Suite de test permettant de lancer l'ensemble des tests de Triangle.
 * 
 * @author Camille Constant
 * @version 1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TriangleTest.class, TriangleTestParameterized.class})
public class TriangleAllTests {

}
