package study.txz.example.adapter;

/**
 * Created by Taxz on 2019/2/12.
 */
public class Test {
    public static void main(String[] args) {

        GBSocketInterface gbSocketService = new GBSocketServiceImpl();

        DBSocketInterface dbSocketService = new AdapterPattern(gbSocketService);

        Hotel hotel = new Hotel(dbSocketService);
        hotel.charge();
    }
}
