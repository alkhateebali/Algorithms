import com.devbyali.graph.Graph;
import com.devbyali.sort.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        BubbleSort bubbleSort = new BubbleSort();
//        SelectionSort selectionSort = new SelectionSort();
//        InsertionSort insertionSort = new InsertionSort();
//        MergeSort mergeSort = new MergeSort();
//        QuickSort quickSort = new QuickSort();
//        int[] array = {8, 2, 4, 1, 3};

        // graph
        Graph graph = new Graph();
        graph.addNode("a");
        graph.addNode("b");
        graph.addNode("c");
        graph.addNode("d");
        graph.addNode("e");
        graph.addNode("f");

        graph.addEdge("a", "c");
        graph.addEdge("a", "b");
        graph.addEdge("b", "d");
        graph.addEdge("c", "e");
        graph.addEdge("e", "b");
        graph.addEdge("f", "d");
        //graph.print();
        graph.traverseDepthFirst("a");


    }


}

