public class Player {
    int karma;

    public Player() {
        this.karma = 0;
    }

    public Player(int karma){
        this.karma = karma;
    }
    public void increaseKarma(){
        if (karma > 99){
            return;
        }
        this.karma ++;
    }
    public void decreaseKarma(){
        if (karma <= 0){
            return;
        }
        this.karma --;
    }
}
