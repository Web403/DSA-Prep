// * * * * * * * * 
// *             *
// *             *
// * * * * * * * *

package ApnaCollege.Patterns;

class HollowRectangle {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 7) {
                    System.out.print("* ");
                }else if (j == 0 || j == 3) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}