# Graph Traversal Algorithms

This project implements Depth-First Search (DFS) and Breadth-First Search (BFS) for graph traversal.

## Depth-First Search (DFS)

1. Start at a node and mark it as visited.
2. Explore as deeply as possible along each branch before backtracking.
3. Backtrack to the previous node and explore its unvisited neighbors.
4. Repeat steps 2-3 until all reachable nodes are visited.

## Breadth-First Search (BFS)

1. Start at a node and mark it as visited.
2. Visit all neighbors of the current node before moving on to their neighbors.
3. Maintain a queue to keep track of the order of nodes to visit.
4. Enqueue neighbors and dequeue the current node after visiting its neighbors.
5. Repeat steps 2-4 until all reachable nodes are visited.
