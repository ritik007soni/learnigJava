import java.util.*;

class Stack{

    static int top = 0;
    static int size = 100;
    static int num=0;
    static Object[] St = new Object[size];


    Stack(){
        System.out.println("Enter the size of stack");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }
    

    void push(Object[] St,int ele) throws Exception{
        if(top>=num){
            throw new Exception("Stack overflow");
        }
        else{       
            top++;
            St[top] = ele;
        }
    }

    Object pop(Object[] St) throws Exception{
        if(top==0){
            throw new Exception("Stack is Empty");
        }
        else{
            Object x = St[top];
            St[top] = null;
            top--;
            return x;
        }
    }

    void peek(Object[] St) throws Exception{
        int t = top;
        while(t>0){
            System.out.println(St[t]);
            t--;
        }
    }

    boolean isEmpty(Object[] St){
        if(top == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        Stack obj = new Stack();


        try{
            while(true){

                Scanner sc = new Scanner(System.in);
                System.out.println("Press 1 to push\n Press 2 to pop\n Press 3 to peek\n Press 4 to check if the Stack is empty\n Press 0 to exit: \n");
                int opt = sc.nextInt();
                if(opt == 1){
                    System.out.println("Enter the elemnt to push");
                    int ele = sc.nextInt();
                    obj.push(St,ele);
                }
                else if(opt == 2){
                    Object x = obj.pop(St);
                    System.out.println("Poped element is"+x);
                }
                else if(opt == 3){
                    obj.peek(St);
                }
                else if(opt == 4){
                    boolean empty = obj.isEmpty(St);
                    System.out.println(empty);
                }
                else{
                    break;
                }

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}