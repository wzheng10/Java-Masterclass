package masterclass.udemy;

public class Television {
    private int channels;
    private int buttons;
    private Dimensions dimensions;

    public Television(int channels, int buttons, Dimensions dimensions) {
        this.channels = channels;
        this.buttons = buttons;
        this.dimensions = dimensions;
    }

    public int getChannels() {
        return channels;
    }

    public int getButtons() {
        return buttons;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
