package toobject.Num6;

public class TypeChooser {
    public static ImageSaver getSaver(String type){
        if (type.equalsIgnoreCase("GIF")){
            return new GIFSaver();
        }else {return null;}
    }
}
