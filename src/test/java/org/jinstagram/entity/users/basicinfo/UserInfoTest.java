package org.jinstagram.entity.users.basicinfo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * The class <code>UserInfoTest</code> contains tests for the class
 * <code>{@link UserInfo}</code>.
 */
public class UserInfoTest {
	/**
	 * Run the UserInfoData getData() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetData_1() throws Exception {
		UserInfo fixture = new UserInfo();
		fixture.setData(new UserInfoData());

		UserInfoData result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		 
		assertEquals(null, result.getId());
		assertEquals(null, result.getFirstName());
		assertEquals(null, result.getUsername());
		assertEquals(null, result.getBio());
		assertEquals(null, result.getLastName());
		assertEquals(null, result.getWebsite());
		assertEquals(null, result.getProfilePicture());
		assertEquals(null, result.getCounts());
	}

	/**
	 * Run the void setData(UserInfoData) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetData_1() throws Exception {
		UserInfo fixture = new UserInfo();
		fixture.setData(new UserInfoData());
		UserInfoData data = new UserInfoData();

		fixture.setData(data);

		// add additional test code here
	}

	 

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * 
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * 
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * 
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserInfoTest.class);
	}
}