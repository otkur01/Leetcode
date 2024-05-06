import java.util.ArrayList;
import java.util.Stack;

public class SunRiseBuilding {

    public static void main(String[] args) {
       int [] nums = {3,5,4,1,2};
        System.out.println(sunRise(nums,"EAST"));


    }

    public static Stack<Integer> sunRise(int [] buildings, String direction) {
        Stack<Integer> integerStack = new Stack<>();
        switch (direction) {
            case "EAST":

                for (int i = 0; i < buildings.length - 1; i++) {
                    integerStack.push(i);
                    if (buildings[i] < buildings[i + 1]) {
                        integerStack.pop();
                        i++;
                    }


                }
                break;
            case "WEST":
                integerStack.push(buildings[buildings.length - 1]);
                for (int i = buildings.length - 2; i > 0; i--) {
                    if (buildings[i] > buildings[i - 1]) {
                        integerStack.push(i);

                    }
                    break;

                }

//        ArrayList<Integer>result = new ArrayList<>();
//        while (!integerStack.isEmpty()){
//            result.add(integerStack.peek());
//            integerStack.pop();
        }

                return integerStack;

    }
}
