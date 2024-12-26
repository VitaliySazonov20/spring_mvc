package com.sazonov.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    private String name;

    private String surname;

    private int salary;

    private String department;

    private final Map<String, String> departments;

    private String carBrand;

    private final Map<String,String> carBrands;

    private String[] languages;

    private final Map<String,String> languageList;

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");
        departments.put("LM","Liability Management");

        carBrands = new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("Nisan","Nisan");
        carBrands.put("Volkswagen","Volkswagen");

        languageList = new HashMap<>();
        languageList.put("EN","English");
        languageList.put("DE","Deutch");
        languageList.put("FR","French");
        languageList.put("RU","Russian");
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

    public Map<String, String> getDepartments() {
        return departments;
    }

}
