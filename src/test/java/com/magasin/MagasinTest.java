package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
/*
    @Test
    void specificTest()
    {
        Item[] items = new Item[] {new Item("generic", 5, 10),
                new Item("Comté", 5, 10),
                new Item("Kryptonite", 5, 10),
                new Item("Pass VIP Concert", 5, 10),
                new Item("Pouvoirs magiques", 5, 10)};
        Magasin app = new Magasin(items);
        TestFileWriter fwriter = new TestFileWriter();
        for (int i=0; i <10; i++)
        {
            app.updateQuality();
            for (Item item:items)
            {
                fwriter.write(item.toString());
            }
        }
        fwriter.close();
    }
*/

    @Test
    void compareToGolden()
    {
        Item[] items = new Item[] {new Item("generic", 5, 10),
                new Item("Comté", 5, 10),
                new Item("Kryptonite", 5, 10),
                new Item("Pass VIP Concert", 5, 10),
                new Item("Pouvoirs magiques", 5, 10)};
        Magasin app = new Magasin(items);
        TestFileReader freader = new TestFileReader();
        for (int i=0; i <10; i++)
        {
            app.updateQuality();
            for (Item item:items)
            {
               String goal = item.toString();
               String target = freader.readLine();
               assertEquals(goal, target);
            }
        }
        freader.close();

    }

}
