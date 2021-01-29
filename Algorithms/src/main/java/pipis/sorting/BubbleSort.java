package pipis.sorting;

import java.util.ArrayList;
import java.util.List;
import pipis.entity.RandomTShirt;

public class BubbleSort {

    protected void sort(List<RandomTShirt> list, int property) { // boolean if true is asc

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                // Random t-shirts
                RandomTShirt r1 = list.get(j);
                RandomTShirt r2 = list.get(j + 1);

                // Index of random t-shirts
                int index1 = list.indexOf(r1);
                int index2 = list.indexOf(r2);

                // Properties of random t-shirts-color
                int color1 = list.get(j).getColor().ordinal();
                int color2 = list.get(j + 1).getColor().ordinal();

                // Properties of random t-shirts-size
                int size1 = list.get(j).getSize().ordinal();
                int size2 = list.get(j + 1).getSize().ordinal();

                // Properties of random t-shirts-fabric
                int fabric1 = list.get(j).getFabric().ordinal();
                int fabric2 = list.get(j + 1).getFabric().ordinal();

                switch (property) {
                    case 1:
                        if (color1 > color2) {
                            RandomTShirt temp = r1;
                            list.set(index1, r2);
                            list.set(index2, temp);
                        }
                        ;
                        break;
                    case 2:
                        if (size1 > size2) {
                            RandomTShirt temp = r1;
                            list.set(index1, r2);
                            list.set(index2, temp);
                        }
                        ;
                        break;
                    case 3:
                        if (fabric1 > fabric2) {
                            RandomTShirt temp = r1;
                            list.set(index1, r2);
                            list.set(index2, temp);
                        }
                        ;
                        break;
                    case 4:
                        if (size1 > size2) {
                            RandomTShirt temp = r1;
                            list.set(index1, r2);
                            list.set(index2, temp);
                        } else if (size1 == size2) {
                            if (fabric1 > fabric2) {
                                RandomTShirt temp = r1;
                                list.set(index1, r2);
                                list.set(index2, temp);
                            } else if (fabric1 == fabric2) {
                                if (color1 > color2) {
                                    RandomTShirt temp = r1;
                                    list.set(index1, r2);
                                    list.set(index2, temp);
                                }
                            }
                        }
                        break;
                }
            }
        }

    }

    public void printList(List<RandomTShirt> list, int property, boolean sortingType ) {
        System.out.println("================Original List================");
        for (RandomTShirt l : list) {
            System.out.println(l);
        }
        System.out.println("=============================================");

        System.out.println("\n================Bubble Sort List================");
        sort(list, property);
        List<RandomTShirt> l = list;
        List<RandomTShirt> reverseList; // Creating a temp reverse list
        if (!sortingType) {
            reverseList = new ArrayList();
            for (int i = l.size() - 1; i >= 0; i--) {
                reverseList.add(l.get(i));

            }
            l = reverseList;
        }

        for (RandomTShirt r : l) {
            System.out.println(r);
        }
        System.out.println("=============================================");
    }

}
