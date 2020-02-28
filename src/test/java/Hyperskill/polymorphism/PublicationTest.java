package Hyperskill.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PublicationTest {


    @Test
    void testPublication() {
        Publication pub = new Publication("The new era");
        assertEquals("Publication: The new era", pub.getInfo(), "Не совпадает");
    }

    @Test
    void testNewspaper() {
        Publication pub = new Newspaper("Football results", "Sport news");
        assertEquals("Newspaper (source - Sport news): Football results", pub.getInfo(), "Не совпадает");
    }

    @Test
    void testArticle() {
        Publication pub = new Article("Why the Sun is hot", "Dr James Smith");
        assertEquals("Article (author - Dr James Smith): Why the Sun is hot", pub.getInfo(), "Не совпадает");
    }

    @Test
    void testAnnouncement() {
        Publication pub = new Announcement("Will sell a house", 30);
        assertEquals("Announcement (days to expire - 30): Will sell a house", pub.getInfo(), "Не совпадает");
    }
}