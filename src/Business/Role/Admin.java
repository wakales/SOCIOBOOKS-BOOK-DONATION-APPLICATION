/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Book.BookCatalogue;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdministrativeRole.AdminWorkAreaaJPanel;

/**
 *
 * @author Dell
 */
public class Admin extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,BookCatalogue bookCatalogue, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaaJPanel(userProcessContainer, enterprise);
    }
    
}
