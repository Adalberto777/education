package seminar_six;

import java.util.List;
import java.util.Objects;

public class KuclachevListCat {
    public int weight;
    public int age;
    public int height;
    public String color;
    public String catName;
    public List skills;

    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public String toString() {
        return "KuclachevListCat{" +
                "color='" + color + '\'' +
                ", catName='" + catName + '\'' +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int hashCode() {
        return catName.length() + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KuclachevListCat that = (KuclachevListCat) o;
        return Objects.equals(color, that.color);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj != this){
//            return false;
//        }
//        if (obj instanceof KuclachevListCat){
//            KuclachevListCat temp = (KuclachevListCat) obj;
//            if (temp.hashCode() != this.hashCode()){
//                return false;
//            }
//            if (temp.color.equals(this.color)){
//                return true;
//            }
//        }
//        return false;
//    }
}
