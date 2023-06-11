<<<<<<< HEAD:src/main/java/project2/RemoteDriverTester.java

package project2;
public class RemoteDriverTester {


    public static void main(String[] args) {

        RemoteWebDriver[] webDriver = {new ChromeDriver(), new FireFoxDriver(), new Safari()
        };

        for (RemoteWebDriver webDrivers : webDriver) {
=======
package project;

public class RemoteDriverTester {
    public static void main(String[] args) {

        RemoteWebDriver[]webDriver={ new ChromeDriver(), new FireFoxDriver(), new Safari()
        };

        for(RemoteWebDriver webDrivers:webDriver ){
>>>>>>> cbbcc966ea66f2efb3f7fd9675ac8798c69d979f:src/project/RemoteDriverTester.java

            webDrivers.open();
            webDrivers.close();
            webDrivers.getTitle();
            webDrivers.navigate();
            System.out.println();
        }
    }
}
<<<<<<< HEAD:src/main/java/project2/RemoteDriverTester.java


=======
>>>>>>> cbbcc966ea66f2efb3f7fd9675ac8798c69d979f:src/project/RemoteDriverTester.java
