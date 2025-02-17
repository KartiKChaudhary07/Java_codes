class Solution {
    public int numTilePossibilities(String tiles) {
        if (tiles.isEmpty()) return 0;  // If string is empty, return 0
        if (tiles.length() == 1) return 1;  // If string has one character, return 1
        
        int n = tiles.length(); // Count string length starting from 1
        return (int) Math.pow(2, n); // Compute 2^n to get the number of outcomes
    }
}
