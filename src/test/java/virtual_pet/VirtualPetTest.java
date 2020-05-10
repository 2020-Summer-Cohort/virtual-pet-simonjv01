package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {


    @Test
    public void testFeedInput() {
    // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int feedBalance = testFeed.feed(20);
        // assert
        assertEquals(45, feedBalance);
    }

    @Test
    public void testFeedInputMax100() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int feedBalance = testFeed.feed(80);
        // assert
        assertEquals(100, feedBalance);
    }

    @Test
    public void testThirstInput() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int thirstBalance = testFeed.thirst(35);
        // assert
        assertEquals(55, thirstBalance);
    }


    @Test
    public void testThirstInputMax100() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int thirstBalance = testFeed.thirst(90);
        // assert
        assertEquals(100, thirstBalance);
    }

    @Test
    public void testWasteInput() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int wasteBalance = testFeed.waste(35);
        // assert
        assertEquals(85, wasteBalance);
    }


    @Test
    public void testWasteInputMax100() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int wasteBalance = testFeed.waste(90);
        // assert
        assertEquals(100, wasteBalance);
    }

    @Test
    public void testBoredomInput() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int boredomBalance = testFeed.boredom(35);
        // assert
        assertEquals(69, boredomBalance);
    }


    @Test
    public void testBoredomInputMax100() {
        // arrange
        VirtualPet testFeed = new VirtualPet("Jane","cat", 25, 20, 50, 34);
        // act
        int boredomBalance = testFeed.boredom(90);
        // assert
        assertEquals(100, boredomBalance);
    }



}
