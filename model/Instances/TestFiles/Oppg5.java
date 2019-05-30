import java.util.ArrayList;
import java.util.List;

class Person{
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age){                              // {editText, sourceRegion: "Person", replacement: "private Person"}
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName(){
        return getFirstName().concat(" ").concat(getLastName());                       // {blank, from: "getFirstName"} (Alt etter "return")
    }

    public boolean isOlderThan(Person person){                                         // {blank, sourceRegion: "boolean"}
        return this.age > person.getAge();                                             // {multipleChoice, sourceRegion: ">", options: [">", "<", ">=", "<="]} {editText, sourceRegion: "person.getAge()", replacement: "person.getFirstName()"}
    }

}

public class Family {

    private static List<Person> family = new ArrayList<>();

    public static void main(String[] args){
        Person ola = new Person("Ola", "Nordmann", 21);                                // {moveable, groupId: 1, setId: 1, groupStart} {$variableName = random(10, 27)}{edit, input: "21", output: $variableName}
        Person per = new Person("Per", "Nordmann", 18);                                // {$variableName2 = $variableName-3}{edit, input: "18", output: $variableName2}
        Person lisa = new Person("Lisa", "Nordmann", 45);
        Person ole = new Person("Ole", "Nordmann", 47);                                // {moveable, groupId: 1, setId: 1, groupEnd}
        addPersonToFamily(ola);                                                        // {moveable, groupId: 1, setId: 2, groupStart}
        addPersonToFamily(per);
        addPersonToFamily(lisa);
        addPersonToFamily(ole);                                                        // {moveable, groupId: 1, setId: 2, groupEnd}

        if(per.isOlderThan(ola)){                                                      // {moveable, groupId: 2}
            System.out.println("Per er eldre enn Ola");                                // {moveable, groupId: 2}
        }else if(ola.isOlderThan(per)){                                                // {moveable, groupId: 2}
            System.out.println("Ola er eldre enn Per");                                // {moveable, groupId: 2}
        }else{                                                                         // {moveable, groupId: 2}
            System.out.println("Per og Ola er like gamle");                            // {moveable, groupId: 2}
        }                                                                              // {moveable, groupId: 2}

        if(lisa.isOlderThan(ole)){                                                     // {moveable, groupId: 3, groupStart}
            System.out.println("Lisa er eldre enn Ole");
        }else if(ole.isOlderThan(lisa)){
            System.out.println("Ole er eldre enn Lisa");
        }else{
            System.out.println("Lisa og Ole er like gamle");
        }                                                                              // {moveable, groupId: 3, groupEnd}

        String[] familyNames = getAllNamesInFamily();

        for(int i=0; i<familyNames.length; i++){                                       // {multipleChoice, input: "<", options: [">", "<", ">=", "<="]} {multipleChoice, input: "i++", options: ["i+=2", "i", "i++", "i--", "i-=2"]}
            System.out.println(familyNames[i]);
        }
    }

    private static void addPersonToFamily(Person person){
        family.add(person);                                                            // {blank}
    }

    private static String[] getAllNamesInFamily(){                                     // {moveable, groupId: 4, region: body}
        String[] names = new String[family.size()];
        for(int i=0; i<family.size(); i++){
            names[i] = family.get(i).getFullName();
        }
        return names;
    }
    
}