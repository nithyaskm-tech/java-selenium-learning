package org.openqa.selenium.chrome;

import java.util.List;

import org.openqa.selenium.WebElement;

public @interface ChromeDriver {

	void get(String string);

	List<WebElement> findElements(Object tagName);

	void quit();

}
