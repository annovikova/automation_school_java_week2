package edu.ctco.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ? // Protected variable i is in the same package
 *
 * What will be printed out, then fixed ? // Move X to the another package or make i private
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();

      //System.out.println(x.i);

        x.methodOfX(); // Make method methodOfX() not private. Output will be 1221
    }
}