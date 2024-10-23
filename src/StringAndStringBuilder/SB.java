package StringAndStringBuilder;

public class SB
{
    public static void main(String[] args) {
        StringBuilder buider = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            buider.append(ch+" ");
        }
        StringBuilder gsf= new StringBuilder();
        gsf.append("kunal");



        System.out.println(buider.toString());
        buider.deleteCharAt(0);
        System.out.println(buider.toString());
        buider.reverse();
        System.out.println(buider.toString());
    }
}
