public class Name_lenth {
    public static void main(String[] args) {
        String name="Anand yadav";
        int value =name.length();
        System.out.println(value);
        // System.out.println(name.substring(3));
        // System.out.println(name.substring(4));
        // System.out.println(name.replace('n','p'));
        // System.out.println(name.replace("Anand","yadav"));
        // System.out.println(name.equals("Anand yadav"));
        // System.out.println(name.equals("An and yadav"));
        // System.out.println(name.equalsIgnoreCase("AnaNd yAdav"));
        // name=name.toLowerCase();
        // System.out.println(name);
        name=name.replace(" ", "_");
        System.out.println(name);
        // String letter= "dear |<name>| ,Thanks a lot"!;
        // letter =letter.replace("|<name.>|" ,"Anand");
        // System.out.println(letter); 
}
}
