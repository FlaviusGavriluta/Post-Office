package org.example;

import org.example.enums.BoxType;
import org.example.model.Box;
import org.example.model.Letter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Letter myLetter = new Letter("Bucharest");

        System.out.println(myLetter.getPRICE());
        System.out.println(myLetter);

        Letter firstLetter = new Letter("Paris");
        Letter firstLetter2 = new Letter("Paris");
        Box firstBox = new Box("London", 2000, BoxType.BIG);
        Box firstBox1 = new Box("London", 100, BoxType.SMALL);
        Box firstBox2 = new Box("London", 1000, BoxType.BIG);
        Box firstBox3 = new Box("London", 300, BoxType.SMALL);

        System.out.println("--------------------------");

        PostOffice postOffice = new PostOffice();
        postOffice.addLetter(firstLetter);
        postOffice.addLetter(firstLetter2);
        postOffice.addBox(firstBox);
        postOffice.addBox(firstBox1);
        postOffice.addBox(firstBox2);
        postOffice.addBox(firstBox3);

//        System.out.println(postOffice.getLetters());
//        System.out.println(postOffice.getBoxes());

        postOffice.getItemByDate(LocalDate.now());
//        postOffice.getItemByDate(LocalDate.parse("2023-09-15"));

        System.out.println(postOffice.calculateTotalIncomeOfLetters());
        System.out.println(postOffice.calculateTotalIncomeOfBoxex(BoxType.SMALL));
        System.out.println(postOffice.calculateTotalIncomeOfBoxex(BoxType.BIG));
    }
}