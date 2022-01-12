public class StringImmutable {
    public static void main(String[] args) {
        String name = "Rocky";
        String anotherName = "Rocky";
        // equal in reference
        String anotherAnotherName = new String("Rocky");
        System.out.println(name == anotherName);
        System.out.println(name == anotherAnotherName);
        // equal in value
        System.out.println(name.equals(anotherName));
        System.out.println(name.equals(anotherAnotherName));
        // equal in value
        System.out.println(name.compareTo(anotherName));
        System.out.println(name.compareTo(anotherAnotherName));
        // equal in value
        System.out.println(name.compareToIgnoreCase(anotherName));
        System.out.println(name.compareToIgnoreCase(anotherAnotherName));
    }
}
