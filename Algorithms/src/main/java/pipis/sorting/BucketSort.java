package pipis.sorting;

import java.util.ArrayList;
import java.util.List;
import static pipis.MainClass.mainMenu;
import pipis.entity.RandomTShirt;
import pipis.enums.Color;
import pipis.enums.Fabric;
import pipis.enums.Size;

public class BucketSort {

    public List<RandomTShirt>[] sort(List<RandomTShirt> list, int property) {

        int sizeBuckets = Size.values().length;
        int colorBuckets = Color.values().length;
        int fabricBuckets = Fabric.values().length;

        List<RandomTShirt>[] arrayOfLists = null; // to metafero mesa sto swutch

        switch (property) {
            case 1:
                arrayOfLists = new ArrayList[colorBuckets];
                for (int i = 0; i < colorBuckets; i++) {
                    arrayOfLists[i] = new ArrayList<RandomTShirt>();
                }
                for (RandomTShirt tShirt : list) {
                    arrayOfLists[tShirt.getColor().ordinal()].add(tShirt);
                }
                break;
            case 2:
                arrayOfLists = new ArrayList[sizeBuckets];
                for (int i = 0; i < sizeBuckets; i++) {
                    arrayOfLists[i] = new ArrayList<RandomTShirt>();
                }
                for (RandomTShirt tShirt : list) {
                    arrayOfLists[tShirt.getSize().ordinal()].add(tShirt);
                }

                break;
            case 3:
                arrayOfLists = new ArrayList[fabricBuckets];
                for (int i = 0; i < fabricBuckets; i++) {
                    arrayOfLists[i] = new ArrayList<RandomTShirt>();
                }
                for (RandomTShirt tShirt : list) {
                    arrayOfLists[tShirt.getFabric().ordinal()].add(tShirt);
                }

                break;
            case 4:
                List<RandomTShirt> finalSortingResult = new ArrayList<>();
                arrayOfLists = new ArrayList[sizeBuckets];
                for (int i = 0; i < sizeBuckets; i++) {
                    arrayOfLists[i] = new ArrayList<RandomTShirt>();
                }
                for (RandomTShirt tShirt : list) {
                    arrayOfLists[tShirt.getSize().ordinal()].add(tShirt);
                }
                for (List<RandomTShirt> sortingTemp : arrayOfLists) { //  arrayOfLists prepei na to kanw gia kathe list 
                    BubbleSort b = new BubbleSort();
                    b.sort(sortingTemp, 4);
                }
                for (List<RandomTShirt> finalSorting : arrayOfLists) {
                    for (RandomTShirt ts : finalSorting) {
                        finalSortingResult.add(ts);
                    }
                }
                break;
            default:
                System.out.println("Wrong input. Returning to home page...");
                mainMenu();

        }

        return (arrayOfLists);
    }

    public void print(List<RandomTShirt> list, List<RandomTShirt>[] arrayOfLists, int bucketsNumber, boolean sortingType) {
        System.out.println("================Original List================");
        for (RandomTShirt l : list) {
            System.out.println(l);
        }
        System.out.println("=============================================");

        System.out.println("\n================Sorted List================");

        if (sortingType) {
            for (int i = 0; i < bucketsNumber; i++) { // noOfBuckets
                for (int j = 0; j < arrayOfLists[i].size(); j++) {
                    System.out.println(arrayOfLists[i].get(j));
                }
            }
        } else {
            for (int i = bucketsNumber - 1; i >= 0; i--) { // noOfBuckets
                for (int j = 0; j < arrayOfLists[i].size(); j++) {
                    System.out.println(arrayOfLists[i].get(j));
                }
            }
        }
        System.out.println("=============================================");
    }

}
