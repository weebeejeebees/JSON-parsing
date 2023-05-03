/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonpractice;

import java.io.File;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class MyJSONParser {
    public void parseJSON(String fileName) {
        
        // Places the directory of the JSON file in inputFile
        File inputFile = new File("C:\\Users\\ejozogg\\Documents\\NetBeansProjects\\JSONPractice\\src\\jsonpractice\\" + fileName);

        try {
            // Created JSON parser object
            JSONParser parser = new JSONParser();
            
            // Parses inputFile into an Object
            Object obj = parser.parse(new FileReader(inputFile));
            
            // Converts the Object into a JSONObject
            JSONObject jsonObject = (JSONObject) obj;
            
            // Gets the JSONArray with the key "users" from the JSONObject
            JSONArray array = (JSONArray) jsonObject.get("users");

            // Prints out the header rows with the format of 15 spaces in between
            System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "ID", "First Name", "Last Name", "Phone number", "Email");

            // Loops through each object in the JSONArray and extracts the necessary fields
            for (Object employeeObj : array) {
                JSONObject employee = (JSONObject) employeeObj;
                long id = (long) employee.get("userId");
                String firstName = (String) employee.get("firstName");
                String lastName = (String) employee.get("lastName");
                String phoneNumber = (String) employee.get("phoneNumber");
                String emailAddress = (String) employee.get("emailAddress");

                // Prints out the extracted fields with the format of 15 spaces in between
                System.out.printf("%-15d %-15s %-15s %-15s %-15s\n", id, firstName, lastName, phoneNumber, emailAddress);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



        
     
    

