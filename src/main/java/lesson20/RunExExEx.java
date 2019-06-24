package lesson20;

public class RunExExEx {
    public static void main(String[] args) throws Exception {
        ExExEx exExEx = new ExExEx();
        exExEx.info();

        System.err.println("I am here");
        runMe();
        RunExExEx exExEx1 = new RunExExEx();
        exExEx1.doNoTRunMe();
    }

    static void runMe() throws Exception {
        ExExEx exExEx = new ExExEx();
        exExEx.info();


        System.err.println("asd");
    }

    void doNoTRunMe() throws Exception {
        ExExEx exExEx = new ExExEx();
        exExEx.info();

        System.err.println("asd");
    }
}
