package mock;

import java.util.stream.Stream;

public class SecurityCenter{
    private final DoorPanel doorPanel;

    public SecurityCenter(DoorPanel doorPanel) {
        this.doorPanel = doorPanel;
    }



    public void switchOn() {
        doorPanel.close();
    }

}
