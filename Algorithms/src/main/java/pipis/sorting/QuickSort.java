package pipis.sorting;

import java.util.ArrayList;
import java.util.List;
import pipis.entity.RandomTShirt;

public class QuickSort {

    private void sort(List<RandomTShirt> list, int property, int low, int high) {

        if (low < high) {

            int pi = partition(list, property, low, high);

            sort(list, property, low, pi - 1);
            sort(list, property, pi + 1, high);

        }

    }

    private int partition(List<RandomTShirt> list, int property, int low, int high) {

        RandomTShirt pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            switch (property) {
                case 1:
                    if (list.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                        i++;
                        RandomTShirt temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                    break;

                case 2:
                    if (list.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                        i++;
                        RandomTShirt temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                    break;
                case 3:
                    if (list.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                        i++;
                        RandomTShirt temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                    break;
                case 4:
                    if (list.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                        i++;
                        RandomTShirt temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    } else if (list.get(j).getSize().ordinal() == pivot.getSize().ordinal()) {
                        if (list.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;
                            RandomTShirt temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        } else if (list.get(j).getFabric().ordinal() == pivot.getFabric().ordinal()) {
                            if (list.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                                i++;
                                RandomTShirt temp = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, temp);
                            }

                        }

                    }
                    break;
            }

        }
        RandomTShirt temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return (i + 1);
    }

    public void print(List<RandomTShirt> list,int property, int low, int high, boolean sortingType) {
        System.out.println("================Original List================");
        for (RandomTShirt l : list) {
            System.out.println(l);
        }
        System.out.println("=============================================");

        System.out.println("\n================Quick Sort List================");
        sort(list, property, low, high);
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
