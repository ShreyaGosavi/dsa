import java.util.HashMap;

public class FruitBasket_904 {
    public static void main(String[] args){
        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        //<fruit, frequency>
        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int maxFruits = 0;

        for(int right = 0; right < fruits.length; right++){
            int fruit = fruits[right];

            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            if(map.size() > 2){
                int leftFruit = fruits[start];
                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                start++;
            }
            maxFruits = Math.max(maxFruits, right - start + 1);
        }
        return maxFruits;
    }
}
