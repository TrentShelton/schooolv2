package projects;

public class projectReverseTheArray {
    public static void main(String[] args) {
        String str = "mustafa";
        //            01234
        String str2 = "";
        for(int i = str.length()-1 ;i>=0 ;i--)
        {
            str2+=str.charAt(i);


        }
        System.out.println(str2);

        int[] arr4 = {1,2,3,4,5,};

        int total = 0;
        for(int i = 0 ; i<arr4.length ;i++)
        {
            total+=arr4[i];

        }
        System.out.println(total);


    }
}
