package javaa;

public class StringArray {
    public static void main(String[] args) {
        String[] Name = new String[10];
        Name[0] = "Robin";
        Name[1] = "Kapil";
        Name[2] = "Gagan";
        Name[3] = "Randeep";
        Name[4] = "Pragra";

        for (String name : Name){
            System.out.println(name);
        }

//        for ( int i = 0; i< Name.length; i++){
//            System.out.println(Name[i]);
//        }

//        System.out.println(Name[7]);
    }
}
