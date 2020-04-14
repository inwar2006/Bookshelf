package com.inwar2006.bookshelf;

import java.util.List;
import java.util.ArrayList;

public class BookExpert {
    List<String> getTypes (String direction){
        List<String> booktypes = new ArrayList<>();
        switch (direction){
            case "Technic":
                booktypes.add("Cars");
                booktypes.add("Ships");
                break;
            case "Programming":
                booktypes.add("Java programming");
                booktypes.add("Python programming");
                break;
            case "Geography":
                booktypes.add("Europa");
                booktypes.add("Africa");
                break;
            case "School":
                booktypes.add("Algebra");
                booktypes.add("Geometry");
                break;
        }
        return booktypes;
    }
}
