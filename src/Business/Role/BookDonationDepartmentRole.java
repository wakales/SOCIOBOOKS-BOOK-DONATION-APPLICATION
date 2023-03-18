/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Book.BookCatalogue;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BookDonationDepartmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BookOrganizationDepartment.LibraryWorkAreaJPanel;

/**
 *
 * @author Dell
 */
public class BookDonationDepartmentRole extends Role {
   
    @Override
    public String toString(){
        return RoleType.LibraryBookDonationDepartment.getValue();
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,BookCatalogue bookCatalogue, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LibraryWorkAreaJPanel(userProcessContainer,bookCatalogue, account, (BookDonationDepartmentOrganization) organization, enterprise,business);
    }
}
