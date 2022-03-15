/**
* A class containing methods to check transitivity, reflexivity,
* and anti-symmetery of a relation in a given matrix. It subsequently 
* checks if the relation is a total ordered relation or not. 
*
* @author Ishita Kakkar
* @version 3.0
*/
public class CompleteOrder {

  
  /**
  * Instance variable matrix stores the reference 
  * of a user assigned matrix. 
  */
  private int[][] matrix;
   
   
   /**
   * Constructor initialises the instance variable matrix
   * with the the reference of a user assigned matrix. 
   * @param userMatrix reference of a user assigned matrix
   */ 
   public CompleteOrder(int[][] userMatrix) {
      matrix = userMatrix;
   }
 
   
   /**
   * Checks if the relation in the given relation is transitive or not
   * @return boolean true, if the relation is transitive. Boolean false, if the relation is non-transitive. 
   */
   public boolean isTransitive() {
      
      //If there is no test to begin with, the definition of transitivity is not violated.
      //So, the realtion will be ruled as an transitivity one by default.
      boolean resultTransitive = true;
      
      checkForTransitivity:   //Referenced from Oracle's Java Documentation -- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            for (int k = 0; k < matrix[i].length; k++) {
               if ((matrix[i][j] == 1) && (matrix[j][k] == 1)) {
                  if (matrix[i][k] != 1) {
                     resultTransitive = false;
                     break checkForTransitivity;
                  }
                  else {
                     resultTransitive = true;
                  }
               }
            }
         }
      }
      return resultTransitive;
   }

   
   /**
   * Checks if the relation in the given relation is reflexive or not
   * @return boolean true, if the relation is reflexive. Boolean false, if the relation is non-reflexive. 
   */
   public boolean isReflexive() {
      boolean resultReflexive = false;
      
      checkForReflexive:   //Referenced from Oracle's Java Documentation -- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if ((i == j) && (matrix[i][j] != 1)) {
               resultReflexive = false;
               break checkForReflexive;
            }   
            else {
               resultReflexive = true;
            }
         }
      }
      return resultReflexive;
   }
   
   
   /**
   * Checks if the relation in the given relation is anti-symmetric or not
   * @return boolean true, if the relation is anti-symmetric. Boolean false, if the relation is non-anti-symmetric. 
   */
   public boolean isAntiSymmetric() {
      
      //If there is no test to begin with, the definition of anti-symmetery is not violated.
      //So, the realtion will be ruled as an anti-symmetric one by default.
      boolean resultAntiSymmetric = true;
      
      checkForAntiSymmetery:  //Referenced from Oracle's Java Documentation -- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if ((matrix[i][j] == 1) && (matrix[j][i] == 1)) {
               if (i == j) {
                  resultAntiSymmetric = true;
               }
               else {
                  resultAntiSymmetric = false;
                  break checkForAntiSymmetery;
               }   
            }
         }
      }
      return resultAntiSymmetric;
   } 
     
      
   /**
   * Checks if the relation in the given matrix is a complete order relation.
   * If the relation satisfies the transitivity, reflexivity and anti-symmetery tests, 
   * it will be a complete order relation. 
   * @return boolean true, if the relation is a complete order relation. Boolean false, if the relation is not a complete order relation.  
   */
   public boolean isCompleteOrder() {
      boolean resultCompleteOrder = false;
      if ((isTransitive()) && (isReflexive()) && (isAntiSymmetric())) {
         resultCompleteOrder = true;
      }
      return resultCompleteOrder;
   }

} //end class

