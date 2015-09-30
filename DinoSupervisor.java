package mike;

public class DinoSupervisor {

    public static void main(String[] args) {

        Dinosaur t_rex = new Dinosaur();
        Dinosaur velciraptor = new Dinosaur();
        // Added a vegan dino then called roar later in program
        Dinosaur diplodocus = new Dinosaur();

        t_rex.color = "red";
        t_rex.diet = "straight meat";
        t_rex.name = " Percival";
        t_rex.species = "Tyrannosaurus rex";

        velciraptor.color = "green";
        velciraptor.diet = "straight meat";
        velciraptor.name = "Jerry";
        velciraptor.species = "Velociraptor";

        //defining traits of new object
        diplodocus.color = "brown";
        diplodocus.diet = "them greens kid";
        diplodocus.name = "Eugene";
        diplodocus.species = "Diplodocus";

        System.out.println("My name is " + t_rex.name + ", I'm a " + t_rex.species + ", my favorite color is " + t_rex.color + " and I eat " + t_rex.diet );
        t_rex.roar();
        velciraptor.roar();
        diplodocus.roar2();

    }
}
