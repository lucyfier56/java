package test;

public class SalaryCalculator {
    int basic=10000;

    public int calSal (char grade){
        int basic=10000;
        int finalSalary=0;
        if(grade=='A'){
            finalSalary=basic+(basic*10/100);
        }
        else if(grade=='B'){
            finalSalary=basic+(basic*20/100);
        }

        return finalSalary;
    }


    public int calSal2(int LeaveTaken) {
        int LeaveLeft = 0;
        if (LeaveTaken > 34) {
            return 0;
        } else if (LeaveTaken < 34) {

            LeaveLeft = 34 - LeaveTaken;
            return LeaveLeft;
        }
        return LeaveLeft;
    }
}
