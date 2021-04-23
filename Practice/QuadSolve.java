package Practice;
class QuadEq 
{
    QuadEq(int coXSq, int coX, int c)
    {// local variable
        this.coXSq = coXSq;
        this.coX = coX;
        this.c = c;
    }
    // Instance Variable
    int coXSq;
    int coX;
    int c;

    int r1;
    int r2;
}

public class QuadSolve {
    public static void main(String[] args) {
        int coXSq = 1;
        int coX = -5;
        int c = 6;

        QuadEq eq1 = new QuadEq(coXSq, coX, c);

        eq1 = findRoots(eq1);


        System.out.println(addPlusSignIfGtThanZero(coXSq)+"X^2" +
                addPlusSignIfGtThanZero(coX) +"X" +  addPlusSignIfGtThanZero(c));
        System.out.println(addPlusSignIfGtThanZero(coXSq)+"X^2" +
                "("+ eq1.r1 +""+ addPlusSignIfGtThanZero(eq1.r2)  +")" +"X" +  addPlusSignIfGtThanZero(c));
        System.out.println(addPlusSignIfGtThanZero(coXSq)+"X^2" +
                eq1.r1 +"X" + eq1.r2 +"X" +  addPlusSignIfGtThanZero(c));
    }

    static QuadEq findRoots(QuadEq eq1) 
    {
        int discri=(eq1.coX*eq1.coX - 4*eq1.coXSq*eq1.c);
        if(discri > 0) {
            eq1.r1 = (int) (-eq1.coX + (Math.sqrt(discri))) / 2 * eq1.coXSq;
            eq1.r2 = (int) (-eq1.coX - (Math.sqrt(discri))) / 2 * eq1.coXSq;
        } else if (discri == 0) {
            eq1.r1 = eq1.r2 = -eq1.coX/2*eq1.coXSq;
        }
        return eq1;
    }

    static String addPlusSignIfGtThanZero(int val) {
        if(val >= 0){
            return "+"+val;
        } else {
            return ""+val;
        }
    }
}