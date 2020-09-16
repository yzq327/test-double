package mock;

import java.util.stream.Stream;

public class MockDoorPanel extends DoorPanel{
    @Override
    void close() {
        System.out.println("door is closed");
    }


}
