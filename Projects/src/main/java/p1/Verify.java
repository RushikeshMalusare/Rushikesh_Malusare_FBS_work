package p1;

import java.time.LocalDate;

public class Verify {
//	public boolean verifyDetail(int cno,String cHoldernm,int cvv,LocalDate expDate ) {
//		CardValidConnectivity cv=new CardDatabaseConnectivity();
//		return cv.isCardValid(cno,cHoldernm,cvv,expDate);
//	}

	public boolean verifyDetail(String cno, String cHoldernm, String cvv, String expDate) {
		// TODO Auto-generated method stub
		CardValidConnectivity cv=new CardDatabaseConnectivity();
		return cv.isCardValid(cno,cHoldernm,cvv,expDate);
	
	}

//	public boolean verifyDetail(String cno, String cHoldernm, String cvv, String expDate) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	public boolean verifyDetail(String cno, String cHoldernm, String cvv, LocalDate expDate) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
