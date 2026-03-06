# minMAX-Sorting-Algorithm
*AKA “Two Birds, One Stone”*

Introduction
------------------------------
The minMAX sorting algorithm is one of my hobby CS experiments. My first goal in creating this algorithm was to improve the performance of basic O(n<sup>2</sup>) sorting algorithms like Bubble, Selection, and Insertion. This algorithm is the successor of handSort, my first sorting algorithm from scratch. It turns out that minMAX is related to Gnome sort: faster in some cases, but slower than Bubble sort in others.


Method & Pseudocode
------------------------------
The minMAX algorithm was inspired by parallel processing. It compares the minimum and maximum integers simultaneously in the unsorted portion of an array, reducing the number of steps required to sort an array of n elements.

loop i from 0 to n/2:
    loop j from i to n - i:
        find min integer position
        find max integer position
    swap min to array(i)
    swap max to array(n - i)


Analysis
------------------------------
The performance of the minMAX algorithm is remarkably fast compared to other O(n^2) sorting algorithms. It roughly halves the number of comparisons by placing both the minimum and maximum in their correct positions during each pass.


Algorithm Table
---------------
Algorithm       | Best Case Comparisons | Worst Case Comparisons | Average Comparisons | Swaps/Shifts | Stable | Notes
----------------|---------------------|----------------------|-------------------|--------------|--------|---------------------------------------
minMAX          | ~0.25 × n<sup>2</sup>        | ~0.25 × n<sup>2</sup>          | 0.25 × n<sup>2</sup>        | Few          | Yes*   | *Finds min & max per pass, fewer comparisons.*
Insertion Sort  | n-1                  | 0.5 × n<sup>2</sup>            | 0.25–0.5 × n<sup>2</sup>   | Few          | Yes    | *Very fast for nearly sorted arrays.*
Bubble Sort     | n-1                  | 0.5 × n<sup>2</sup>           | 0.5 × n<sup>2</sup>         | Many         | Yes    | *Simple, stable.*
Selection Sort  | 0.5 × n<sup>2</sup>            | 0.5 × n<sup>2</sup>           | 0.5 × n<sup>2</sup>         | Minimal      | No     | *Finds min each pass.*

Benchmark (1000 Numbers)
------------------------
Algorithm       | Comparisons (steps) | Runtime (ms)
----------------|-------------------|--------------
minMAXSort      | 250,500           | 3
InsertionSort   | 250,187           | 2
SelectionSort   | 499,500           | 3
BubbleSort      | 499,500           | 7

Why minMAX Shines
-----------------
- Fewer comparisons: roughly half the work of Bubble and Selection.
- Dual-ended sorting: finds both min and max per pass.
- Predictable performance: consistently ~0.25 × n<sup>2</sup> comparisons.
- In-place and mostly stable: doesn’t require extra memory.

Usage Snippet
-----
import JEnghog.BlackBeans.Utility.minMAX;

public class Main {
    public static void main(String[] args) {
        int[] x = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        minMAX.sort(x);
    }
}
// arr is now sorted

License
-----
BlackBeans minMAX Sort 1.12j Stable
                        
Copyright (c) 2025 Jod Enghog
All Rights Reserved.

This software is proprietary. You may use it only under the terms
of the license agreement. Redistribution, modification, or public use
without explicit permission is prohibited.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND.
