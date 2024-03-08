import org.junit.Test;

public class MainClassTest extends MainClass

{
    @Test
    public void testGetLocalNumber()
    {
        int a = getLocalNumber();

        if (14 == a) {
            System.out.println("True number");
        } else {
            System.out.println("False nymber");
        }

    }

}
