public class Main {
    public static void main(String[] args) {
    Delimiters testcase=new Delimiters("(",")");
    String[] sentence=new String[6];
    sentence[0]="(";
    sentence[1]="I";
    sentence[2]="like";
    sentence[3]="to";
    sentence[4]="run";
    sentence[5]=")";
    System.out.println(testcase.isBalanced(testcase.getDelimitersList(sentence)));
    }
}