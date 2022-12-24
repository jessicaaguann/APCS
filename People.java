public class People extends Object implements Comparable<Object> {

    String name;
    int age;
    double weight;

    public void setName(String newName) {
    	name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return ("{" + name + ", " + age + ", " + weight + "}");
    }

    @Override
    public int compareTo(Object o) {
        People p = (People) o;
        if (!name.equals(p.getName())) {
            return (name.compareTo(p.getName()));
        }
        if (age != p.getAge()){
            return (age - p.getAge());
        }
        if (weight != p.getWeight()) {
            return (int) (weight - p.getWeight());
        }
        return 0;
    }
}