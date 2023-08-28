
package class4;

import java.util.*;

public class 자릿수더하기 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i = 9 ; i>=0 ; i--){
	            int divideNum = (int)Math.pow(10,i);
	            int res = n/divideNum;
	            answer += res;
	            n = n%divideNum;
	            
	        }
	        
	        return answer;
	    }
}
