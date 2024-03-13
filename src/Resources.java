public class Resources {
    private boolean rope;
    private boolean sword;
    private boolean water;
    private boolean flint;
    private boolean raft;
    
    public Resources() {
        this.sword = false;
        this.water = false;
        this.flint = false;
        this.raft = false;
    }

    public Resources(boolean sword, boolean water, boolean flint, boolean raft) {
        this.sword = sword;
        this.water = water;
        this.flint = flint;
        this.raft = raft;
        this.raft = raft;

    }
    
    public boolean hasRope(){
        return this.rope;
    }
    public boolean hasSword(){
        return this.sword;
    }
    public boolean hasWater(){
        return this.water;
    }
    public boolean hasFlint(){
        return this.flint;
    }
    public boolean hasRaft(){
        return this.raft;
    }
    

}
