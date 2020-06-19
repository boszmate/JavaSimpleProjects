package service;

import org.junit.Assert;
import org.junit.Test;

public class UserServiceTest {
    @Test
    public void testUserExistWhenUserExist() {
        String [] users = {"Michael", "Ken", "Scott", "Thomas"};
        UserService userService = new UserService(users);
        final boolean condition = userService.isUserExist("Ken");
        Assert.assertTrue(condition);
    }

    @Test
    public void testUserExistWhenUserNotExist() {
        String [] users = {"Michael", "Ken", "Scott", "Thomas"};
        UserService userService = new UserService(users);
        final boolean condition = userService.isUserExist("Dennis");
        Assert.assertFalse(condition);
    }

    @Test
    public void testUsersCountIsCorrect() {
        String [] users = {"Michael", "Ken", "Scott", "Thomas"};
        UserService userService = new UserService(users);
        final int result = userService.getUsersCount();
        Assert.assertEquals(4, result);
    }

    @Test
    public void testUsersCountIsZero() {
        String [] users = {};
        UserService userService = new UserService(users);
        final int result = userService.getUsersCount();
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountRepeatsUserWithRepeats() {
        String [] users = {"Michael", "Ken", "Scott", "Scott"};
        UserService userService = new UserService(users);
        final int count = userService.getCountRepeatsByLogin("Scott");
        Assert.assertEquals(2, count);
    }

    @Test
    public void testCountRepeatsUserWithoutRepeats() {
        String [] users = {"Michael", "Ken", "Scott"};
        UserService userService = new UserService(users);
        final int count = userService.getCountRepeatsByLogin("Thomas");
        Assert.assertEquals(0, count);
    }
}
