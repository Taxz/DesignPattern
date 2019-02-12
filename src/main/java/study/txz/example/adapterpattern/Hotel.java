package study.txz.example.adapterpattern;

/**
 * Created by Taxz on 2019/2/12.
 *
 * hotel 的接口为DB
 */
public class Hotel {

    private DBSocketInterface dbSocketInterface;

    public Hotel() {

    }

    public Hotel(DBSocketInterface dbSocketInterface) {
        this.dbSocketInterface = dbSocketInterface;
    }

    public void setDbSocketInterface(DBSocketInterface dbSocketInterface) {
        this.dbSocketInterface = dbSocketInterface;
    }

    public void charge() {
        System.out.println("德标方式。。。");
        this.dbSocketInterface.powerWithTwoBound();
    }
}
