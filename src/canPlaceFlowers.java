import java.util.ArrayList;
import java.util.List;

public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int flowers = 0;

        List<Integer> newflowerbed = new ArrayList<>();

        newflowerbed.add(0);
        for (int x : flowerbed) {
            newflowerbed.add(x);
        }
        newflowerbed.add(0);

        for (int x : newflowerbed) {
            if (x == 0) {
                count++;
            }

            if (count == 3) {
                flowers++;
                count = 1;
            }

            if (x == 1) {
                count = 0;
            }
        }

        if (flowers >= n) {
            return true;
        }

        return false;
    }
}
