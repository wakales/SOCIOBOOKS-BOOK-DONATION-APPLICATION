/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BookDonationDepartmentRole;
import Business.Role.Role;
import Business.Role.NGOStaffRole;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class NGOStaff extends Organization {
    
    public NGOStaff(String name) {
        super(name);
    }

    public NGOStaff() {
        super(Organization.Type.NGOStaff.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOStaffRole());
        return roles;
    }
}
