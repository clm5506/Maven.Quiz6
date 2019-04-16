package rocks.zipcode.io.objectorientation;

public class Television {

    boolean isOn;
    TVChannel channel;

    public Television() {
        this.isOn = false;
        this.channel = null;
    }

    public void turnOn() {
        isOn = true;
    }

    public void setChannel(Integer channel) {

        if(!isOn){
            throw new IllegalStateException();
        }
      this.channel = TVChannel.getByOrdinal(channel);

    }

    public TVChannel getChannel() {
        return this.channel;
    }
}
