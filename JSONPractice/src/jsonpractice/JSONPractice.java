
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jsonpractice;

/**
 *
 * @author ejozogg
 */
public class JSONPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    MyJSONParser ethan = new MyJSONParser();
    ethan.parseJSON("employees.json");
    }

}