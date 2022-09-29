/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author swapn
 */
public class Product {
    
    /* Personal Information Panel Variable Declaration */
    private String Last_Name;
    private String First_Name;
    private String DOB;
    private String SSN;
    private String Age;
    private BufferedImage Biometric_Identifier;
    private BufferedImage Full_Face_Photo;
    private String UniqueIdentifier;
    
    /* Address Information Panel Variable Declaration */
    private String Street_Name;
    private String Apartment_Number;
    private String City;
    private String State;
    private String ZIP_Code;
    
    /* Contact Information Panel Variable Declaration */
    private String Country_Code;
    private String Local_Telephone_Number;
    private String Alternate_Telephone_Number;
    private String Fax_Number;
    private String Email_Address;
    private String Country;
    
    /*  Health Records Panel Variable Declaration */
    private String Medical_Record_Number;
    private String Health_Plan_Number;
    private String Other_Medical_History;
    
    /* Bank Records Panel Variable Declaration */
    private String Account_Type;
    private String Account_Owner;
    private String Account_Profile;
    private String Account_Holder_Name;
    private String Routing_Number;
    private String Account_Number;
    
    /* Vehicle/Device Information Variable Declaration */
    private String Vehicle_Identifier;
    private String License_Plate_Number;
    private String Vehicle_Model;
    private String Device_Identifier;
    private String Device_Serial_Number;
    private String Device_Name;
    
    /* Professional Network Information Panel Variable Declaration */
    private String LinkedIn_URL;
    private String IP_Address;

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /*public ImageIcon getBiometric_Identifier() {
        return Biometric_Identifier;
    }

    public void setBiometric_Identifier(ImageIcon Biometric_Identifier) {
        this.Biometric_Identifier = Biometric_Identifier;
    }

    public ImageIcon getFull_Face_Photo() {
        return Full_Face_Photo;
    }

    public void setFull_Face_Photo(ImageIcon Full_Face_Photo) {
        this.Full_Face_Photo = Full_Face_Photo;
    }*/

    public BufferedImage getBiometric_Identifier() {
        return Biometric_Identifier;
    }

    public void setBiometric_Identifier(BufferedImage Biometric_Identifier) {
        this.Biometric_Identifier = Biometric_Identifier;
    }

    public BufferedImage getFull_Face_Photo() {
        return Full_Face_Photo;
    }

    public void setFull_Face_Photo(BufferedImage Full_Face_Photo) {
        this.Full_Face_Photo = Full_Face_Photo;
    }
    
    

    public String getUniqueIdentifier() {
        return UniqueIdentifier;
    }

    public void setUniqueIdentifier(String UniqueIdentifier) {
        this.UniqueIdentifier = UniqueIdentifier;
    }

    public String getStreet_Name() {
        return Street_Name;
    }

    public void setStreet_Name(String Street_Name) {
        this.Street_Name = Street_Name;
    }

    public String getApartment_Number() {
        return Apartment_Number;
    }

    public void setApartment_Number(String Apartment_Number) {
        this.Apartment_Number = Apartment_Number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZIP_Code() {
        return ZIP_Code;
    }

    public void setZIP_Code(String ZIP_Code) {
        this.ZIP_Code = ZIP_Code;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCountry_Code() {
        return Country_Code;
    }

    public void setCountry_Code(String Country_Code) {
        this.Country_Code = Country_Code;
    }

    public String getLocal_Telephone_Number() {
        return Local_Telephone_Number;
    }

    public void setLocal_Telephone_Number(String Local_Telephone_Number) {
        this.Local_Telephone_Number = Local_Telephone_Number;
    }

    public String getAlternate_Telephone_Number() {
        return Alternate_Telephone_Number;
    }

    public void setAlternate_Telephone_Number(String Alternate_Telephone_Number) {
        this.Alternate_Telephone_Number = Alternate_Telephone_Number;
    }

    public String getFax_Number() {
        return Fax_Number;
    }

    public void setFax_Number(String Fax_Number) {
        this.Fax_Number = Fax_Number;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    public String getMedical_Record_Number() {
        return Medical_Record_Number;
    }

    public void setMedical_Record_Number(String Medical_Record_Number) {
        this.Medical_Record_Number = Medical_Record_Number;
    }

    public String getHealth_Plan_Number() {
        return Health_Plan_Number;
    }

    public void setHealth_Plan_Number(String Health_Plan_Number) {
        this.Health_Plan_Number = Health_Plan_Number;
    }

    public String getOther_Medical_History() {
        return Other_Medical_History;
    }

    public void setOther_Medical_History(String Other_Medical_History) {
        this.Other_Medical_History = Other_Medical_History;
    }

    public String getAccount_Type() {
        return Account_Type;
    }

    public void setAccount_Type(String Account_Type) {
        this.Account_Type = Account_Type;
    }

    public String getAccount_Owner() {
        return Account_Owner;
    }

    public void setAccount_Owner(String Account_Owner) {
        this.Account_Owner = Account_Owner;
    }

    public String getAccount_Profile() {
        return Account_Profile;
    }

    public void setAccount_Profile(String Account_Profile) {
        this.Account_Profile = Account_Profile;
    }

    

    
    
    public String getAccount_Holder_Name() {
        return Account_Holder_Name;
    }

    public void setAccount_Holder_Name(String Account_Holder_Name) {
        this.Account_Holder_Name = Account_Holder_Name;
    }

    public String getRouting_Number() {
        return Routing_Number;
    }

    public void setRouting_Number(String Routing_Number) {
        this.Routing_Number = Routing_Number;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(String Account_Number) {
        this.Account_Number = Account_Number;
    }

    public String getVehicle_Identifier() {
        return Vehicle_Identifier;
    }

    public void setVehicle_Identifier(String Vehicle_Identifier) {
        this.Vehicle_Identifier = Vehicle_Identifier;
    }

    public String getLicense_Plate_Number() {
        return License_Plate_Number;
    }

    public void setLicense_Plate_Number(String License_Plate_Number) {
        this.License_Plate_Number = License_Plate_Number;
    }

    public String getVehicle_Model() {
        return Vehicle_Model;
    }

    public void setVehicle_Model(String Vehicle_Model) {
        this.Vehicle_Model = Vehicle_Model;
    }

    public String getDevice_Identifier() {
        return Device_Identifier;
    }

    public void setDevice_Identifier(String Device_Identifier) {
        this.Device_Identifier = Device_Identifier;
    }

    public String getDevice_Serial_Number() {
        return Device_Serial_Number;
    }

    public void setDevice_Serial_Number(String Device_Serial_Number) {
        this.Device_Serial_Number = Device_Serial_Number;
    }

    public String getDevice_Name() {
        return Device_Name;
    }

    public void setDevice_Name(String Device_Name) {
        this.Device_Name = Device_Name;
    }

    public String getLinkedIn_URL() {
        return LinkedIn_URL;
    }

    public void setLinkedIn_URL(String LinkedIn_URL) {
        this.LinkedIn_URL = LinkedIn_URL;
    }

    public String getIP_Address() {
        return IP_Address;
    }

    public void setIP_Address(String IP_Address) {
        this.IP_Address = IP_Address;
    }
    
    
}
