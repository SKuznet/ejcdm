package lesson5.impl;

import lesson5.CatService;

public class BreedCatImpl implements CatService {
    @Override
    public String getVoice(String name) {

        if (name == null) {
            throw new IllegalArgumentException("Name shouldn't be null");
        }

        // we add this check for...
        if (name.equalsIgnoreCase("barsik")) {
            throw new IllegalArgumentException("cat is died... " + name);
        }
        return "Murr " + name;
    }
}
