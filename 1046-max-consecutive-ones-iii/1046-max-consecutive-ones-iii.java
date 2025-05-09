class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Eğer sıfır sayısı k'den fazlaysa pencereyi daralt
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Geçerli pencere uzunluğunu kontrol et
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}