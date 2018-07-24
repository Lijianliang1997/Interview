package designPattern.proxyPattern.person;

import java.lang.reflect.Proxy;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public class MatchMakingTestDriver {
    public static void main(String[] args) {
        MatchMakingTestDriver matchMakingTestDriver = new MatchMakingTestDriver();
        matchMakingTestDriver.drive();
    }

    public void drive () {
        PersonBean joe = new PersonBeanImpl();
        joe.setGender("gender");
        joe.setName("joe");
        joe.setInterests("interests");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("can't set rating");
        }
    }

    PersonBean getOwnerProxy (PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
