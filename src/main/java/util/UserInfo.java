/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import data.model.User;

/**
 *
 * @author zjohn
 */
public class UserInfo {
    private User user;
    private boolean autorized;

    public UserInfo() {
    }

    public UserInfo(User user, boolean autorized) {
        this.user = user;
        this.autorized = autorized;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isAutorized() {
        return autorized;
    }

    public void setAutorized(boolean autorized) {
        this.autorized = autorized;
    }
    
    
    
}
