package lesson5.impl;

import lesson5.CatService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class NoBreedCatImpl implements CatService {
    @Override
    public String getVoice(String name) throws IOException  {

        if(name.equalsIgnoreCase("Sharik")) {
            throw new AccessDeniedException("This is a dog name!");
        } else if (name.isEmpty()) {
            throw new FileNotFoundException();
        }
        return "MuauaMuaua " + name;
    }
}
