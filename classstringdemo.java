public class classstringdemo{
    public static void main(String [] args){
        String str1 = "java programming";
        String str2 = "java programming";
        String str3 = "welcome to java";

        System.out.println(str1);

        System.out.println(str1.charAt(5));
        System.out.println(str1.substring(5));

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.contains("java"));
        System.out.println(str1.endsWith("ing"));
        System.out.println(str1.indexOf('p'));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.replace("Java","Python"));
        System.out.println(str1.replaceAll("[AEIOUaeiou]","*"));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.trim()+"");

        String str4 = "";
        System.out.println(str4.isEmpty());
        String[] words = str1.split("");
        System.out.println("Split");
        for(String word : words){
            System.out.println(word);
        }
        int num = 100;
        String S= String.valueOf(num);
        System.out.println("valueof():"+S);

        char[]ch = str1.toCharArray();
        System.out.println("Character Array:");
        for(char c :ch){
            System.out.println(c + "");
        }

        System.out.println();

        String joined = String.join("-","Java","Python","C++");
        System.out.println("Join:"+"joined");

        System.out.println("Hi".repeat(3));


    }

}