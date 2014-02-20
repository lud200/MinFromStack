package MinFromStack;
import java.util.*;
import java.io.*;
public class MinFromStack {
	public static void main(String[] args){
		stack s=new stack();
		s.push(4);
		s.push(5);
		s.push(1);
		s.push(7);
		System.out.println("Minimum Element is:"+s.min());
	}
}
class stack extends Stack<Integer>{
	Stack<Integer> s;
	public stack(){
		s=new Stack<Integer>();
	}
	public void push(int val){
		if(val<=min()){
			s.push(val);
		}
		super.push(val);
	}
	public Integer pop(){
		int val=super.pop();
		if(val==min()){
			s.pop();
		}
		return val;
	}
	public int min(){
		if(s.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return s.peek();
		}
	}
}
