package com.qait.demo.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;

/**
 * Created by anilsingh on 07-07-2017.
 */
public class HomePageAction extends GetPage {
	public HomePageAction(WebDriver driver) {
		super(driver, "InboxPage");
	}

	public void searchDetails() {
		isElementDisplayed("txt_searchbox");
		element("txt_searchbox").clear();
		element("txt_searchbox").sendKeys(YamlReader.getData("search"));
		isElementDisplayed("btn_searchbox");
		element("btn_searchbox").click();

	}

	public void move() throws InterruptedException

	{
		wait.hardWait(2);
		String i = elements("no_of_msg ").get(1).getText();
		isElementDisplayed("no_of_msg ");
		String j = elements("no_of_msg ").get(2).getText();
		int a = Integer.parseInt(i);
		int b = Integer.parseInt(j);
		while (a <= b) {
			
			wait.hardWait(2);
			
			element("select_all_msg").click();
			element("btn_label").click();
			element("btn_Test").click();
			element("btn_apply").click();
			if (a == b) {
				break;
			}
			element("btn_next").click();
			
			wait.hardWait(2);

			i = elements("no_of_msg ").get(1).getText();
			j = elements("no_of_msg ").get(2).getText();
			a = Integer.parseInt(i);
			b = Integer.parseInt(j);
		}
	}

}