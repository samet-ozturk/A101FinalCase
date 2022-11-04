package casestudy.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Helper {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void addTwoDifferentProducts(String element){
        List<WebElement> elements = Driver.get().findElements(By.cssSelector(element));

        for(WebElement e : elements) {
            e.click();
            Driver.get().findElement(By.cssSelector(".checkoutui-Modal-iHhyy79iR28NvF33vKJb")).click();
        }
    }


    public static String getProductNameInBasket(){
        List<WebElement> productTitles = Driver.get().findElements(By.cssSelector(".product_name_3Lh3t"));

        return  productTitles.get(1).getText();
    }

}
