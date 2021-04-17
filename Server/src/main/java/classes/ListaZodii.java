package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaZodii {
    private ArrayList<Zodie> zodii=new ArrayList<>();
    public ListaZodii() throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/main/resources/zodii.txt"));
    }

}
