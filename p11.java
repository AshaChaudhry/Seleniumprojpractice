package WdDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p11 {
    public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","C:\\Users\\Tej\\IdeaProjects\\software\\driver\\msedgedriver.exe");
        WebDriver cc=new EdgeDriver();
        cc.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
    }

}
