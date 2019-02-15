package study.txz.example.memory;

/**
 * Created by Taxz on 2019/2/15.
 */
public class Work {

    private String name;

    private String state;

    private String result;

    public Work(String name) {
        this.name = name;
    }

    public void orignalData() {
        this.result = "110";
        this.state = "runing";
        System.out.println("orignal:" + this.result + this.state);
    }

    public void wayA() {
        System.out.println("staterB:" + this.result + this.state);
        this.result = "101";
        this.state = "finishB";
        System.out.println("stop:" + this.result + this.state);
    }

    public void wayB() {
        System.out.println("staterB:" + this.result + this.state);
        this.result = "011";
        this.state = "finishB";
        System.out.println("stop:" + this.result + this.state);
    }

    public Memory saveWork() {
        return new InnerMemory(this.state, this.result);
    }

    public void recovery(Memory memory) {
        InnerMemory memo = (InnerMemory) memory;
        this.state = memo.getState();
        this.result = memo.getResult();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    class InnerMemory implements Memory {

        private String state;
        private String result;

        public InnerMemory(String state, String result) {
            this.state = state;
            this.result = result;
        }

        public String getState() {
            return state;
        }

        public String getResult() {
            return result;
        }
    }
}
