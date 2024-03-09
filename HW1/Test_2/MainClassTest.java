import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int a = this.getClassNumber();

        if (a > 45) {
            System.out.println("Указанное число " + a + " больше 45");
        } else {
            System.out.println("Указанное число " + a + " меньше 45");
        }
    }

}
