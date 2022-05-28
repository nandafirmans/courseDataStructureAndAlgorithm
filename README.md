_This project is totorial from Mosh Hamedani: [The Ultimate Data Structures & Algorithms Course](https://codewithmosh.com/p/data-structures-algorithms)_

# Big O Notation

_Big O Notation to describe the performance of algorithm._

**We use Big O to describe the performance of an algorithm, and this helps us to determine if an given algorithmn
scalable or not. Which basically means <mark>is an algorithm going to scale well as the input grows really
large.</mark>**

So just because your code execute quickly doesn't mean it's going to perform well when you give it a large data set. So
that's why we use the Big O Notation to describe the performance of an algorithm

-   ### **O(1)**

    Here's the first example. The method below takes an array of an integers and print the first item on the console. It
    doesn't matter how big the array is, we can have one or million items. All this method doing is printing the first
    item.

    So this method has single operation, and takes a constant amount of time to run. You don't have to worry about the
    exact execution time in milliseconds, because that can be different from one machine to another or even on the same
    machine. <mark>All we care about is that this method runs in constant time,</mark> and we represent it using
    the <mark>Big O of 1 or `O(1)`</mark>.

    ```java
    public void log(int[] numbers) {
      // O(1)
      System.out.println(numbers[0]); // O(1)
    }
    ```

    Below here we have two operations, both of these operations run in constant time, so the runtime complexity of the
    method is O(2). But, when talking about runtime complexity we don't really care about number of operations, we just
    want to know how much an algorithm slows down as the input grows larger. So in example code below, whether we have
    one or million items of `int[] numbers`, our method runs in constant time. So we can simplify the O(2) to become O(
    1).

    ```java
    public void log(int[] numbers) {
      // O(1 + 1) ➡ O(2) ➡ simplify ➡ O(1)
      System.out.println(numbers[0]); // O(1)
      System.out.println(numbers[0]); // O(1)
    }
    ```

-   ### **O(n)**

    Here we have slightly more complex example. So we iterating over the items of array `int[] numbers`, and printing
    each item on the console.

    This is where the size of the input matters. if you have a single item in this array `int[] numbers` you're going to
    have one print operation. If you have a million items, obviously you'll have a million print operations.

    So the cost of this algorithm grows linearly and in direct correlation to the size of the input. So we represent the
    runtime complexity of this method, using <mark>Big O of n or `O(n)`, where `n` represent the input</mark>.So as `n`
    grows, the cost of this algorithm also <mark>grows linearly</mark>.

    ```java
      public void log(int[] numbers) {
        // O(n)
        for (int number: numbers) // O(n)
          System.out.println(number);
      }
    ```

    What if we have print before and after loop. However when using the Big O Notation, we drop the constant because
    that doesn't matter. Here's the reason, if the array `int[] numbers` have million items, adding two extra operations
    doesn't really have a significant input on the cost of our algorithm. The cost of our algorithm still increases
    linearly, so we can simplify this by dropping the constant.

    ```java
     public void log(int[] numbers) {
       // O(1 + n + 1) ➡ simplify ➡ O(2 + n) ➡ drop the constant ➡ O(n)

       System.out.println(numbers[0]); // O(1)

       for (int number : numbers) // O(n)
         System.out.println(number);

       System.out.println(numbers[0]); // O(1)
     }
    ```

    What if we have multiple loops. This is another example why we drop the constant, because all we need here is an
    approximation of the cost of this algorithm relative to it's input size. <mark>So `n` or `2n`, still represent a
    linear grows</mark>.

    ```java
     public void log(int[] numbers) {
       // O(n + n) or O(2n) ➡ simplify ➡ O(n)

       for (int number : numbers) // O(n)
         System.out.println(number);

       for (int number : numbers) // O(n)
         System.out.println(number);
     }
    ```

    What if we have a two inputs. Both this loops run in `O(n)`, we have to make differences because the inputs, numbers
    and names. So we need to distinguish each between these two inputs. We could use `n` for the size of the first input
    and `m` for the size of the second input. So the complexity of the method is `O(n + m)`. And once again we
    can <mark>simplify this to `O(n)` because the runtime of this method grows linearly</mark>.

    ```java
     public void log(int[] numbers, String[] names) {
       // O(n + m) ➡ simplify ➡ O(n)

       for (int number : numbers) // O(n)
         System.out.println(number);

       for (String name : names) // O(m)
         System.out.println(name);
     }
    ```

-   ### **O(n^2)**

    Below we have nested loops. This is the algorithm that we use for printing combinations items in an array. So we
    need to use the runtime complexity here, well let's find out..

    In outter loop, we iterating over input array `int[] numbers`, so here we have `O(n)`. Now each iteration, once
    again iterating over all the items in array `int[] numbers` another example of `O(n)`. So the runtime complexity of
    the method below is `O(n*n)` or `O(n^2)`

    ![diagram-1](https://snipboard.io/ubwaSo.jpg)

    We say <mark>this algorithm runs in quadratic time.</mark> As you can see in this diagram above. Algorithms that run
    in the `O(n^2)`, is slower than algorithms that run in `O(n)`. And of course this depends on the size of the input.

    ```java
     public void log(int[] numbers) {
       // O(n * n) or O(n ^ 2)

       for (int first : numbers) // O(n)
         for (int second : numbers) // O(n)
           System.out.println(first + ", " + second);
     }
    ```

    What if we have another loop before or after this loop. The `n^2` number is always greater than `n`, So in this
    expression `O(n+n^2)`, `n^2` is always grows faster than `n`, so here we can drop `n`, and conclude that this method
    below runs in `O(n^2)`.

    ```java
     public void log(int[] numbers) {
       // O(n + n ^ 2) ➡ simplify ➡ O(n ^ 2)

       for (int number : numbers) // O(n)
         System.out.println(number);

       for (int first : numbers) // O(n)
         for (int second : numbers) // O(n)
           System.out.println(first + ", " + second);
     }
    ```

    What if we had another nested another nested loop just like example below. The runtime complexity is now `O(n^3)`.
    As you can imagine, this algorithm gets far more slower than `O(n^2)`.

    ```java
     public void log(int[] numbers) {
       // O(n ^ 3)

       for (int first : numbers) // O(n)
         for (int second : numbers) // O(n)
           for (int third : numbers) // O(n)
             System.out.println(first + ", " + second + ", " + third);
     }
    ```

-   ### **O(log n)**

    Another growth rate we're going to talk about is logarithmic growth, with big O of log n. Here's the logatrithmic
    curve, now compare with linear curve.

    As you can see the linear grows at the same rate, but the logarithmic curve slows down at the some point. So
    algorithm thats run in logarithmic time is more efficient and more scalable.

    ![diagram-2](https://snipboard.io/kwLK0n.jpg)

    Let's say we have an array of sorted numbers from one to ten, and we wan't to find the number 10. we have two
    example here, linear search and binary search:

    -   Linear Search This is called linear search because it's run in linear time. In the worst case scenario, if the
        number we're looking for is at the end of an array we have to inspect every cell in this array to find a target
        number. The more array we have the longer this operation going to take the run time of this algorithm increases
        linearly and in direct proportion with the size of the input array.

        ![linear search](https://i.imgur.com/4Fd3nom.gif)

    -   Binary Search This algorithm run in logarithmic time. It's much faster than linear search. Assuming the array
        sorted we start off by looking the middle item. is this smaller or greater by the value we looking for? in this
        case our target number is 10, in every step we search by narrowing down by half.

        ![binary search](https://i.imgur.com/KhMx9iT.gif)

-   ### **O(2^n)**

    The Exponential growth it's the opposite of logarithmic growth, algorithm that runs in exponential time it's not
    scalable at all it will become very slow very soon.

    ![diagram-3](https://snipboard.io/GOHliI.jpg)

-   ### **Summary Diagram**
    ![summary-diagram](https://snipboard.io/J4qYKl.jpg)

<br/>
<br/>
<br/>

# Array

Array are the simplest data structures, and we use them to store a list of item like a list of numbers, string, object and literally anything. this item stored sequentially on the memory.
<br/>
<br/>
<br/>

# Linked list

Linked lists are probably the most commonly used data structures after array. We used linked lists to store a list of an objects in sequence. linked lists consists of a group of nodes in a sequences. Each nodes holds 2 pieces of data, one is a value and other is the address of the next node in the list. So we say each node points to or references the next node.
<br/>
<br/>
<br/>

# Array vs Linked list

Space

-   Static arrays have a fix size
-   Dynamic arrays grow by 50 - 100% (there are waste memory)
-   Linked lists don't waste memory
-   Use arrays if you know the numbers of items to store

<br/>

|       Action |      Arrays       |   Linked Lists    |
| -----------: | :---------------: | :---------------: |
|              |    **Lookup**     |                   |
|     by Index | <mark>O(1)</mark> |       O(n)        |
|     by Value |       O(n)        |       O(n)        |
|              |    **Insert**     |                   |
| Begining/End |       O(n)        | <mark>O(1)</mark> |
|       Middle |       O(n)        |       O(n)        |
|              |    **Delete**     |                   |
|     Begining |       O(n)        | <mark>O(1)</mark> |
|       Middle |       O(n)        |       O(n)        |
|          End |       O(n)        |       O(n)        |
