/**
 * @name char_5
 * @description: 替换空格
 * @author: yxq
 * @create: 2019-05-22 14:27
 **/
public class char_5 {
    public String replaceSpace(StringBuffer str) {
        if(str == null) return null;
        StringBuffer strnew = new StringBuffer();
        for (int i = 0; i<str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals(" ")){
                strnew.append("%20");
            }else{
                strnew.append(str.charAt(i));
            }
        }
        return strnew.toString();
    }
    public static void main(String args[]){
        StringBuffer str = new StringBuffer("We are Happy");
        char_5 c5 = new char_5();
        String strnew = c5.replaceSpace(str);
        System.out.print(strnew);
    }
}
