package seminar_three;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task_00();
//        task_01();
//        task_02_1();
//        task_02_2();
        task_02_3();
    }

    private static void task_02_3() {
        List<String> planets = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        Map<String, Integer> frequencyByPlanet = new HashMap<>();
        for (String planet: planets){
            Integer frequency = frequencyByPlanet.getOrDefault(planet, 0);
            frequencyByPlanet.put(planet, ++frequency);
        }
        frequencyByPlanet.forEach((planet, frequency) -> System.out.printf("%s\t-\t%s раз(а)%n", planet, frequency));
    }


    private static void task_02_2() {
        List<String> planets = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        planets.stream().distinct().forEach(planet -> System.out.printf("%s\t-\t%s раз(а)%n", planet,
                planets.stream().filter(planet::equals).count()));

    }

    private static void task_02_1() {
        List<String> planets = Arrays.asList("Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");
        ArrayList<String> unicumNamePlanets = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            if (!unicumNamePlanets.contains(planet)){
                int count = 1;
                unicumNamePlanets.add(planet);
                for (int j = 0; j < planets.size(); j++) {
                    if (planet.equals(planets.get(j))){
                        count++;
                    }
                }
                System.out.printf("%s\t-\t%s раз(а)%n", planet, count);
            }
        }

    }

    private static void task_01() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
//        list.sort(Comparator.naturalOrder());
//        Collections.sort(list);
        list.sort(Integer::compare);
        System.out.println(list);
    }

    private static void task_00() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "H" + "e" + "l" + "l" + "o";
        String s5 = new String ("Hello");
        String s6 = new String (new char[]{'H', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }
}
