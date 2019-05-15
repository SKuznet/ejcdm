package lesson5;

public interface CatService {
    /**
     * this method used for get voice from cat
     *
     * @param name - cat's name
     * @return cat's voice
     */
    String getVoice(String name) throws Exception;
}
