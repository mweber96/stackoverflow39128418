/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.test.stackoverflow39128418.navigation;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mweber
 */
@ManagedBean
@SessionScoped
public class NavigationBean implements Serializable {

    private String activePage;
    
    private String activeMenu;

    @PostConstruct
    public void init() {
        this.activePage = "workingPage1";
        this.activeMenu = "working";
    }

    public String getActivePage() {
        return "/pages/" + activePage + ".xhtml";
    }

    public void setActivePage(String activePage) {
        this.activePage = activePage;
    }

    public String getActiveMenu() {
        return "/pages/menues/" + this.activeMenu + "Menu.xhtml";
    }
    
    public void setActiveMenu(String activeMenu) {
        this.activeMenu = activeMenu;
        this.activePage = activeMenu + "Page1";
    }
}
