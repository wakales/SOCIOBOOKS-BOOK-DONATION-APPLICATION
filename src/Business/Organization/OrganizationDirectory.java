/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    private String name;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.LibraryBookDonationDepartment.getValue())){
            organization = new BookDonationDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LibraryAdmin.getValue())){
            organization = new BookDonationDepartmentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGOBookDepartment.getValue())){
            organization = new NGOBookOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LibraryStaff.getValue())){
            organization = new LibraryStaffOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGOStaff.getValue())){
            organization = new NGOStaff();
            organizationList.add(organization);
        }
        return organization;
    }
}