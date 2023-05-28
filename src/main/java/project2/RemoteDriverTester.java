
package project2;
public class RemoteDriverTester {


    public static void main(String[] args) {

        RemoteWebDriver[] webDriver = {new ChromeDriver(), new FireFoxDriver(), new Safari()
        };

        for (RemoteWebDriver webDrivers : webDriver) {

            webDrivers.open();
            webDrivers.close();
            webDrivers.getTitle();
            webDrivers.navigate();
            System.out.println();
        }
    }
}


