/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.BookDonationDepartmentRole;
import Business.Role.NGOBookDepartmentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class NGOBookOrganization extends Organization {
    
    public NGOBookOrganization() {
        super(Organization.Type.NGOBookDepartment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOBookDepartmentRole());
        return roles;
    }
}
