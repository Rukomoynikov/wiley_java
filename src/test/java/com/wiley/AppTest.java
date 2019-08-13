package com.wiley;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private String base_url = "https://www.wiley.com/en-us";
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void linksInMainMenu () {
        //        Then following links are displayed in the top menu
        ChromeDriver driver = new ChromeDriver();
        driver.get(base_url);
    }
}

//Feature: Main page
//Background:
//Given user opens main page
//And he closes change country modal
//
//Scenario: Main menu
//Then following links are displayed in the top menu
//
//Scenario: Submenu for who we serve
//Given items under "WHO WE SERVE" for sub-header
//Then there are 12 items under resources sub-header
//And titles are  “Students”, “Instructors”, “Book Authors”, “Professionals”, “Researchers”, “Institutions”, “Librarians”, “Corporations”, “Societies”, “Journal Editors”,  “Government”
//
//Scenario: Logo leads to main page
//Given user opens "Contacts" page
//And clicks on the Wiley logo at the top menu
//Then home page is opened