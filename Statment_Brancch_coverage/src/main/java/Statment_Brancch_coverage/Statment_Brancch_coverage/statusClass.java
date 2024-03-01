package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class statusClass {
    public enum Status {
        gold, silver
    }	
    
    public boolean checkOut(double cart, int creditRating, statusClass.Status status) {
        boolean approved = false;

        if (status == statusClass.Status.gold) {
            if (cart < 3500.00) {
                approved = true;
            } else {
                if (creditRating > 650) {
                    approved = true;
                }
            }
        } else if (status == statusClass.Status.silver) {
            if (cart < 2500.00) {
                approved = true;
            } else {
                if (creditRating > 750) {
                    approved = true;
                }
            }
        } else {
            if (cart < 1500.00) {
                approved = true;
            } else {
                if (creditRating > 800) {
                    approved = true;
                }
            }
        }

        return approved;
    }
}
