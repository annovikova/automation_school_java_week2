package edu.ctco.school.exercise6.pack2;

import edu.ctco.school.exercise6.pack1.A;

/**
 * Why we can't instantiate class A, even it has public constructor ? // Class A not public
 *
 * How to fix it ? // Make class A as public or move to the pack1
 */
class B
{
    A a = new A();       //Compile Time Error
}
