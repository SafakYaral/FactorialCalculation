
public class faktoriyelHesaplamaTest {
	
    
    public double faktoriyelGetir(int sayi) {
    	double faktoriyel = 1;
    	
    	for(int i=1;i<=sayi;) {
    		i = i+ 1;
    		if(i <= sayi) {
    			faktoriyel *= i;
    		} else {
    			break;
    		}
    		
    	}	
    	
    	return faktoriyel;
    }
}
