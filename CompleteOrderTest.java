public class CompleteOrderTest {
   public static void main(String[] args) {
   
      //CompleteOrder object
      CompleteOrder myMatrix;
      
      //TEST 1: Checking Complete Order of someUnknownRelation
      int[][] someUnknownRelation = {{0,0,0,1}, 
                                    {1,0,1,0},
                                    {0,0,0,0},
                                    {0,0,0,0}}; 
      
      myMatrix = new CompleteOrder(someUnknownRelation);      
                  
      System.out.println("TEST 1: Checking Complete Order of someUnknownRelation");
      System.out.println("\tReflexive: " + myMatrix.isReflexive());
      System.out.println("\tAnti-Symmetric: " + myMatrix.isAntiSymmetric());
      System.out.println("\tTransitive: " + myMatrix.isTransitive());
      System.out.println("\tComplete Order: " + myMatrix.isCompleteOrder());
      System.out.println();

      
      //TEST 2: Checking Complete Order of someUnknownRelation2
      int[][] someUnknownRelation2 = {{1,0,1,0,0,1},  
                                      {0,1,0,0,0,0},
                                      {0,0,1,0,0,1},
                                      {0,0,0,1,0,0},
                                      {0,1,1,0,1,1},
                                      {0,0,0,0,0,1}};
                        
      myMatrix = new CompleteOrder(someUnknownRelation2);
      
      System.out.println("TEST 2: Checking Complete Order of someUnknownRelation2");
      System.out.println("\tReflexive: " + myMatrix.isReflexive());
      System.out.println("\tAnti-Symmetric: " + myMatrix.isAntiSymmetric());
      System.out.println("\tTransitive: " + myMatrix.isTransitive());
      System.out.println("\tComplete Order: " + myMatrix.isCompleteOrder());
      System.out.println();
                  
      
      //TEST 3: Checking Reflexivity
      System.out.println("TEST 3: Checking Reflexivity"); 
      
      //TEST 3(a): Reflexive
      int[][] reflexive1 = {{1,0,0,0},    
                            {0,1,0,0},
                            {0,0,1,0},
                            {0,0,0,1}};
      
      myMatrix = new CompleteOrder(reflexive1);
      
      System.out.println("\tTEST 3(a)");
      System.out.println("\tReflexive: " + myMatrix.isReflexive());
      System.out.println();
      
      
      //TEST 3(b): Reflexive
      int[][] reflexive2 = {{1,0,1,0},    
                            {0,1,0,0},
                            {1,0,1,0},
                            {0,1,0,1}};
      
      myMatrix = new CompleteOrder(reflexive2);
      
      System.out.println("\tTEST 3(b)");
      System.out.println("\tReflexive: " + myMatrix.isReflexive());
      System.out.println();
      
      //TEST 3(c): Non-Reflexive
      int[][] reflexive3 = {{1,0,0,0},    
                            {0,1,0,0},
                            {0,0,0,0},
                            {0,0,0,1}};
      
      myMatrix = new CompleteOrder(reflexive3);
      
      System.out.println("\tTEST 3(c)");
      System.out.println("\tReflexive: " + myMatrix.isReflexive());
      System.out.println();                          
      
      
      //TEST 4: Checking Transitivity
      System.out.println("TEST 4: Checking Transitivity");
      
      //TEST 4(a): Transitive
      int[][] transitive1 = {{0,1,0,1},    
                             {0,0,0,0},
                             {0,0,0,0},
                             {0,1,0,0}};
      
      myMatrix = new CompleteOrder(transitive1);
      
      System.out.println("\tTEST 4(a)");
      System.out.println("\tTransitive: " + myMatrix.isTransitive());
      System.out.println();
      
      //TEST 4(b): Transitive
      int[][] transitive2 = {{1,0,1,1},    
                             {0,0,0,0},
                             {1,0,1,1},
                             {0,0,0,0}};
      
      myMatrix = new CompleteOrder(transitive2);
      
      System.out.println("\tTEST 4(b)");
      System.out.println("\tTransitive: " + myMatrix.isTransitive());
      System.out.println();
      
      //TEST 4(c): Non-Transitive
      int[][] transitive3 = {{0,1,0,0},    
                             {0,0,0,1},
                             {0,0,0,0},
                             {0,1,0,0}};
      
      myMatrix = new CompleteOrder(transitive3);
      
      System.out.println("\tTEST 4(c)");
      System.out.println("\tTransitive: " + myMatrix.isTransitive());
      System.out.println(); 
      
     
     //TEST 5: Checking Anti-Symmetery
      System.out.println("TEST 5: Checking Anti-Symmetery");

     //TEST 5(a): Anti-Symmetric 
      int[][] antiSymmetery1 = {{1,0,0,0},    
                                {0,1,0,0},
                                {0,0,1,0},
                                {0,0,0,1}};
      
      myMatrix = new CompleteOrder(antiSymmetery1);
      
      System.out.println("\tTEST 5(a)");
      System.out.println("\tAnti-Symmetric: " + myMatrix.isAntiSymmetric());
      System.out.println();
      
      //TEST 5(b): Anti-Symmetric
      int[][] antiSymmetery2 = {{1,0,0,0},    
                                {0,0,0,0},
                                {0,0,0,0},
                                {0,0,0,0}};
      
      myMatrix = new CompleteOrder(antiSymmetery2);
      
      System.out.println("\tTEST 5(b)");
      System.out.println("\tAnti-Symmetric: " + myMatrix.isAntiSymmetric());
      System.out.println();
      
      //TEST 5(c): Non-Anti-Symmetric
      int[][] antiSymmetery3 = {{1,0,1,0},    
                                {0,1,0,0},
                                {1,0,1,0},
                                {0,0,0,1}};
      
      myMatrix = new CompleteOrder(antiSymmetery3);
      
      System.out.println("\tTEST 5(c)");
      System.out.println("\tAnti-Symmetric: " + myMatrix.isAntiSymmetric());
      System.out.println();      
         
   } //end main
} //end class