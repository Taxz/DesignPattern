package study.txz.example.adapterpattern;

/**
 * Created by Taxz on 2019/2/12.
 *
 * 适配器实现
 */
public class AdapterPattern  implements DBSocketInterface{

    private GBSocketInterface gbSocketInterface;

    public AdapterPattern(GBSocketInterface gbSocketInterface) {
        this.gbSocketInterface = gbSocketInterface;
    }

    /**
     * 将GB方式转换为DB方式
     */
    @Override
    public void powerWithTwoBound() {
        System.out.println("适配器转换");
        this.gbSocketInterface.powerWithTwoBound();
    }
}
