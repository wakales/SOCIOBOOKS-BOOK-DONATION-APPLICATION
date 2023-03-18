/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Book.BookCatalogue;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Delivery.Delivery;

/**
 *
 * @author Dell
 */
public class DeliveryRole extends Role {
    
    @Override
    public String toString(){
        return RoleType.DeliveryRole.getValue();
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,BookCatalogue bookCatalogue, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Delivery(userProcessContainer, account, (DeliveryOrganization)organization,enterprise, business);
    }
}
