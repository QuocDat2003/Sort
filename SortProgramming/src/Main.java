
import common.Library;
import controller.SortProgramming;
import model.Element;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getIntForMenu("Enter number of array: ", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.getSize_array()));
        new SortProgramming(element).run();
    }
}