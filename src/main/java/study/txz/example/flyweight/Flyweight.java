package study.txz.example.flyweight;

/**
 * Created by Taxz on 2019/2/24/024.
 * GitHub:https://github.com/Taxz
 */
public interface Flyweight {

    /**
     * 判断传入实体和权限是否和对象内部状态匹配
     *
     * @param enty 安全实体
     * @param perssion 权限
     * @return
     */
    boolean match(String enty,String perssion);
}
