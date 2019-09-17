/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistance;

/**
 *
 * @author pluca
 */
import com.sun.istack.internal.NotNull;
import java.net.URL;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity

public class Akkademician {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    protected String FirstName;
    @NotNull
    protected String LastName;
    
    protected String City;
    
    protected String OfficeAddress;
    
    protected String Email;
    
    protected String Country;
    
    protected String PhoneNumber;
    
    protected int Wave;
    
    protected String Nationality;
    
    protected String Degree;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] Photo;
    
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(String OfficeAddress) {
        this.OfficeAddress = OfficeAddress;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getWave() {
        return Wave;
    }

    public void setWave(int Wave) {
        this.Wave = Wave;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public byte[] getPhoto() {
        return Photo;
    }

    public void setPhoto(byte[] Photo) {
        this.Photo = Photo;
    }
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}