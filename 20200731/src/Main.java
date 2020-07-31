import java.util.*;
public class Main {
    //Insert one char from stringstream
    //数组存储每个字符出现的次数
    char [] cn = new char[256];
    StringBuffer sb = new StringBuffer();
    public void Insert(char ch)
    {
        ++cn[ch];
        sb.append(ch+"");
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char [] t = sb.toString().toCharArray();
        for(int i=0;i<t.length;i++){
            if(cn[t[i]]==1){
                return t[i];
            }
        }
        return '#';
    }
}
