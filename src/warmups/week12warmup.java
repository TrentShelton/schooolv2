// String[] emails = {"aaaa@gmail.com", "bbbbb@yahoo.com", "ccccc@hotmail.com", "dddd@outlook.com", "eeee@yahoo.com", "ffff@hotmail.com", "gggg@outlook.com"}
//
//--print all email addresses only contains gmail
//
//--print email addresses excluding gmail addresses
//
//--print only username part of the email (before @)

// we need to make a for loop to print each value
// then make an if statement to check if it contains gmail
package warmups;

public class week12warmup
{
    public static void main(String[] args)
    {
        String[] emails = {"aaaa@gmail.com", "bbbbb@yahoo.com", "ccccc@hotmail.com", "dddd@outlook.com", "eeee@yahoo.com", "ffff@hotmail.com", "gggg@outlook.com" };

        for (String email : emails) {
            if (email.contains("gmail")) {
                System.out.println("contains gmail " + email);
            } else {
                System.out.println("not contains gmail " + email);
            }
        }

    }
}
