package generated;
import helpers.Config;
import helpers.Context;
public class Switcher
{
	public static void call() throws Exception
	{
		call(Config.get().getRandom().nextInt(26));
	}
	public static void call(int number) throws Exception
	{
		
		if (number >= 0 && number < 25)
		{
			Switcher0.call(number);
			return;
		}

	}
}
