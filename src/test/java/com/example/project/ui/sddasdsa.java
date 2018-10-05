package com.example.project.ui;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Text;
import com.example.project.ui.pagewidgets.*;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Simple Selenide Test with PageObjects
 */
public class sddasdsa

{
    @Test
    public void searchForSemlenide() {

        // Assert
        open( "https://preuat.certemy.com/entry/login");
        $( "#email").sendKeys("uladzislau.piatkevich@leverx.com");
        $( "#password").setValue("Password1!");
        $(".btn.ch-button").click();
        $(".menu-button__title").click();
        $x("/html/body/certemy/cm-sidebar/div/cm-organization/cm-header/div/div/div[2]/div/ul/li/a[2]").click();
        $x("/html/body/ngb-modal-window/div/div/ngb-custom-modal/div/cm-invite-user-simple/div[1]/form/div[1]/div/cm-user-row/div/div[1]/input").sendKeys("andrew");
        $x("/html/body/ngb-modal-window/div/div/ngb-custom-modal/div/cm-invite-user-simple/div[1]/form/div[1]/div/cm-user-row/div/div[2]/input").sendKeys("brew");
        $x("/html/body/ngb-modal-window/div/div/ngb-custom-modal/div/cm-invite-user-simple/div[1]/form/div[1]/div/cm-user-row/div/div[3]/input").sendKeys("lfc@1blackmoon.com");
        $x("/html/body/ngb-modal-window/div/div/ngb-custom-modal/div/cm-invite-user-simple/div[2]/button[2]").click();
        $(".menu-button__title").click();
        $x("/html/body/certemy/cm-sidebar/div/cm-organization/cm-header/div/div/div[2]/div/ul/li/a[1]").click();
        $(".btn btn-info").click();
        $x("/html/body/certemy/cm-sidebar/div/cm-organization/cm-mobile-placeholder/div/users/div/div[2]/div/div/div/ez-table/table/tbody/tr[1]/td[4]").shouldHave((text("andrew brew")));
    }
}
