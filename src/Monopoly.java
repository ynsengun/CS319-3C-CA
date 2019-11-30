public class Monopoly extends Card {
    // Properties

    // Constructor
    public Monopoly()
    {
        setName("Knight");
        setInformation("This special card allows you to steal ALL of any one resource of your" +
                " choice from all other players.");
    }

    // Methods
    /**
     * This function plays the Monopoly card, which allows player steal ALL of any one resource of choice from all players.
     */
    @Override
    public void play() {
        FlowManager.getInstance().addMust(4);
    }
}