package edu.ctco.school.exercise2;

/**
 * Does field 'i' of Class Exercise2 be inherited to Class SubExercise2 in the below code? // With private i not possible
 *
 * What are the options in this particular case? // i should be protected, package protected or public. Or SubExercise2 should be Inner Class
 */
class Exercise2 {
    public int i; // Changed from private to public

}

class SubExercise2 extends Exercise2 {
    public void printI() {
        System.out.println(i);
    }
}
