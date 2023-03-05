package game;

public class CleanConsole
{

    public void limparComFor()
    {
        String a = "";
        for (int i = 0; i <= 300; i++)
        {
            System.out.println();
        }

    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            } else
            {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
