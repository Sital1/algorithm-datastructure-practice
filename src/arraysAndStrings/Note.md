## Amortized Time Complexity
- Algorithm has very bad time complexity once in a while besides the complexity that happens once in a while.
- Example insertion in an arrayList. The complexity for insertion is O(1) when the capacity hasn't reached but can be O(N)
  if the array needs to be doubled.


## Hash Tables

- Datastructures that maps keys to value.

## Common implementation:
- Compute key's hash code.(int or long)
- Map hash code to index in the array. For ex: Hash(key)% arrayLength
- Two key can map to same index. Linked list can be used in this case. 

## ArrayList

- Resizable array. 
- O(1) amortized runtime for insertion. O(N) when the array needs to be doubled.