package seminar_six;

import java.util.*;

public class MainCat {
    public static void main(String[] args) {



        KuclachevListCat kuclachevListCat1 = new KuclachevListCat();
        kuclachevListCat1.color = "black";
        kuclachevListCat1.catName = "Barsic";
        List s = new ArrayList<>();
        Collections.addAll(s, "JUMP1", "SOMERSAULT1", "RUN");
        kuclachevListCat1.skills = new ArrayList<>(s);


        KuclachevListCat cat1 = new KuclachevListCat();
        cat1.color = "black";
        cat1.catName = "Barsic";
        List d = new ArrayList<>();
        Collections.addAll(d, "JUMP2", "SOMERSAULT2", "LAME");
        cat1.skills = new ArrayList<>(d);


        KuclachevListCat cat2 = new KuclachevListCat();
        cat2.color = "black";
        cat2.catName = "Barsic";
        List m = new ArrayList<>();
        Collections.addAll(m, "JUMP3", "SOMERSAULT3", "LAME3");
        cat1.skills = new ArrayList<>(m);

        HashSet<KuclachevListCat> set = new HashSet<>();
        set.add(kuclachevListCat1);
        set.add(cat1);
        set.add(cat2);
        System.out.println(set);



//        System.out.println(cat1);
//        kuclachevListCat1.jump();
//        System.out.printf("color the cat: %s%n", kuclachevListCat1.color);

    }
}
