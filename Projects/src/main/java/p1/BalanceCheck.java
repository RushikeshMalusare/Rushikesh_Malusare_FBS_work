package p1;

public class BalanceCheck {
	public boolean checkBalance(int cno,int rqtAmt) {
		BalanceExist connectivity=new CardDatabaseConnectivity();
			if(rqtAmt<=connectivity.AvailableAmt(cno)) {
				return true;
				
			}
			return false;
		}
	}

