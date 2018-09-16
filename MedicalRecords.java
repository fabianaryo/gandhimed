/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalrecords;

import java.sql.*;
/**
 *
 * @author Aryo
 */
public class MedicalRecords {
    
    double calcBMI(double weight, double height) //Body Mass Index
    {
        double BMI = weight/Math.pow((height/100),2);
        return BMI;
    }
    
    String categoriesBMI(double BMI)
    {
        if(BMI < 18.5)
        {
            return "Underweight";
        }
        
        else if(BMI < 25)
        {
            return "Normal";
        }
        
        else if(BMI < 30 )
        {
            return "Overweight";
        }
        
        else
        {
            return "Obese";
        }
    }
    
    double calcBMR(String gender ,double weight, double height, double age) //Basal Metabolic Rate
    {
        if(gender.equalsIgnoreCase("Female"))
        {
            double BMR = (10 * weight) + (6.25 * height) - (5 * age) - 161;
            return BMR;
        }
        
        else
        {
            double BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            return BMR;
        }
    }
    
    double calcRecIntake(double BMR, int activity)
    {
        if(activity == 0)
        {
            return BMR * 1.2;
        }
    
        else if(activity == 1)
        {
            return BMR * 1.375;
        }
        
        else if(activity == 2)
        {
            return BMR * 1.55;
        }
        
        else if(activity == 3)
        {
            return BMR * 1.725;
        }
        
        else 
        {
            return BMR * 1.9;
        }
    }
}
