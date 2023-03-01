package Room;

public class Kitchen {
    public static void main(String[] args) {
        //declare and initialie variables with appr. datatypes
        double squaremeters = 54.5;
        double Wall1 = 6.25;
        double Wall2 = 8.72;
        float usedSpace = 14.4f;
        int roomhight = 4;
        String Roomname = "Kitchen";
        System.out.println(Wall1 * Wall2);
        System.out.println("The Room " + Roomname + " has " + squaremeters + "m² and the Wall sizes are " + Wall1 + " and " + Wall2 + ",the Room is " + roomhight + " high " + usedSpace + " m²Space used");

    }
}
