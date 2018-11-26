package software_testing_homework_11;

public class ThrowableCaptor {
	static class throwableCaptor {

		@FunctionalInterface
		public interface Actor{
			void act() throws Throwable;
		}

		public static Throwable thrownBy(Actor actor)
		{
			try {
				actor.act();
			}catch(Throwable throwable) {
				return throwable;
			}
			return null;
		}
	}}


