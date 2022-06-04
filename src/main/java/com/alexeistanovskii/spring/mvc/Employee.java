package com.alexeistanovskii.spring.mvc;

import com.alexeistanovskii.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;


import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min =2, message = "name must be min 2 symbols")
    @Pattern(regexp = "[A-Z]*")
    private String name;
    @NotEmpty(message = "surname is required field")
    @NotBlank
    @Pattern(regexp = "[A-Z]*")
    private String surname;
    @Min(value=500, message = "must be greater then 500")
    @Max(value=2000, message = "must be lower then 2000")
    private int salary;
    private String department;
    private String country;
    private Map<String, String> countries;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map <String, String> languagesMap;
    @CheckEmail(value = "abc.com",message = "must ends with abc.com")
    private String email;
    @Pattern(regexp = "([+]\\d{11})|(\\d{11})", message = "Wrong number use eleven digits number or number with + first")
    private String phoneNumber;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public Employee() {
        countries = new HashMap<>();
        countries.put("ARG", "Argentina");
        countries.put("BRA", "Brazil");
        countries.put("MEX", "Mexico");
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");
        languagesMap = new HashMap<>();
        languagesMap.put("English", "Eng");
        languagesMap.put("French", "FR");
        languagesMap.put("Portuguese", "Por");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, String> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
