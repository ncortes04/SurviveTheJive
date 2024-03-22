import java.util.ArrayList;
import java.util.List;

public class Resources {
    private boolean rope; // 0
    private boolean sword; // 1
    private boolean campSupplies; // 2
    private boolean raft; // 3
    ArrayList<Boolean> itemArray = new ArrayList<>();
    ArrayList<String> itemNames = new ArrayList<>();

    public Resources() {
        this.sword = false;
        this.campSupplies = false;
        this.raft = false;
        itemArray.add(rope);
        itemNames.add("Rope");
        itemArray.add(sword);
        itemNames.add("Sword");
        itemArray.add(campSupplies);
        itemNames.add("Camp Supplies");
        itemArray.add(raft);
        itemNames.add("Raft");

    }

    public Resources(boolean sword, boolean campSupplies, boolean flint, boolean raft) {
        this.sword = sword;
        this.campSupplies = campSupplies;
        this.raft = raft;
        this.raft = raft;

    }
        // methods are pretty self explanitory, getters, setters, and useful functions

    public boolean getItemByIndex(int i) {
        return itemArray.get(i);
    }

    public String getRandomResource() {

        List<Integer> notAcquiredResources = new ArrayList<>();
        List<Integer> notAcquiredResourcesIndex = new ArrayList<>();

        for (int i = 0; i < itemArray.size(); i++) {
            if (!itemArray.get(i)) {
                notAcquiredResources.add(i);
            }
            notAcquiredResourcesIndex.add(i);
        }

        if (notAcquiredResources.isEmpty()) {
            return "All resources have been acquired.";
        }

        int randomIndex = notAcquiredResources.get((int) (Math.random() * notAcquiredResources.size()));
        itemArray.set(notAcquiredResourcesIndex.get(randomIndex), true);
        updateResourceState(notAcquiredResourcesIndex.get(randomIndex), true);
        return "You have acquired " + itemNames.get(randomIndex) + ".";
    }

    private void updateResourceState(int resourceIndex, boolean newState) {
        switch (resourceIndex) {
            case 0:
                setRope(newState);
                break;
            case 1:
                setSword(newState);
                break;
            case 2:
                setCampSupplies(newState);
                break;
            case 3:
                setRaft(newState);
                break;
        }
    }

    public boolean isRope() {
        return rope;
    }

    public void setRope(boolean rope) {
        this.rope = rope;
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }

    public boolean isCampSupplies() {
        return campSupplies;
    }

    public void setCampSupplies(boolean campSupplies) {
        this.campSupplies = campSupplies;
    }

    public boolean isRaft() {
        return raft;
    }

    public void setRaft(boolean raft) {
        this.raft = raft;
    }

}
