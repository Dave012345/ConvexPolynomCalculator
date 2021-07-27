package sample.service;

public class ResultService{

    /**
     * It can calculate the diagonals of a single vertex of a polygon*/
    public String diagonalBy1Vertex(int angles){
        int result = (angles -3);
        return "Egy csúcsból húzható átlók száma: "+angles+" - 3 = "+result;
    }

    /**
     * It can calculate the all diagonals of polygon*/
    public String diagonals(int angles){
        int result = (angles * (angles-3)) /2;
        return "Az átlók száma: "+angles+" * ("+angles+"-3) / 2 = "+result;
    }

    /**
     * It calculates the sum of the interior angles of the polygon*/
    public String sumOfInteriorAngles(int angles){
        int result = (angles-2)*180;
        return "Belső szögek összege: ("+angles+"-2) * 180 = "+result;
    }

}
