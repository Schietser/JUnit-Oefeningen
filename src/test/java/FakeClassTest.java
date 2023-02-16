import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FakeClassTest {

    @Test
    void printFake() {
        FakeClass fakeClass = new FakeClass();
        String expected = "This is fake";
        String actual = fakeClass.printFake();
        assertEquals(expected,actual);
    }
}