

class Solution {

    // Finds the longest valid section using one forward sliding window.
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> frequency =
            new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        // Expand the window by adding each fruit from the right.
        for (int right = 0; right < fruits.length; right++) {
            frequency.put(
                fruits[right],
                frequency.getOrDefault(fruits[right], 0) + 1
            );

            // Remove one left fruit when more than two types are present.
            if (frequency.size() > 2) {
                int fruit = fruits[left];

                frequency.put(
                    fruit,
                    frequency.get(fruit) - 1
                );

                // Remove a type after its final fruit leaves the window.
                if (frequency.get(fruit) == 0) {
                    frequency.remove(fruit);
                }

                left++;
            }

            // Only valid windows can contribute to the final answer.
            if (frequency.size() <= 2) {
                maxFruits = Math.max(
                    maxFruits,
                    right - left + 1
                );
            }
        }

        return maxFruits;
    }
}

