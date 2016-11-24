package generated;

import helpers.Config;
import helpers.Context;
import java.util.concurrent.Callable;

public class EntrypointSwitcher
{
	public static Callable randomCallable() throws Exception
	{
		int entrypointIndex = Config.get().getRandom().nextInt(5) + 1;

		switch (entrypointIndex)
		{
			case 1: return new EntrypointCallable1();
			case 2: return new EntrypointCallable2();
			case 3: return new EntrypointCallable3();
			case 4: return new EntrypointCallable4();
			case 5: return new EntrypointCallable5();
		}
	return null;
	}
}
