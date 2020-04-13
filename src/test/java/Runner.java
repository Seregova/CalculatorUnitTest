import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        TestNG testNg = new TestNG();
        testNg.addListener(new TestListeners());

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("src/test/resources/testng.xml"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNg.setXmlSuites(suites);

        testNg.run();
}
}