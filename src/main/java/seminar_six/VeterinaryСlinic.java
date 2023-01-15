package seminar_six;

public class VeterinaryСlinic {
    public int weight;
    public int age;
    public int height;
    public String color;
    public String catName;
    public String ownerName;

//    public abstract void  getWeight();

    public static void main(String[] args) {
        VeterinaryСlinic veterinaryСlinic = new VeterinaryСlinic();
        veterinaryСlinic.weight = 10;
        veterinaryСlinic.age = 7;
        veterinaryСlinic.catName = "Gray";
        veterinaryСlinic.ownerName = "Ildar";
        veterinaryСlinic.color = "gray";
        veterinaryСlinic.height = 3;

        System.out.println(veterinaryСlinic);
    }
    @Override
    public String toString() {
        return "cat for vet " + catName + " " + color + " " + weight;
    }
}
