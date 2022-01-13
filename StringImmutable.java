public class StringImmutable {
    public static void main(String[] args) {
        String name = "Rocky";
        String lcname = "rocky";
        String anotherName = "Rocky";
        // equal in reference
        String anotherAnotherName = new String("Rocky");
        System.out.println(name == anotherName);
        System.out.println(name == anotherAnotherName);
        System.out.println(name == lcname);
        // equal in value
        System.out.println(name.equals(anotherName));
        System.out.println(name.equals(anotherAnotherName));
        System.out.println(name.equals(lcname));
        // equal in value
        System.out.println(name.compareTo(anotherName));
        System.out.println(name.compareTo(anotherAnotherName));
        System.out.println(name.compareTo(lcname));
        // equal in value
        System.out.println(name.compareToIgnoreCase(anotherName));
        System.out.println(name.compareToIgnoreCase(anotherAnotherName));
        System.out.println(name.compareToIgnoreCase(lcname));
    }
}
