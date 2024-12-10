# Function to Calculate the Average of the First `k` Elements of an Integer List

This function computes the average of the first `k` elements of an integer array `list`. The function ensures that:
- The computation does not exceed the actual length of the array.
- If `k` is larger than the size of the list, only the available elements are used.
- If the array is empty or `k` is less than or equal to 0, the function returns 0.

---

## **Functional Test Cases**

| **Case**                              | **Input**                     | **Expected Output** |
|---------------------------------------|-------------------------------|---------------------|
| Normal input with `k < list.length`   | `k = 3, list = [1, 2, 3, 4, 5]` | `2`                |
| `k` greater than the length of the list | `k = 6, list = [2, 4, 6]`     | `4`                |
| Empty list                            | `k = 3, list = []`            | `0`                |
| `k = 0`                               | `k = 0, list = [5, 10, 15]`   | `0`                |
| `k` is negative                       | `k = -2, list = [1, 2, 3]`    | `0`                |

---

## **Partitions**

### **Partition Scenarios**
1. **Size of list**:
   - Empty
   - Smaller than `k`
   - Equal to `k`
   - Larger than `k`

2. **Value of `k`**:
   - Zero
   - Positive
   - Negative

3. **Element values in list**:
   - All positive
   - All negative
   - Mix of positive and negative

### **Partition Test Cases**

| **Case**                  | **Input**                     | **Expected Output** |
|---------------------------|-------------------------------|---------------------|
| Empty list                | `k = 3, list = []`            | `0`                |
| `k = 0`                   | `k = 0, list = [5, 10]`       | `0`                |
| `k > list.length`         | `k = 6, list = [2, 4, 6]`     | `4`                |
| `k < list.length`         | `k = 2, list = [2, 4, 6]`     | `3`                |
| All positive elements     | `k = 3, list = [2, 4, 6]`     | `4`                |
| All negative elements     | `k = 3, list = [-1, -2, -3]`  | `-2`               |
| Mix of positive/negative  | `k = 2, list = [1, -2, 3]`    | `-0.5`             |

---

## **Boundary Test Cases**

| **Case**                   | **Input**                    | **Expected Output** |
|----------------------------|------------------------------|---------------------|
| `k = 0`                    | `k = 0, list = [5, 10]`      | `0`                |
| `k = 1`                    | `k = 1, list = [10]`         | `10`               |
| `k = list.length`          | `k = 3, list = [5, 5, 5]`    | `5`                |
| `k = list.length + 1`      | `k = 3, list = [5, 5]`       | `5`                |
| `k = -1`                   | `k = -1, list = [5, 5]`      | `0`                |
