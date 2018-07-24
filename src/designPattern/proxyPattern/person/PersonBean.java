package designPattern.proxyPattern.person;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName (String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
