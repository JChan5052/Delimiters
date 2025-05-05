import java.util.ArrayList;
public class Delimiters
{
private String openDel;
private String closeDel;

public Delimiters(String open, String close)
{
openDel = open;
closeDel = close;
}
public ArrayList<String> getDelimitersList(String[] tokens){
ArrayList<String> ret=new ArrayList<>();
for (String i : tokens){
if (i.equals(openDel)||i.equals(closeDel)) ret.add(i);
}
return ret;
}
public boolean isBalanced(ArrayList<String> delimiters){
int numOpen=0;
int numClose=0;
for (String i:delimiters){
    if(i.equals(openDel))numOpen++;
    else numClose++;
}
return numOpen==numClose;
}
}