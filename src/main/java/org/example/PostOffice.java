package org.example;

import org.example.enums.BoxType;
import org.example.model.Box;
import org.example.model.Letter;
import org.example.model.PostableItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    private List<Letter> letters = new ArrayList<>();
    private List<Box> boxes = new ArrayList<>();

    public void addLetter(Letter letter) {
        letters.add(letter);
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public void getItemByDate(LocalDate date) {
        List<PostableItem> itemsByDate = new ArrayList<>();
        for (Letter letter : letters) {
            if (letter.getPostedDate().equals(date)) {
                itemsByDate.add(letter);
            }
        }
        for (Box box : boxes) {
            if (box.getPostedDate().equals(date)) {
                itemsByDate.add(box);
            }
        }
        System.out.println(itemsByDate);
    }

    public double calculateTotalIncomeOfLetters() {
        return letters.stream()
                .mapToDouble(Letter::getPRICE)
                .sum();
    }

    public double calculateTotalIncomeOfBoxex(BoxType boxType) {
        return boxes.stream()
                .filter(box -> box.getBoxType().equals(boxType))
                .mapToDouble(Box::getPrice)
                .sum();
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public List<Box> getBoxes() {
        return boxes;
    }
}
