package lesson5;

import lesson5.impl.BreedCatImpl;

public class Main {

    public static void main(String[] args) throws Exception {
        new Main().getInfo();
    }

    private void getInfo() throws Exception {
        CatService service = new BreedCatImpl();
        service.getVoice(this.toString());
    }
}
