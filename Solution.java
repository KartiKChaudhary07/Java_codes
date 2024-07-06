class Solution {
    public int passThePillow(int n, int time) {
        int position = 0;
        int direction = 1;

        for (int t = 0; t < time; t++) {
            position += direction;

            if (position == n) {
                direction = -1;
                position = n - 2;
            } else if (position == -1) {
                direction = 1;
                position = 1;
            }
        }

        return position;
    }
}
