package seminars.third.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testGetId() {
        User user = new User(1, "John");
        Assertions.assertEquals(1, user.getId());
    }

    @Test
    public void testGetName() {
        User user = new User(1, "John");
        Assertions.assertEquals("John", user.getName());
    }

    @Test
    public void testSetName() {
        User user = new User(1, "John");
        user.setName("Mike");
        Assertions.assertEquals("Mike", user.getName());
    }

    @Test
    public void testEquals() {
        User user1 = new User(1, "John");
        User user2 = new User(1, "John");
        User user3 = new User(2, "Mike");

        Assertions.assertEquals(user1, user2);
        Assertions.assertNotEquals(user1, user3);
    }

    @Test
    public void testHashCode() {
        User user1 = new User(1, "John");
        User user2 = new User(1, "John");
        User user3 = new User(2, "Mike");

        Assertions.assertEquals(user1.hashCode(), user2.hashCode());
        Assertions.assertNotEquals(user1.hashCode(), user3.hashCode());
    }
}