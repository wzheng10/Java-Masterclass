package masterclass.udemy;

public class Labrador  extends Dog {
    public Labrador(String name) {
        super(name);
    }

    //putting in the final in the Dog class equals method will prevent this Override from occuring
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//        if(obj instanceof Labrador) {
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
