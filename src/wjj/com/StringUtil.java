package wjj.com;

/**
 * Created by Administrator on 2020/5/21.
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        if("".equals(str)||str==null) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean isNotEmpty(String str){
        if(!"".equals(str) && str!=null) {
            return true;
        }else {
            return false;
        }
    }
}
