public class Str {


    public static void main(String[] args) {
        String a="Prahlad";
        String b="Prahlad";
        String c=new String("prahlad");
        a.concat("Ray");
        System.out.println(a.concat(" ray"));
        System.out.println(c.concat(" Ray"));
        System.out.println(c.charAt(2));// kis index ka print karna h
        System.out.println(c.length());
        System.out.println(c.substring(2,5));// word remove karke print karna
        System.out.println(a.contains("Prahlad"));
        System.out.println(a.equals(b));
        System.out.println(a.indexOf("d"));

            }
}
