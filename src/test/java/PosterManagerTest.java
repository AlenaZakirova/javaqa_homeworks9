import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterManagerTest {

    @Test
    public void testAll() {
        PosterManager manager = new PosterManager(3);

        manager.add("1 Фильм");
        manager.add("2 Фильм");
        manager.add("3 Фильм");
        manager.add("4 Фильм");

        String[] actual = manager.findAll();
        String[] expected = {"1 Фильм", "2 Фильм", "3 Фильм", "4 Фильм"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithDefaultConstructor() {
        PosterManager manager = new PosterManager();
        manager.add("1 Фильм");
        manager.add("2 Фильм");
        manager.add("3 Фильм");
        manager.add("4 Фильм");
        manager.add("5 Фильм");
        String[] actual = manager.findLast();
        String[] expected = {"5 Фильм", "4 Фильм", "3 Фильм", "2 Фильм", "1 Фильм"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithOverrideConstructor() {
        PosterManager manager = new PosterManager(7);
        manager.add("1 Фильм");
        manager.add("2 Фильм");
        manager.add("3 Фильм");
        manager.add("4 Фильм");
        manager.add("5 Фильм");
        manager.add("6 Фильм");
        manager.add("7 Фильм");
        manager.add("8 Фильм");
        String[] actual = manager.findLast();
        String[] expected = {"8 Фильм", "7 Фильм", "6 Фильм", "5 Фильм", "4 Фильм", "3 Фильм", "2 Фильм"};
        Assertions.assertArrayEquals(expected, actual);
    }
}