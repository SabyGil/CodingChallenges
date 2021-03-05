public class BunnyEars2 {
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        int currentBunnyEarCount = bunnies % 2 == 0 ? 3 : 2;

        return currentBunnyEarCount + bunnyEars2(bunnies - 1);
    }
}
