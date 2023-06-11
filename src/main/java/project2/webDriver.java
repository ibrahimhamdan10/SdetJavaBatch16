

package project2;



public interface webDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends webDriver{
    void navigate();
  }

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("close ChromeDriver");
    }

    @Override
    public String getTitle() {
        return "ChromeDriver";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to ChromeDriver");
    }
}

class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open FireFoxDriver");
    }

    @Override
    public void close() {
        System.out.println("close FireFoxDriver");
    }

    @Override
    public String getTitle() {
        return "FireFoxDriver";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to FireFoxDriver");
    }
}

class Safari implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open Safari");
    }

    @Override
    public void close() {
        System.out.println("close Safari");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to Safari");
    }
}




/*Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
<<<<<<< HEAD:src/main/java/project2/webDriver.java
SafariDriver classes and see which methods available to them.*/


