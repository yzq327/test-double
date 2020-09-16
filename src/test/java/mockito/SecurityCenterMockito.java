package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SecurityCenterMockito {

    SecurityCenter securityCenter;

    @Test
    public void should_use_mockito(){
        DoorPanel  mockDoorPanel= Mockito.mock(DoorPanel.class);
        securityCenter =new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        Mockito.verify(mockDoorPanel,Mockito.times(1));
    }


}
