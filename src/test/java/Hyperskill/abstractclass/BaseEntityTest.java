package Hyperskill.abstractclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseEntityTest {

    private User user = new User();
    private BaseEntity userEntity = user;
    private WebSite site = new WebSite();
    private BaseEntity siteEntity = site;
    private Visit visit = new Visit();
    private BaseEntity baseVisit = visit;

    @Test
    void setName_UserClassName_ShouldBeSetted() {
        user.setName("John Grant");
        assertEquals("John Grant", user.name, "Name isn't equal");
        System.out.println(user.name);
    }

    @Test
    void setId_BaseClassId_ShouldBeSettedOne() {
        userEntity.setId(100);
        assertEquals(100, userEntity.id, "Name isn't equal");
        System.out.println(userEntity.id);
    }

    @Test
    void setVersion_BaseClassVersion_ShouldBeSettedOne() {
        userEntity.setVersion(1);
        assertEquals(1, userEntity.version, "Name isn't equal");
        System.out.println(userEntity.version);
    }

    @Test
    void setUrl_WebClassUrl_ShouldBeSetted() {
        site.setUrl("https://hyperskill.org");
        assertEquals("https://hyperskill.org", site.url, "Name isn't equal");
        System.out.println(site.url);
    }

    @Test
    void setId_BaseClassId_ShouldBeSetted() {
        siteEntity.setId(101);
        assertEquals(101, siteEntity.id, "Id isn't setted");
        System.out.println(siteEntity.id);
    }

    @Test
    void setVersion_BaseClassVersion_ShouldBeSetted() {
        siteEntity.setVersion(1);
        assertEquals(1, siteEntity.version, "Version isn't setted");
        System.out.println(siteEntity.version);
    }

    @Test
    void setUser_VisitUser_ShouldBeSetted() {
        visit.setUser(user);
        assertEquals(user, visit.user, "User isn't setted");
        System.out.println(visit.user);
    }

    @Test
    void setSite_VisitSite_ShouldBeSetted() {
        visit.setSite(site);
        assertEquals(site, visit.site, "Site isn't setted");
        System.out.println(visit.site);
    }


    @Test
    void setId_BaseVisit_ShouldBeSetted() {
        baseVisit.setId(102);
        assertEquals(102, baseVisit.id, "User isn't setted");
        System.out.println(baseVisit.id);
    }

    @Test
    void setVersion_BaseVisit_ShouldBeSetted() {
        baseVisit.setVersion(103);
        assertEquals(103, baseVisit.version, "Site isn't setted");
        System.out.println(baseVisit.version);
    }
}
