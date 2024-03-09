import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString() {

        String proverka = this.getClassString();
        int hello = proverka.indexOf("hello");
        int hell = proverka.indexOf("Hello");

        if (hello > 0) {
            System.out.print("Подстрока _hello_ содержиться в указанной строке");

        } else if (hell >= 0) {
            System.out.print("Подстрока _Hello_ содержиться в указанной строке");

        }

    }


}
