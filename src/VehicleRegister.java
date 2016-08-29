/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aidan
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        //, which adds the parameter owner of the car which corresponds to the 
        // parameter registration plate. The method returns true if the car had 
        // no owner;
        // if the car had an owner already, the method returns false and it 
        // doesn't do anything
        if (this.owners.containsKey(plate)) {
            return false;
        }
        this.owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        // , which returns the car owner which corresponds to the parameter 
        // register number. If the car was not registered, it returns null
        if (this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        }
        return null;

    }

    public boolean delete(RegistrationPlate plate) {
        //, which delete the information connected to the parameter registration 
        // plate. The method returns true if the information was deleted, and 
        // false if there was no information connetted to the parameter in the 
        // register.
        if (!this.owners.containsKey(plate)) {
            return false;
        }
        this.owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate r : this.owners.keySet()) {
            System.out.println(r);
        }
    }

    public void printOwners() {
        ArrayList<String> names = new ArrayList<String>();
        for (RegistrationPlate r : this.owners.keySet()) {
            String currentName = this.get(r);
            if (!names.contains(currentName)) {
                names.add(currentName);
            }

        }
        for (String n : names) {
            System.out.println(n);
        }
    }
}
