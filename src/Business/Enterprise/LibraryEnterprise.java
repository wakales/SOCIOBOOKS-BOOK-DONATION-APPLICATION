/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class LibraryEnterprise extends Enterprise{
    
    public LibraryEnterprise(String name){
        super(name,EnterpriseType.Library);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
