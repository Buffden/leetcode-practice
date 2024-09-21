import java.util.HashSet;

class Solution {

    public enum Direction {
        UP, RIGHT, DOWN, LEFT;
    }

    public boolean coincide(int x, int y, HashSet<String> obstacleSet) {
        return obstacleSet.contains(x + "," + y);
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int posX = 0;
        int posY = 0;
        int maxDistance = 0;

        HashSet<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }

        Direction[] directions = {Direction.UP, Direction.RIGHT, Direction.DOWN, Direction.LEFT};
        int currentDir = 0;

        for (Integer com : commands) {
            if (com == -2) {
                currentDir = (currentDir + 3) % 4; // turn left
            } else if (com == -1) {
                currentDir = (currentDir + 1) % 4; // turn right
            } else {
                for (int i = 0; i < com; i++) {
                    int newX = posX;
                    int newY = posY;

                    switch (directions[currentDir]) {
                        case UP:
                            newY++;
                            break;
                        case DOWN:
                            newY--;
                            break;
                        case LEFT:
                            newX--;
                            break;
                        case RIGHT:
                            newX++;
                            break;
                    }

                    if (coincide(newX, newY, obstacleSet)) {
                        break; // Stop moving if an obstacle is hit
                    } else {
                        posX = newX;
                        posY = newY;
                    }
                    if (maxDistance < posX * posX + posY * posY) {
                        maxDistance = posX * posX + posY * posY;
                    }
                }
            }
        }

        return maxDistance;
    }
}
