package vn.pvtt.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;
import java.util.Set;

public class Main {
    WebDriver driver;
    public static int numberComfirm = 0;


    public void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
    }

    public void Account() throws InterruptedException {
        driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("0379825939");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("2709200311042001");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
     Thread.sleep(3000);
    }

    public void follow(String id) throws InterruptedException {
        driver.get(id);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='Xem thêm']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Theo dõi']")).click();
        Thread.sleep(3000);
    }

    public void Like(String link) throws InterruptedException {
        driver.get(link);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Thích')]")).click();
        Thread.sleep(3000);
        numberComfirm = 1;
    }

    public void yeuthichlike(String link) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(link);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Thích')]"));
        action.moveToElement(element).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label='Yêu thích']//div//canvas")).click();
        Thread.sleep(3000);

    }

    public void thuongthuonglike(String link) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(link);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Thích')]"));
        action.moveToElement(element).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label='Thương thương']//div//canvas")).click();
        Thread.sleep(3000);
    }

    public void hahalike(String link) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(link);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Thích')]"));
        action.moveToElement(element).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label='Haha']//div//canvas")).click();
        Thread.sleep(3000);
    }

    public void Wowlike(String link) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(link);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Thích')]"));
        action.moveToElement(element).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label='Wow']//div//canvas")).click();
        Thread.sleep(3000);
    }

    public void Buonlike(String link) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(link);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Thích')]"));
        action.moveToElement(element).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label='Buồn']//div//canvas")).click();
        Thread.sleep(3000);
    }

    public void phannolike(String link) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(link);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Thích')]"));
        action.moveToElement(element).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@aria-label='Phẫn nộ']//div//canvas")).click();
        Thread.sleep(3000);
    }
    public void comment (String link, String text) throws InterruptedException {
        driver.get(link);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='Viết bình luận']")).sendKeys( text);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@aria-label='Viết bình luận']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }
}