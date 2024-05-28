package com.Book_lounge.objectRepository;
/**
 * @author Vivek
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText = " Entrance Exam ")
	private WebElement EmtranceExam_Link;

	@FindBy(linkText = " Literature & Fiction ")
	private WebElement LiteratureAndFiction_link;

	@FindBy(linkText = " Academic & Professional ")
	private WebElement AcademicAndProfessionallink;

	@FindBy(linkText = " Biographies & Auto Biographies ")
	private WebElement BiographiesAutoBiographiesLink;

	@FindBy(linkText = " Children & Teens ")
	private WebElement ChildrenAndTeensLink;

	@FindBy(linkText = " Regional Books ")
	private WebElement RegionalBooksLink;

	@FindBy(linkText = " Business & Management ")
	private WebElement BusinessAndManagementLink;

	@FindBy(linkText = " HealthAndCooking ")
	public WebElement HealthAndCookingLink;

	public WebElement getEmtranceExam_Link() {
		return EmtranceExam_Link;
	}

	public WebElement getLiteratureAndFiction_link() {
		return LiteratureAndFiction_link;
	}

	public WebElement getAcademicAndProfessionallink() {
		return AcademicAndProfessionallink;
	}

	public WebElement getBiographiesAutoBiographiesLink() {
		return BiographiesAutoBiographiesLink;
	}

	public WebElement getChildrenAndTeensLink() {
		return ChildrenAndTeensLink;
	}

	public WebElement getRegionalBooksLink() {
		return RegionalBooksLink;
	}

	public WebElement getBusinessAndManagementLink() {
		return BusinessAndManagementLink;
	}

	public WebElement getHealthAndCookingLink() {
		return HealthAndCookingLink;
	}
}
