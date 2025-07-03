package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	int retryCount = 0;
	int maxRetryCount = 1;
	
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(retryCount<maxRetryCount) {
			System.out.println("Retrying the test "+result.getName()+" with "+getResultStatusName(result.getStatus()));
			retryCount++;
			return true;
		}
		
		return false;
	}
	
	public String getResultStatusName(int status) {
		String result = null;
		if(status == 1) {
			result = "SUCCESS";
		}
		if(status == 2) {
			result = "FAILURE";
		}
		if(status == 3) {
			result = "SKIP";
		}
		
		return result;
	}

}
