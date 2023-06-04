import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<Integer>();
        st.add(34);
        st.add(34);
        st.push(345);
        st.push(4);
        st.pop();
    
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());

    }
}
