import java.util.Stack;

/***
 * 
 * @author Aniket Khaire
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. Each operand may be an integer or another expression. For example:

  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 */
public class ExpressionEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] expression = new String[] {"5", "2", "1", "+", "3", "*"};
		System.out.println(evaluateExpression(expression));
	}

	public static int evaluateExpression(String[] expression){
		int result = 0;
		String operators = "+-*/";
		Stack <String> st = new Stack<String>();
		
		for(String token : expression){
			if(operators.contains(token)){
				int num1 = Integer.valueOf(st.pop());
				int num2 = Integer.valueOf(st.pop());
				int index = operators.indexOf(token);
				
				switch(index){
					case 0:	st.push(String.valueOf(num1+num2));
							break;
					case 1:	st.push(String.valueOf(num1-num2));
							break;
					case 2:	st.push(String.valueOf(num1*num2));
							break;
					case 3:	st.push(String.valueOf(num2/num1));
							break;
				}
			}else{
				st.push(token);
			}
		}
		
		if(st.size() != 1)
			return -1;
		
		result = Integer.valueOf(st.pop());
		return result;
	}
}
