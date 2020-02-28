/*Below you can see four classes: Publication, Newspaper, Article and Announcement.
       You need to override the method getDetails() in the classes inherited from the class Publication. These classes should use getDetails() from Publication to get information about the title and append their own additional data.
        Examples are shown below.
        Sample Input 1:
        Publication; The new era
        Sample Output 1:
        title="The new era"
        Sample Input 2:
        Newspaper; Football results; Sport news
        Sample Output 2:
        title="Football results", source="Sport news"
        Sample Input 3:
        Article; Why the Sun is hot; Dr James Smith
        Sample Output 3:
        title="Why the Sun is hot", author="Dr James Smith"
        Sample Input 4:
        Announcement; Will sell a house; 30
        Sample Output 4:
        title="Will sell a house", daysToExpire=30*/

package Hyperskill.PatternsConstructorsOverloadMethods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PublicationTest {

    @Test
    void Test1() {
        Newspaper newspaper = new Newspaper("Football results", "Sport news");
        assertEquals("title=\"Football results\", source=\"Sport news\"", newspaper.getDetails(), "Метод вернул неверное значение");
    }

    @Test
    void Test2() {
        Article article = new Article("Why the Sun is hot","Dr James Smith");
        assertEquals("title=\"Why the Sun is hot\", author=\"Dr James Smith\"", article.getDetails());
    }

    @Test
    void Test3() {
        Announcement announcement = new Announcement("Will sell a house", 30);
        assertEquals("title=\"Will sell a house\", daysToExpire=30", announcement.getDetails());
    }
}