/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalrecords;

/**
 *
 * @author Aryo
 */
class Data {
    private String firstName, lastName, email, gender, categories, activity, symptoms, grade;
    private double BMI, BMR, calories;
    private int ID, age, height, weight;
    
    public Data(int uID, String fName, String lName, String uEmail, int uAge, String uGrade, String uGender, int uHeight, int uWeight, double uBMI, String uCategories, double uBMR, String uActivity, double uCalories, String uSymptoms)
    {
        this.ID = uID;
        this.firstName = fName;
        this.lastName = lName;
        this.email = uEmail;
        this.age = uAge;
        this.grade = uGrade;
        this.gender = uGender;
        this.height = uHeight;
        this.weight = uWeight;
        this.BMI = uBMI;
        this.categories = uCategories;
        this.BMR = uBMR;
        this.activity = uActivity;
        this.calories = uCalories; 
        this.symptoms = uSymptoms;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public String getFName()
    {
        return firstName;
    }
    
    public String getLName()
    {
        return lastName;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public String getCategories()
    {
        return categories;
    }
    
    public String getActivity()
    {
        return activity;
    }
    
    public double getBMI()
    {
        return BMI;
    }
    
    public double getBMR()
    {
        return BMR;
    }
    
    public double getCalories()
    {
        return calories;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public int getAge()
    {
        return age;
    }
   
    public String getGrade()
    {
        return grade;
    }
    
    public String getSymptoms()
    {
        return symptoms;
    }
}
