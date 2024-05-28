package com.Book_lounge.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntranceExam_page 
{
	@FindBy(name="keyword")
	private WebElement SearchTextField;
	@FindBy(id="select")
	private WebElement SortByFilter;
	
	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	public WebElement getSortByFilter() {
		return SortByFilter;
	}
	
	
}
