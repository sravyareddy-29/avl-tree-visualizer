# AVL Tree Visualizer

This project is an interactive AVL Tree visualizer developed to understand how self-balancing binary search trees work in practice.

The backend is written in Java using Spring Boot and handles all AVL tree operations like insertion and balancing.  
The frontend is a simple HTML, CSS, and JavaScript interface that visually represents the tree structure using SVG.

Users can insert multiple values at once, and the tree automatically rebalances itself after every insertion.  
Each node displays its value along with its height and balance factor, which helps in clearly observing AVL properties and rotations.

## Why this project

AVL Trees are often taught theoretically, but visualizing how rotations and balancing actually happen makes the concept much clearer.  
This project was built mainly as a learning exercise to strengthen understanding of:
- AVL insertions
- Height maintenance
- Balance factors
- Tree rotations

## Features

- Insert one or multiple values at a time
- Automatic AVL balancing
- Visual tree layout with connecting edges
- Height and balance factor shown inside each node
- Simple and clean pastel-colored UI
- Reset option to start with a fresh tree

## Tech Stack

- Java
- Spring Boot
- HTML
- CSS
- JavaScript
- SVG for tree rendering

## How it works

- The frontend sends insert requests to the backend API
- The backend updates the AVL tree and returns the root node as JSON
- The frontend reads the JSON and redraws the tree structure dynamically

## How to run

1. Open the project in VS Code
2. Run the Spring Boot application using:
./mvnw spring-boot:run
3. Open the browser and go to:
http://localhost:9090


## Notes

This project is focused on visualization and learning rather than production use.  
It can be extended further with delete operations, animations, or traversal views.

Built for learning and practice.
