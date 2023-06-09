/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Admin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class LibraryAdminOrganization extends Organization {
    
    public LibraryAdminOrganization() {
        super(Type.LibraryAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Admin());
        return roles;
    }
}
