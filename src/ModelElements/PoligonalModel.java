package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;


    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures;
        Poligons = new ArrayList<>();
        List<Point3D> Result = new ArrayList<>();
        Poligons.add(new Poligon(Result));
    }
}
