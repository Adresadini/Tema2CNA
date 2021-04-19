package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaZodii {
    private ArrayList<Zodie> zodii=new ArrayList<>();
    public ListaZodii(File fisier) throws FileNotFoundException {
        Scanner sc=new Scanner(fisier);
        while(sc.hasNext())
        {
            String zodie=sc.next();
            String[] vector=zodie.split("|");
            Zodie zod=new Zodie(Integer.parseInt(vector[0]),Integer.parseInt(vector[1]),Integer.parseInt(vector[2]),Integer.parseInt(vector[3]),vector[4]);
            zodii.add(zod);
        }
    }

    public ArrayList<Zodie> getZodii() {
        return zodii;
    }
}
