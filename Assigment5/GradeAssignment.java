public class GradeAssignment {
    public static void main(String[] args) {
               assignGrade("Alice", 85); // valid grade
               assignGrade("Bob", -5); // invalid grade (below 0)
               assignGrade("Charlie", 105); // invalid grade (above 100)
            }
          public static void assignGrade(String studentName, int grade) {
               try {
                       if (grade < 0 || grade > 100) {
                                throw new IllegalArgumentException("Invalid grade. It should be between 0 and 100.");
                          }
                        System.out.println(studentName + " has been assigned a grade of " + grade + ".");
                   } catch (IllegalArgumentException e) {
                       System.err.println("Error: " + e.getMessage());
                    } finally {
                       System.out.println("Grade assignment attempt for " + studentName + " has been completed.");
                   }

}

}
