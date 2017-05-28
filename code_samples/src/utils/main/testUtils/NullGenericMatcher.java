package testUtils;

import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class NullGenericMatcher<T> implements Matcher<T> {

	@Override
	public void describeTo(Description arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void describeMismatch(Object arg0, Description arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean matches(Object arg0) {
		return arg0 == null;
	}

}
