/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a color code");
    double color = in.nextDouble();
    String result = "";
    if (color >= 380 && color < 450) {
      result = "Violet";
    } else if (color >= 450 && color < 495) {
      result = "Blue";
    } else if (color >= 495 && color < 570) {
      result = "Green";
    } else if (color >= 570 && color < 590) {
      result = "Yellow";
    } else if (color >= 590 && color < 620) {
      result = "Orange";
    } else if (color >= 620 && color <= 750) {
      result = "Red";
    } else {
      result = "The entered wavelength is not a part of the visible spectrum";
    }
    System.out.println((result.startsWith("The") ? result : "The color is " + result));
    in.close();
  }

}
