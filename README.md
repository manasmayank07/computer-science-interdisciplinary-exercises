# Computer Science: An Interdisciplinary Approach — Exercises

This repository contains my solutions for selected exercises from **_Computer Science: An Interdisciplinary Approach_** by Robert Sedgewick and Kevin Wayne.

The exercises cover:
- 📏 **Intervals**: basic data types and filtering.
- 📍 **Points**: Euclidean distance in 2D.
- ⚡ **Newton’s Method Chaos**: visualizing fractals with Newton’s method in the complex plane.

---

## 📂 **Contents**

| File | Description |
|------|--------------|
| `Interval.java` | Defines an `Interval` data type with `contains` and `intersects` methods. Includes a client to filter intervals containing a given value. |
| `Point.java` | Defines a `Point` data type with `distanceTo` and `toString`. |
| `Complex.java` | A simple complex number implementation for Newton’s method. |
| `NewtonChaos.java` | Generates a fractal image showing which roots a point converges to under Newton’s method for _z⁴ − 1_. |

---

## 🚀 **How to Compile**

```bash
javac Interval.java Point.java Complex.java NewtonChaos.java
