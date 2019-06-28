package preparation.OCA.Chapter6;

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
    void roar() throws HasSoreThroatException;
}
//class Lion implements Roar {// INSERT CODE HERE
//}
