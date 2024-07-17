package com.utkarshrathore.app.hd.dsa._003_arrays;

public class _022_Min_Cost_Of_Removing_Elements {
    // Given an array of N elements. In each step, you can remove an element from the array. The
    // cost of removing an element is the sum of elements in the array (before removal).
    // Find the minimum cost of removing all elements.
    public static void main(String[] args) {
        // ar = [a, b, c, d], removing a, cost = a+b+c+d
        // ar = [b, c, d], removing b, cost = b+c+d
        // ar = [c, d], removing c, cost = c+d
        // ar = [d], removing d, cost = d
        // total cost = (a+b+c+d) + (b+c+d) + (c+d) + (d) = a + 2b + 3c + 4d
        // For the total cost to be minimum, (a + 2b + 3c + 4d) should be minimum,
        // this can be achieved by having d < c < b < a in this order
        // after sorting the input, 
    }
}
