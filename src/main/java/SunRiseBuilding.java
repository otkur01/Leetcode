import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunRiseBuilding {

    public static void main(String[] args) {
       int [] nums = {3,5,4,4,3,1,3,2};
        System.out.println(sunRise(nums,"EAST"));
        System.out.println(sunRise(nums,"WEST"));


    }

    public static ArrayList<Integer> sunRise(int [] buildings, String direction) {
        Stack<Integer> integerStack = new Stack<>();
        switch (direction) {
            case "EAST":

                for (int i = 0; i < buildings.length; i++) {

                    while ( !integerStack.isEmpty() && buildings[integerStack.peek()] <= buildings[i] ) {
                        integerStack.pop();

                    }
                    integerStack.push(i);

                }
                break;
            case "WEST":
                for (int length = buildings.length-1; length >=0; length--) {

                    while ( !integerStack.isEmpty() && buildings[integerStack.peek()] <= buildings[length] ) {
                        integerStack.pop();

                    }
                    integerStack.push(length);

                }
                break;

                }

//        ArrayList<Integer>result = new ArrayList<>();
//        while (!integerStack.isEmpty()){
//            result.add(integerStack.peek());
//            integerStack.pop();

                if (direction.equalsIgnoreCase("west")) Collections.reverse(integerStack);
                return new ArrayList<>(integerStack);

    }
}
