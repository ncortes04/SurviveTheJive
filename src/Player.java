import java.util.HashSet;

public class Player {
    int karma;
    Resources resources;
    HashSet<Integer> visited = new HashSet<>();

    public Player() {
        this.karma = 0;
        this.resources = new Resources();
    }

    public Player(int karma) {
        this.karma = karma;
    }

    public void increaseKarma() {
        if (karma > 99) {
            return;
        }
        this.karma++;
    }

    public void addToVisited(int index) {
        this.visited.add(index);
    }

    public boolean isVisited(int index) {
        return this.visited.contains(index);
    }

    public void increaseKarma(int amount) {
        if (karma > 99) {
            return;
        }
        this.karma += amount;
    }

    public void decreaseKarma() {
        if (karma <= 0) {
            return;
        }
        this.karma--;
    }

    public void decreaseKarma(int amount) {
        if (karma <= 0) {
            return;
        }
        this.karma -= amount;
    }
}
