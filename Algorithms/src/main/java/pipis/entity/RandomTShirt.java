package pipis.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pipis.enums.Color;
import pipis.enums.Fabric;
import pipis.enums.Size;

public class RandomTShirt extends TShirt {

    public RandomTShirt() {
        this.setSize((Size) randomChar(2));
        this.setColor((Color) randomChar(1));
        this.setFabric((Fabric) randomChar(3));
        this.setName(randomName());
    }

    //================================================================  
    public Object randomChar(int input) {
        Random r = new Random();
        switch (input) {
            case 1:
                return (Color.values()[r.nextInt(Color.values().length)]);
            case 2:
                return (Size.values()[r.nextInt(Size.values().length)]);
            case 3:
                return (Fabric.values()[r.nextInt(Fabric.values().length)]);
            default:
                System.out.println("Invalid Input");
                return (null);

        }

    }

    public String randomName() {
        char chars[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String name = "";
        for (int i = 0; i < 8; i++) {
            name += chars[new Random().nextInt(chars.length)];
        }
        return (name);
    }

    public List<RandomTShirt> createList(int numberOfTShirts) {
        List<RandomTShirt> list = new ArrayList();

        for (int i = 0; i < numberOfTShirts; i++) {
            list.add(new RandomTShirt());
        }
        return (list);
    }

}
