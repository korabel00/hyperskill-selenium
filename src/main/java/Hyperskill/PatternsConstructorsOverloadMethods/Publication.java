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

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }
    // write your code here
    public String getDetails() {
        return super.getDetails() + ", source=\"" + source + "\"";
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }
    // write your code here
    public String getDetails() {
        return super.getDetails() + ", author=\"" + author + "\"";
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }
    // write your code here
    public String getDetails() {
        return super.getDetails() + ", daysToExpire=" + daysToExpire;
    }
}