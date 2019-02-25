package study.txz.example.flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Taxz on 2019/2/24/024.
 * GitHub:https://github.com/Taxz
 */
public class SecurityMgr {
    private static SecurityMgr securityMgr = new SecurityMgr();
    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    private SecurityMgr() {
    }

    public static SecurityMgr getSecurityMgr() {
        return securityMgr;
    }

    public void login(String user) {
        Collection<Flyweight> flyweights = query(user);
        map.put(user, flyweights);
    }

    private Collection<Flyweight> query(String user) {
        Collection<Flyweight> collection = new ArrayList<>();

        for (String s : TestDB.colDB) {
            String[] tmp = s.split(",");
            if (tmp[0].equals(user)) {
                Flyweight weight = FlyweightFactory.getFactory().getFlyWeight(tmp[1] + "," + tmp[2]);
                collection.add(weight);
            }
        }
        return collection;
    }


    public boolean hasPermit(String usr, String securit, String persit) {
        Collection<Flyweight> flyweights = map.get(usr);
        if (flyweights == null || flyweights.size() == 0) {
            System.out.println("没登录或无权限");
            return false;
        }

        for (Flyweight f : flyweights) {
            System.out.println("flyweight:" + f);
            if (f.match(securit, persit)) {
                return true;
            }
        }
        return false;
    }

}
