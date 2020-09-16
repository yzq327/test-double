package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import static org.mockito.Mockito.*;
import java.util.Arrays;

public class GradeServiceMockitoTest {

    GradeService gradeService;

    @Test
    public void should_user_mockito(){
        GradeSystem stubGradeSystem= Mockito.mock(GradeSystem.class);
        gradeService =new GradeService(stubGradeSystem);
        when(stubGradeSystem.gradesFor(1L)).thenReturn(Arrays.asList(90.0, 90.0, 90.0));
        Assertions.assertEquals(90.0,gradeService.calculateAverageGrades(1L));
    }

}
