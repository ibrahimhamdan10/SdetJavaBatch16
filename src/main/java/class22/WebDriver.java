package class22;

public  abstract class WebDriver {

    abstract void openBrowser();
    abstract void loudUrl(String url);
    abstract void performTesting();
    abstract void closeBrowser();
}
class chromeDriver extends WebDriver{


    @Override
    void openBrowser() {
        System.out.println("opening google chrome");
    }

    @Override
    void loudUrl(String url) {
        System.out.println("loading website "+url);
    }

    @Override
    void performTesting() {

    }

    @Override
    void closeBrowser() {

    }
}
