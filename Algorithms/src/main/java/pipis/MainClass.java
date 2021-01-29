package pipis;

import java.util.List;
import java.util.Scanner;
import static pipis.MainClass.sc;
import pipis.entity.RandomTShirt;
import pipis.enums.Color;
import pipis.enums.Fabric;
import pipis.enums.Size;
import pipis.sorting.BubbleSort;
import pipis.sorting.BucketSort;
import pipis.sorting.QuickSort;

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("=============================================");
        System.out.println("1. Bubble Sort menu");
        System.out.println("2. Quick Sort menu");
        System.out.println("3. Bucket Sort menu");
        System.out.println("4. Exit.");
        System.out.println("=============================================");
        System.out.println("Write here: ");
        String input = sc.next();
        switch (input) {
            case ("1"):
                bubbleMenu();
                break;
            case ("2"):
                quickMenu();
                break;
            case ("3"):
                bucketMenu();
                break;
            case ("4"):
                System.out.println("See you next time!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input. Returning to home page...");
                mainMenu();
        }

    }

    public static void quickMenu() {
        RandomTShirt r = new RandomTShirt();
        List<RandomTShirt> list = r.createList(40);

        QuickSort qs = new QuickSort();

        System.out.println("=============================================");
        System.out.println("1. Quick Sort by Size ascending");
        System.out.println("2. Quick Sort by Size descending");
        System.out.println("3. Quick Sort by Color ascending");
        System.out.println("4. Quick Sort by Color descending");
        System.out.println("5. Quick Sort by Fabric ascending");
        System.out.println("6. Quick Sort by Fabric descending");
        System.out.println("7. Quick Sort by Size and Color and Fabric ascending");
        System.out.println("8. Quick Sort by Size and Color and Fabric descending");
        System.out.println("9. Back");
        System.out.println("=============================================");
        System.out.println("Write here: ");
        String input = sc.next();
        switch (input) {
            case ("1"):
                qs.print(list, 2, 0, list.size() - 1, true);
//                qs.printList(qs.sort(list, 2, 0, list.size() - 1), true);
                break;
            case ("2"):
                qs.print(list, 2, 0, list.size() - 1, false);
                break;
            case ("3"):
                qs.print(list, 1, 0, list.size() - 1, true);
                break;
            case ("4"):
                qs.print(list, 1, 0, list.size() - 1, false);
                break;
            case ("5"):
                qs.print(list, 3, 0, list.size() - 1, true);
                break;
            case ("6"):
                qs.print(list, 3, 0, list.size() - 1, false);
                break;
            case ("7"):
                qs.print(list, 4, 0, list.size() - 1, true);
                break;
            case ("8"):
                qs.print(list, 4, 0, list.size() - 1, false);
                break;
            case ("9"):
                mainMenu();
                break;
            default:
                System.out.println("Wrong input. Returning to home page...");
                mainMenu();
        }
    }

    public static void bubbleMenu() {

        RandomTShirt r = new RandomTShirt();
        List<RandomTShirt> list = r.createList(40);

        BubbleSort bs = new BubbleSort();

        System.out.println("=============================================");
        System.out.println("1. Bubble Sort by Size ascending");
        System.out.println("2. Bubble Sort by Size descending");
        System.out.println("3. Bubble Sort by Color ascending");
        System.out.println("4. Bubble Sort by Color descending");
        System.out.println("5. Bubble Sort by Fabric ascending");
        System.out.println("6. Bubble Sort by Fabric descending");
        System.out.println("7. Bubble Sort by Size and Color and Fabric ascending");
        System.out.println("8. Bubble Sort by Size and Color and Fabric descending");
        System.out.println("9. Back");
        System.out.println("=============================================");
        System.out.println("Write here: ");
        String input = sc.next();
        switch (input) {
            case ("1"):
                bs.printList(list, 2, true);
                break;
            case ("2"):
                bs.printList(list, 2, false);
                break;
            case ("3"):
                bs.printList(list, 1, true);
                break;
            case ("4"):
                bs.printList(list, 1, false);
                break;
            case ("5"):
                bs.printList(list, 3, true);
                break;
            case ("6"):
                bs.printList(list, 3, false);
                break;
            case ("7"):
                bs.printList(list, 4, true);
                break;
            case ("8"):
                bs.printList(list, 4, false);
                break;
            case ("9"):
                mainMenu();
                break;
            default:
                System.out.println("Wrong input. Returning to home page...");
                mainMenu();
        }
    }

    public static void bucketMenu() {
        RandomTShirt r = new RandomTShirt();
        List<RandomTShirt> list = r.createList(40);

        BucketSort b = new BucketSort();
        System.out.println("=============================================");
        System.out.println("1. Bucket Sort by Size ascending");
        System.out.println("2. Bucket Sort by Size descending");
        System.out.println("3. Bucket Sort by Color ascending");
        System.out.println("4. Bucket Sort by Color descending");
        System.out.println("5. Bucket Sort by Fabric ascending");
        System.out.println("6. Bucket Sort by Fabric descending");
        System.out.println("7. Bucket Sort by Size and Color and Fabric ascending");
        System.out.println("8. Bucket Sort by Size and Color and Fabric descending");
        System.out.println("9. Back");
        System.out.println("=============================================");
        System.out.println("Write here: ");
        String input = sc.next();
        switch (input) {
            case ("1"):
                b.print(list, b.sort(list, 2), Size.values().length, true);
                break;
            case ("2"):
                b.print(list, b.sort(list, 2), Size.values().length, false);
                break;
            case ("3"):
                b.print(list, b.sort(list, 1), Color.values().length, true);
                break;
            case ("4"):
                b.print(list, b.sort(list, 1), Color.values().length, false);
                break;
            case ("5"):
                b.print(list, b.sort(list, 3), Fabric.values().length, true);
                break;
            case ("6"):
                b.print(list, b.sort(list, 3), Fabric.values().length, false);
                break;
            case ("7"):
                b.print(list, b.sort(list, 4), Size.values().length, true);
                break;
            case ("8"):
                b.print(list, b.sort(list, 4), Size.values().length, false);
                break;
            case ("9"):
                mainMenu();
                break;
            default:
                System.out.println("Wrong input. Returning to home page...");
                mainMenu();
        }

    }
}
