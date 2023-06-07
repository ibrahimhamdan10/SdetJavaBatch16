package review11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class e9 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        System.out.println(Collections.frequency(numbers,50));
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);

        int [] arr=new int[10];
        Arrays.fill(arr,50);
        System.out.println(Arrays.toString(arr));



    }
}
