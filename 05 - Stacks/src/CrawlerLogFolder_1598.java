import java.util.Stack;

public class CrawlerLogFolder_1598 {
    public static int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();
        for(String log : logs){
            if(log.equals("../")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else if(!log.equals("./")){
                s.push(log);
            }
        }
        int op = 0;
        while(!s.isEmpty()){
            s.pop();
            op++;
        }
        return op;
    }

    public static void main(String[] args){
        String[] s = {"d1/","d2/","../","../","../","./"};
        System.out.println(minOperations(s));
    }
}
