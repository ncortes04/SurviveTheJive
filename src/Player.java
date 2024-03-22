import java.util.HashSet;

public class Player {
    // player class with resouorces, karma, and a visited set
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
        // methods are pretty self explanitory, getters, setters, and useful functions
        public void increaseKarma() {
        if (karma > 99) {
            return;
        }
        this.karma += 5;
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
        this.karma -= 5;
    }
    public int getVisitedCount(){
        return this.visited.size();
    }
    public void decreaseKarma(int amount) {
        if (karma <= 0) {
            return;
        }
        this.karma -= amount;
    }
}
