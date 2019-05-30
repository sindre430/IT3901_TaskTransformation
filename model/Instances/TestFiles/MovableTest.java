public class MovableTest {

	public static void main(String[] args){
        Person ola = new Person("Ola", "Nordmann", 21);                                // {movable, set: 1, block: 1, start}
        Person per = new Person("Per", "Nordmann", 18);
        Person lisa = new Person("Lisa", "Nordmann", 45);
        Person ole = new Person("Ole", "Nordmann", 47);                                // {movable, set:1, block: 1, end}
        addPersonToFamily(ola);                                                        // {movable, set: 1, block: 2, start}
        addPersonToFamily(per);
        addPersonToFamily(lisa);
        addPersonToFamily(ole);                                                        // {movable, set: 1, block: 2, end}

        if(per.isOlderThan(ola)){                                                      // {movable, set: 2}
            System.out.println("Per er eldre enn Ola");                                // {movable, set: 2}
        }else if(ola.isOlderThan(per)){                                                // {movable, set: 2}
            System.out.println("Ola er eldre enn Per");                                // {movable, set: 2}
        }else{                                                                         // {movable, set: 2}
            System.out.println("Per og Ola er like gamle");                            // {movable, set: 2}
        }                                                                              // {movable, set: 2}

        if(lisa.isOlderThan(ole)){                                                     // {movable, set: 3, start}
            System.out.println("Lisa er eldre enn Ole");
        }else if(ole.isOlderThan(lisa)){
            System.out.println("Ole er eldre enn Lisa");
        }else{
            System.out.println("Lisa og Ole er like gamle");
        }                                                                              // {movable, set: 3, end}
	}
	
}

class Person{
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age){ //{movable, region:body}
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
        return getFirstName().concat(" ").concat(getLastName());
    }

    public boolean isOlderThan(Person person){
        return this.age > person.getAge();
    }

}

